package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = VectorProducto()
        listaEnteros.rellenar()
        val contenidoListaEnteros = "Lista: $listaEnteros\n"

        val enteroProducto = 3
        val contenidoListaProducto = "Lista multiplicada por $enteroProducto: ${listaEnteros.times(enteroProducto)}\n"

        binding.tvResultado20.text =
            contenidoListaEnteros.plus(contenidoListaProducto)

    }
}
class VectorProducto(){
    var listaEnteros = IntArray(5)
    fun rellenar(){
        for (i in listaEnteros.indices){
            listaEnteros[i] = (1..10).random()
        }
    }

    override fun toString(): String {
        return listaEnteros.contentToString()
    }

    operator fun times(entero:Int):VectorProducto{
        var producto = VectorProducto()
        for (i in listaEnteros.indices)
            producto.listaEnteros[i] = listaEnteros[i]*entero
        return producto
    }
}