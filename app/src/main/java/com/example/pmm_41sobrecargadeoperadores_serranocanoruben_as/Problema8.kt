package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema7Binding
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema8Binding

class Problema8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema8)

        val binding = ActivityProblema8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val curso = Curso()
        val codigo = 12
        var resultado = ""
        if (curso.contains(codigo)){
            resultado = "Sí hay un alumno con documento $codigo"
        } else resultado = "No hay ningún alumno con documento $codigo"

        binding.tvResultado80.text = resultado
    }
}
data class Alumno(val documento:Int, val nombre:String)

class Curso {
    val alumno0 = Alumno(10,"Victor")
    val alumno1 = Alumno(11,"Juan")
    val alumno2 = Alumno(12,"Alberto")

    val listaAlumnos = arrayOf(alumno0,alumno1,alumno2)


    operator fun contains(documento: Int): Boolean {
        return listaAlumnos.any {documento == it.documento}
    }
}