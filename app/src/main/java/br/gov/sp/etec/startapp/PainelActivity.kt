package br.gov.sp.etec.startapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PainelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_painel)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // IDs
        val btnVagasOcupadas = findViewById<Button>(R.id.button_vagas_ocupadas)
        val btnVagasLivres = findViewById<Button>(R.id.button_vagas_livres)
        val btnEntrada = findViewById<Button>(R.id.button_entrada)
        val btnSaida = findViewById<Button>(R.id.button_saida)
        val btnHistorico = findViewById<Button>(R.id.button_historico)

        //Vagas Ocupadas
        btnVagasOcupadas.setOnClickListener {
            val intent = Intent(this, VagasOcupadasActivity::class.java)
            startActivity(intent)
        }

        //Vagas Livres
        btnVagasLivres.setOnClickListener {
            val intent = Intent(this, VagasLivresActivity::class.java)
            startActivity(intent)
        }

        //Entrada
        btnEntrada.setOnClickListener {
            val intent = Intent(this, EntradaActivity::class.java)
            startActivity(intent)
        }

        //Saida
        btnSaida.setOnClickListener {
            val intent = Intent(this, SaidaActivity::class.java)
            startActivity(intent)
        }

        //Historico
        btnHistorico.setOnClickListener {
            val intent = Intent(this, HistoricoActivity::class.java)
            startActivity(intent)
        }
    }
}