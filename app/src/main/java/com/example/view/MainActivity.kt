package com.example.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Classe interna que representa um aluno

    class Aluno {
        val curso: String = "criação de aplicativo para android"// Curso do aluno
        val professor: String = "Matheus"// Nome do professor
        val turno: String = "matutino"// Turno do aluno
        val nome: String = "Marcelo"// Nome do aluno1

    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenção das referências aos elementos da interface do usuário
        val button = findViewById<Button>(R.id.button)// Botão
        val editText = findViewById<EditText>(R.id.editText)// Campo de edição de texto
        val textView = findViewById<TextView>(R.id.textView)// Texto exibido

        // Configuração do ouvinte de clique para o botão
        button.setOnClickListener {
            editText.text.toString() // Converte o texto do campo de edição para uma string (mas não faz nada com essa string)
            val aluno = pesquisarAluno() // Obtém um objeto Aluno através do método pesquisarAluno()

            // Atualiza o texto exibido no textView com as informações do aluno
            textView.text = "Nome: ${aluno.nome}\nTurno: ${aluno.turno}\nProfessor: ${aluno.professor}\nCurso: ${aluno.curso}"
            textView.visibility = View.VISIBLE // Torna o textView visível
        }
    }

    // Método privado que simula a pesquisa de um aluno
    private fun pesquisarAluno(): Aluno {
        // Aqui você pode implementar a lógica de pesquisa do aluno
        // Por enquanto, vamos simplesmente retornar um aluno aleatório
        return Aluno()
    }
}


