package com.example.pizaria_stackmobile

import android.annotation.SuppressLint
import android.graphics.Color
import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pizaria_stackmobile.adapter.ProductAdapter
import com.example.pizaria_stackmobile.databinding.ActivityMainBinding
import com.example.pizaria_stackmobile.listitems.Products
import com.example.pizaria_stackmobile.model.Product
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectIndexed
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var productAdapter: ProductAdapter
    private val produtcs = Products()
    private val productList: MutableList<Product> = mutableListOf()
    var clicked = false


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#E0E0E0")
        CoroutineScope(Dispatchers.IO).launch {
            produtcs.getProducts().collectIndexed { index, value ->
                for (p: Product in value) {
                    productList.add(p)
                }
            }
        }

        val recyclerViewProducts = binding.rvProducts
        recyclerViewProducts.layoutManager = GridLayoutManager(this, 2)
        recyclerViewProducts.setHasFixedSize(true)
        productAdapter = ProductAdapter(this, productList)
        recyclerViewProducts.adapter = productAdapter


        binding.btnAll.setOnClickListener {
            clicked = true
            if (clicked)
                binding.btnAll.setBackgroundResource(R.drawable.bg_button_enabled)
            binding.btnAll.setTextColor(Color.WHITE)
            binding.btnChicken.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnChicken.setTextColor(R.color.dark_gray)
            binding.btnPizza.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnPizza.setTextColor(R.color.dark_gray)
            binding.btnKebab.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnKebab.setTextColor(R.color.dark_gray)
            binding.rvProducts.visibility = View.INVISIBLE
            binding.txtListTit.text = "All"
        }


        binding.btnChicken.setOnClickListener {
            clicked = true
            if (clicked)
                binding.btnChicken.setBackgroundResource(R.drawable.bg_button_enabled)
            binding.btnChicken.setTextColor(Color.WHITE)
            binding.btnAll.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnAll.setTextColor(R.color.dark_gray)
            binding.btnPizza.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnPizza.setTextColor(R.color.dark_gray)
            binding.btnKebab.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnKebab.setTextColor(R.color.dark_gray)
            binding.rvProducts.visibility = View.INVISIBLE
            binding.txtListTit.text = "Chicken"
        }


        binding.btnPizza.setOnClickListener {
            clicked = true
            if (clicked)
                binding.btnPizza.setBackgroundResource(R.drawable.bg_button_enabled)
            binding.btnPizza.setTextColor(Color.WHITE)
            binding.btnAll.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnAll.setTextColor(R.color.dark_gray)
            binding.btnChicken.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnChicken.setTextColor(R.color.dark_gray)
            binding.btnKebab.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnKebab.setTextColor(R.color.dark_gray)
            binding.rvProducts.visibility = View.VISIBLE
            binding.txtListTit.text = "Pizza"
        }


        binding.btnKebab.setOnClickListener {
            clicked = true
            if (clicked)
                binding.btnKebab.setBackgroundResource(R.drawable.bg_button_enabled)
            binding.btnKebab.setTextColor(Color.WHITE)
            binding.btnAll.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnAll.setTextColor(R.color.dark_gray)
            binding.btnChicken.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnChicken.setTextColor(R.color.dark_gray)
            binding.btnPizza.setBackgroundResource(R.drawable.bg_button_disabled)
            binding.btnPizza.setTextColor(R.color.dark_gray)
            binding.rvProducts.visibility = View.INVISIBLE
            binding.txtListTit.text = "Kebab"

        }
    }
}


