package com.example.browsingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editTextNome: EditText
    private lateinit var editTextIdade: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonEnviar)
        editTextNome = findViewById(R.id.edittextNome)
        editTextIdade = findViewById(R.id.edittextIdade)

        /*
            preenchendo o objeto User
         */

        val user = User(
            "Matheus",
            23,
            "matheus@gmail.com"
        )



        button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        })


        }
    }
