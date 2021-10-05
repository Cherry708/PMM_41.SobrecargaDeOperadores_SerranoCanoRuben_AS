package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema5Binding
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema6Binding

class Problema6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema6)

        val binding = ActivityProblema6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var dados = Dados()
        dados.tirar()

        var resultado = "Estos son los dados: "
        for (i in dados.listaDados.indices)
             resultado += "${dados(i)} "

        binding.tvResultado60.text = resultado
    }
}

class Dados (){
    val listaDados = IntArray(10)
    fun tirar() {
        for(i in listaDados.indices)
            listaDados[i] = (1..6).random()
    }
    operator fun invoke(indice: Int) = listaDados[indice]
}
