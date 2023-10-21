package com.example.addtwonum

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.addtwonum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClick(view: View) {
        val strA = binding.numA.text.toString()
        val strB = binding.numB.text.toString()

        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(this, "Incorrect input. Fill in both fields.", Toast.LENGTH_SHORT).show()
        } else {
            try {
                val numA = strA.toFloat()
                val numB = strB.toFloat()
                val sum = numA + numB
                binding.sum.text = sum.toString()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Incorrect input. Enter the numbers.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
