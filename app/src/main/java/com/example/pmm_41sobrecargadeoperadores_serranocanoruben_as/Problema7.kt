package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema6Binding
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema7Binding

class Problema7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema7)

        val binding = ActivityProblema7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lista0 = Vector4()
        lista0.rellenar()
        val resultado0 = "Lista0: "+lista0.toString()+"\n"

        val lista1 = Vector4()
        lista1.rellenar()
        val resultado1 = "Lista1: "+lista1.toString()+"\n"

        lista0.plusAssign(lista1)
        val resultado2 = "Lista0 += Lista1: "+lista0.toString()+"\n"

        binding.tvResultado70.text =
            resultado0.plus(resultado1).plus(resultado2)

    }
}
class Vector4 {
    val listaEnteros = IntArray(5)

    fun rellenar(){
        for (i in listaEnteros.indices)
            listaEnteros[i] = (1..6).random()
    }

    operator fun plusAssign(lista: Vector4) {
        for(i in listaEnteros.indices)
            listaEnteros[i] += lista.listaEnteros[i]
    }

    override fun toString():String {
        var string = ""
        for (elemento in listaEnteros)
            string = "$elemento "
        return string
    }
}