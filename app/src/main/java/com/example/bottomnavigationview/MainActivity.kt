package com.example.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnView.selectedItemId = R.id.news
        binding.bnView.setOnItemSelectedListener  {
            when(it.itemId){
                R.id.afisha -> {
                    Toast.makeText(this, "Afisha", Toast.LENGTH_SHORT).show()
                }
                R.id.audio -> {
                    Toast.makeText(this, "audio", Toast.LENGTH_SHORT).show()
                }
                R.id.map -> {
                    Toast.makeText(this, "map", Toast.LENGTH_SHORT).show()
                }
                R.id.news -> {
                    Toast.makeText(this, "news", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}