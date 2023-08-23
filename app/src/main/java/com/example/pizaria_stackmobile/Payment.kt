package com.example.pizaria_stackmobile

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizaria_stackmobile.databinding.ActivityPaymentBinding
import java.text.DecimalFormat

class Payment : AppCompatActivity() {

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#E0E0E0")

        val name = intent.extras!!.getString("name")
        val amount = intent.extras!!.getString("amount")
        val total = intent.extras!!.getString("total")
        val saucesAndDrinks = intent.extras!!.getString("saucesAndDrinks")
        val decimalFormat = DecimalFormat.getCurrencyInstance()



    }
}