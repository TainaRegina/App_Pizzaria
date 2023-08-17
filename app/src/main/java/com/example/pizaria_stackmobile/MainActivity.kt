package com.example.pizaria_stackmobile

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pizaria_stackmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clicked = false


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
            binding.rvProducts.visibility = View.INVISIBLE
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


