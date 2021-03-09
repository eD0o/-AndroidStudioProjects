package br.com.fiap.tdst_exemplolinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ex3_result.*

class ex3_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex3_result)

        lbResultado.text = intent.getDoubleExtra("Resultado",0.0).toString()

    }
}