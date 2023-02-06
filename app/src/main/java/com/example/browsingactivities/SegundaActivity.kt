package com.example.browsingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SegundaActivity : AppCompatActivity() {

    private lateinit var nome: TextView
    private lateinit var idade: TextView
    private lateinit var email: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        nome = findViewById(R.id.textNome)
        idade = findViewById(R.id.textIdade)
        email = findViewById(R.id.textEmail)

        val user:User? = intent.getParcelableExtra("user")



        nome.text = user?.nome.toString()
        idade.text = user?.idade.toString()
        email.text = user?.email.toString()



    }
}