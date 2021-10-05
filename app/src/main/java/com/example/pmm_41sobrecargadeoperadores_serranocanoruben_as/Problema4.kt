package com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_41sobrecargadeoperadores_serranocanoruben_as.databinding.ActivityProblema4Binding

class Problema4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema4)

        val binding = ActivityProblema4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val persona0 = Persona("Luis",22)
        val persona1 = Persona("Roberto", 25)
        val resultado = when{
            persona0 > persona1 -> "${persona0.nombre} es mayor"
            persona1 > persona0 -> "${persona1.nombre} es mayor"
            else -> "${persona0.nombre} tiene la misma edad que ${persona1.nombre}"
        }

        val stringPersona = "$persona0\n"
        binding.tvResultado40.text = stringPersona.plus("$persona1\n").plus(resultado)

    }
}
class Persona(val nombre:String,val edad:Int){

    override fun toString(): String {
        return "$nombre, $edad años"
    }

    operator fun compareTo(persona: Persona): Int {
        return when {
            edad < persona.edad -> -1
            edad > persona.edad -> 1
            else -> 0
        }
    }

}