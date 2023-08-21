package com.example.pizaria_stackmobile.adapter

/**
 *  Objetivo do adpter:
onCreateViewHolder(): RecyclerView chama esse método sempre que precisa criar um novo ViewHolder. O método cria e inicializa o ViewHolder e a View associada, mas não preenche o conteúdo da visualização. O ViewHolder ainda não foi vinculado a dados específicos.

onBindViewHolder(): RecyclerView chama esse método para associar um ViewHolder aos dados. O método busca os dados apropriados e usa esses dados para preencher o layout do fixador de visualização. Por exemplo, se a RecyclerView exibir uma lista de nomes, o método poderá encontrar o nome apropriado na lista e preencher o widget TextView do fixador de visualização.

getItemCount(): a RecyclerView chama esse método para ver o tamanho do conjunto de dados. Por exemplo, em um app de lista de endereços, pode ser o número total de endereços. O RecyclerView usa essa função para determinar quando não há mais itens a serem exibidos.
 */

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizaria_stackmobile.ProductDetails
import com.example.pizaria_stackmobile.databinding.ProductItemBinding
import com.example.pizaria_stackmobile.model.Product

class ProductAdapter(private val context: Context, private val productList: MutableList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val listitem = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProductViewHolder(listitem)
    }

    override fun getItemCount() = productList.size


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.imgProduct.setBackgroundResource(productList[position].imgProduct)
        holder.name.text = productList[position].name
        holder.price.text = productList[position].price

        //event Click
        holder.btnAdd.setOnClickListener{
            val intent = Intent(context, ProductDetails::class.java)
            intent.putExtra("imgProduct", productList[position].imgProduct)
            intent.putExtra("name", productList[position].name)
            intent.putExtra("price", productList[position].price)
            context.startActivity(intent)
        }
    }

    inner class ProductViewHolder(binding: ProductItemBinding): RecyclerView.ViewHolder(binding.root){
        val imgProduct = binding.imgProduct
        val name = binding.txtName
        val price = binding.txtPrice
        val btnAdd = binding.btnAdd
    }

}