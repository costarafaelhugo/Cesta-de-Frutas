package com.hugorafaelcosta.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hugorafaelcosta.orgs.ui.recyclerview.adapter.ListaProdutosAdapater

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e maçã"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "R$ 19.95"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapater()
    }
}