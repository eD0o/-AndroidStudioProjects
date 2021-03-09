package br.com.fiap.tdst_exemplolinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_ex0.*

class ex0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex0)
    }

    fun btnVoltar(view: View) {
        finish()
    }

    fun cliqueBotao(view: View){

        if(txtNome.text.trim().isEmpty()){
            Toast.makeText(this,"Informe um nome:", Toast.LENGTH_LONG).show()
        }

        else{
            val msg = "Olá ${txtNome.text}"
            exibirMnesagem("Saudação",msg)
        }

    }

    fun exibirMnesagem(titulo: String, mensagem: String){
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK",null)
        builder.create().show()
    }
}