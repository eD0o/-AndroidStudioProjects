package br.com.fiap.tdst_exemplolinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ex1.*

class ex1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)
    }

    fun btnVoltar(view: View) {
        finish()
    }

    fun btnChangeImage(view: View) {
        when(view.id){
            R.id.btn1 -> imagem.setImageResource(R.drawable.img1)
            R.id.btn2 -> imagem.setImageResource(R.drawable.img2)
            R.id.btn3 -> imagem.setImageResource(R.drawable.img3)
        }
    }

}