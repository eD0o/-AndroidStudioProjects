package br.com.fiap.tdst_exemplolinearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ex3.*

class ex3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex3)

        btnSomar.setOnClickListener{_:View ->
            if(validarCampos()){
                val n1 = txtNumero1.text.toString().toDouble()
                val n2 = txtNumero2.text.toString().toDouble()
                val soma = soma(n1,n2)

                var intentResult = Intent(this, ex3_result::class.java)
                intentResult.putExtra("Resultado", soma)
                startActivity(intentResult)
            }
        }

    }

    fun validarCampos() : Boolean {
        var msg = ""
        if (txtNumero1.text.trim().isEmpty()){
            msg = "ERRO: Informe o primeiro número."
        }
        else if(txtNumero2.text.trim().isEmpty()){
            msg = "ERRO: Informe o segundo número."
        }

        if(msg.equals("")){
            return true
        }

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        return false
    }

    fun soma(n1 : Double, n2: Double) : Double {
        return n1 + n2
    }
}