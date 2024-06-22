package com.example.mainactivity

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainactivity.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // Valor total conta
    // Numero de pessoas
    // Porcentagem da gorjeta
    // 10%, 15% ou 20%
    // Calcular
    // Limpar

    // Recuperar as Views do layout
    // ViewBinding

    private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnClean.setOnClickListener {

        }

    }
}