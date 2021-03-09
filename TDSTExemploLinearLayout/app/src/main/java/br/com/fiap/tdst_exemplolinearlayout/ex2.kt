package br.com.fiap.tdst_exemplolinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ex2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener{ view: View? ->

            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            var precoAlcool = txtAlcool.text.toString().toDouble()

            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolina.text.toString().toDouble()

            var resultado : Double = precoAlcool / precoGasolina

            var mensagem = ""

            if(resultado > 0.7){
                mensagem = "Gasolina é o CXB."
            }

            else if(resultado < 0.7){
                mensagem = "Álcool é o CXB."
            }

            else{
                mensagem ="Tanto faz."
            }

            Toast.makeText(this,mensagem,Toast.LENGTH_LONG).show()
        }
    }
}