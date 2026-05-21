package br.gov.sp.etec.startapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val intent = Intent(this, PainelActivity::class.java)
        val btnSign_in = findViewById<Button>(R.id.button_signin)
        val editTextEmailLogin = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val editTextSenhaLogin = findViewById<EditText>(R.id.editTextNumberPassword)
        btnSign_in.setOnClickListener {
            if(editTextEmailLogin.text.isEmpty() || editTextSenhaLogin.text.isEmpty()){
                Toast.makeText(this, "Parece que você esqueceu de digitar algo", Toast.LENGTH_LONG).show()
            }else{
                if (editTextEmailLogin.text.toString().equals("ryan@email.com") && editTextSenhaLogin.text.toString().equals("123")){
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Usuário ou senha inválida", Toast.LENGTH_LONG).show()
                }

            }
        }

        val intent2 = Intent(this, RegisterActivity::class.java)
        val btnSign_up = findViewById<Button>(R.id.button_signup)
        btnSign_up.setOnClickListener {
            startActivity(intent2)
        }
    }
}