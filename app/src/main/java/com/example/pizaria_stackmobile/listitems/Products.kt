package com.example.pizaria_stackmobile.listitems

import com.example.pizaria_stackmobile.R
import com.example.pizaria_stackmobile.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Products {

    private val _productList = MutableStateFlow<MutableList<Product>>(mutableListOf())
    private val productListFlow: StateFlow<MutableList<Product>> = _productList

    fun getProducts(): Flow<MutableList<Product>> {
        val productList: MutableList<Product> = mutableListOf(
            Product(
                imgProduct = R.drawable.cheese_pizza,
                name = "Cheese Pizza",
                price = "30,00"
            ),
            Product(
                imgProduct = R.drawable.classic_pizza,
                name = "Classic Pizza",
                price = "20,00"
            ),
            Product(
                imgProduct = R.drawable.salmon_pizza,
                name = "Salmon Pizza",
                price = "50,00"
            ),
            Product(
                imgProduct = R.drawable.mixed_pizza,
                name = "Mixed Pizza",
                price = "40,00"
            ),
            Product(
                imgProduct = R.drawable.cheese_pizza,
                name = "Cheese Pizza",
                price = "30,00"
            ),
            Product(
                imgProduct = R.drawable.classic_pizza,
                name = "Classic Pizza",
                price = "20,00"
            ),
        )
        _productList.value = productList
        return productListFlow

    }
}