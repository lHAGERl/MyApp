package com.example.myapplication2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        var books= mutableListOf <book>(
            book("One Hundred Years of Solitude ","by Gabriel Garcia Marquez",R.drawable.solitude),
            book("Terra Nostra","by Carlos Fuentes",R.drawable.nostra),
            book("Angels & Demons","by Dan Brown",R.drawable.angels),
            book("The Sword Theif","by Peter Lerangis",R.drawable.sword),
            book("Inferno","by Dan Brown",R.drawable.humming),
            book("Bloodline","by James Rollins",R.drawable.blood),
            book("The House of the Spirits","by Isabel Allende",R.drawable.spirits)
        )
        val bookAdapter = bookAdapter(books)
        binding.rvUsers.layoutManager= LinearLayoutManager(this)
        binding.rvUsers.adapter=bookAdapter

        binding.toolbar.bellbt.setOnClickListener {
            Toast.makeText(this,R.string.Notification_clicked, Toast.LENGTH_SHORT).show()
        }
        binding.toolbar.materialToolbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }



        binding.navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.profile -> {
                    Toast.makeText(this, R.string.profile_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.Reviews -> {
                    Toast.makeText(this, R.string.Review_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.Favourite -> {
                    Toast.makeText(this, R.string.Favourite_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, R.string.Search_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                R.id.settings -> {
                    Toast.makeText(this, R.string.settings_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                else -> false}
        }
    }}



















