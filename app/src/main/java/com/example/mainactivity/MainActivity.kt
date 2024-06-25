package com.example.mainactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mainactivity.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    // Valor total conta
    // Numero de pessoas
    // Porcentagem da gorjeta
    // 10%, 15% ou 20%
    // Calcular
    // Limpar

    // Recuperar as Views do layout
    // ViewBinding

    // Recuperar os radio buttons
    // Calculo de tip
    // Mostrar resultado

    private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var percentage:Int = 0
        binding.rbOptionOne.setOnCheckedChangeListener {_, isChecked ->
            println("Roque1 Option one:$isChecked")
            if(isChecked){
                percentage = 10
            }
        }


        binding.rbOptionTwo.setOnCheckedChangeListener {_, isChecked ->
            if(isChecked){
                percentage = 15
            }
        }

        binding.rbOptionThree.setOnCheckedChangeListener {_, isChecked ->
            if(isChecked){
                percentage = 20
            }
        }


        binding.btnClean.setOnClickListener {
                println("Roque1 " + binding.tieTotal.text)
                println("Roque1 " + binding.tieNumPeople.text)
        }


        binding.btnDone.setOnClickListener {
            val totalTable: Float = binding.tieTotal.text.toString().toFloat()
            val nPeople: Int = binding.tieNumPeople.text.toString().toInt()

            val totalTemp = totalTable / nPeople
            val tips = totalTemp * percentage / 100
            val totalWithTips = totalTemp + tips
            binding.tvResult.text = "Total with tips: $totalWithTips"


        }
    }
}