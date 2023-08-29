package com.example.listartrabajadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.listartrabajadores.R.id.lista

class ListView : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_trabajadores)
        val arrayAdapter: ArrayAdapter<*>
        val trabajadores = mutableListOf("Carlos", "Laru", "Kelly")
        val lista = findViewById<ListView>(R.id.lista)

        arrayAdapter =
            ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, trabajadores)
        lista.adapter = arrayAdapter
    }
}