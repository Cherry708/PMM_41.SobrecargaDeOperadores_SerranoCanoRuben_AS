package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema3Binding

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val binding = ActivityProblema3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val vectorEnteros = Vector3()
        vectorEnteros.rellenar()
        val contenidoVector = "Vector: $vectorEnteros\n"
        val contenidoVectorIncrementado = "Vector incrementado: "+vectorEnteros.inc()+"\n"
        val contenidoVectorDecrementado = "Vector decrementador: "+vectorEnteros.dec()+"\n"

        binding.tvResultado30.text = contenidoVector
            .plus(contenidoVectorIncrementado)
            .plus(contenidoVectorDecrementado)
    }
}
class Vector3(){
    var listaEnteros = IntArray(5)

    fun rellenar(){
        for (i in listaEnteros.indices){
            listaEnteros[i] = (1..10).random()
        }
    }

    override fun toString(): String {
        return listaEnteros.contentToString()
    }

    operator fun inc(): Vector3 {
        var incremento = Vector3()
        for(i in listaEnteros.indices)
            incremento.listaEnteros[i] = listaEnteros[i] + 1
        return incremento
    }

    operator fun dec(): Vector3 {
        var decremento = Vector3()
        for(i in listaEnteros.indices)
            decremento.listaEnteros[i] = listaEnteros[i] - 1
        return decremento
    }



}