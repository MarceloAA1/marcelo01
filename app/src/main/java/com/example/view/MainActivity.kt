package com.example.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    class Aluno {
        val curso: String = "criação de aplicativo para android"
        val professor: String = "Matheus"
        val turno: String = "matutino"
        val nome: String = "Marcelo"

    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            editText.text.toString()
            val aluno = pesquisarAluno()
            textView.text = "Nome: ${aluno.nome}\nTurno: ${aluno.turno}\nProfessor: ${aluno.professor}\nCurso: ${aluno.curso}"
            textView.visibility = View.VISIBLE
        }
    }

    private fun pesquisarAluno(): Aluno {
        // Aqui você pode implementar a lógica de pesquisa do aluno
        // Por enquanto, vamos simplesmente retornar um aluno aleatório
        return Aluno()
    }
}


