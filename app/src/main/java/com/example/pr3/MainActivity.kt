package com.example.pr3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pr3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.codeButton.setOnClickListener { startActivity(Intent(this, CodeActivity::class.java)) }
        binding.xmlButton.setOnClickListener { startActivity(Intent(this, XMLActivity::class.java)) }
        setContentView(binding.root)
    }

}