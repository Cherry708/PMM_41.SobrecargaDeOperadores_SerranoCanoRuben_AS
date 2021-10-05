package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema5Binding

class Problema5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema5)

        val binding = ActivityProblema5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val tateti = TaTeTi()
        tateti[0, 0] = 1
        tateti[0, 2] = 2
        tateti[2, 0] = 1
        tateti[1, 2] = 2
        tateti[1, 0] = 1

        binding.tvResultado50.text = tateti[1,0].toString()


    }
}
class TaTeTi {
    val tablero = IntArray(9)

    operator fun set(fila: Int, columna: Int, valor: Int){
        tablero[fila*3 + columna] = valor
    }
    operator fun get(fila: Int, columna: Int): Int{
        return tablero[fila*3 + columna]
    }

    override fun toString():String {
        var resultado = ""
        for(fila in 0..2) {
            for (columna in 0..2)
                resultado = "${this[fila, columna]} "
        }
        return resultado
    }
}