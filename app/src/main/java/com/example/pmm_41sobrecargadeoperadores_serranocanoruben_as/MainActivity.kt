package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros0 = Vector()
        val listaEnteros1 = Vector()

        listaEnteros0.rellenar()
        listaEnteros1.rellenar()

        val contenidoLista0 = "Lista0"+listaEnteros0.toString()+"\n"
        val contenidoLista1 = "Lista1"+listaEnteros1.toString()+"\n"

        val listaSumas = listaEnteros0+listaEnteros1
        val contenidoListaSumas = "ListaSuma"+listaSumas.toString()+"\n"

        val listaRestas = listaEnteros0-listaEnteros1
        val contenidoListaRestas = "ListaResta"+listaRestas.toString()+"\n"

        val listaProducto = listaEnteros0*listaEnteros1
        val contenidoListaProducto = "ListaProducto"+listaProducto.toString()+"\n"

        val listaDivision = listaEnteros0/listaEnteros1
        val contenidoListaDivision = "ListaDivisión"+listaDivision.toString()+"\n"

        binding.tvResultado10.text = contenidoLista0
            .plus(contenidoLista1)
            .plus(contenidoListaSumas)
            .plus(contenidoListaRestas)
            .plus(contenidoListaProducto)
            .plus(contenidoListaDivision)


    }
}
class Vector(){
    val listaEnteros = IntArray(5)

    fun rellenar(){
        for (i in listaEnteros.indices){
            listaEnteros[i] = (1..10).random()
        }
    }

    override fun toString(): String {
        return "(${listaEnteros.contentToString()})"
    }

    operator fun plus(vector:Vector):Vector{
        var suma = Vector()
        for (i in listaEnteros.indices){
            suma.listaEnteros[i] = listaEnteros[i]+vector.listaEnteros[i]
        }
        return suma
    }
    operator fun minus(vector:Vector):Vector{
        var resta = Vector()
        for (i in listaEnteros.indices){
            resta.listaEnteros[i] = listaEnteros[i]-vector.listaEnteros[i]
        }
        return resta
    }
    operator fun times(vector:Vector):Vector{
        var multiplicacion = Vector()
        for (i in listaEnteros.indices){
            multiplicacion.listaEnteros[i] = listaEnteros[i]*vector.listaEnteros[i]
        }
        return multiplicacion
    }
    operator fun div(vector:Vector):Vector{
        var division = Vector()
        for (i in listaEnteros.indices){
            division.listaEnteros[i] = listaEnteros[i]+vector.listaEnteros[i]
        }
        return division
    }
}