package br.com.fiap.tdst_exemplolinearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_ex1.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnChangeActivity(view: View) {

        var intentResult : Intent

        intentResult = Intent(this, ex0::class.java)

        when(view.id){
            R.id.btnActivityEX0 -> intentResult = Intent(this, ex0::class.java)
            R.id.btnActivityEX1 -> intentResult = Intent(this, ex1::class.java)
            R.id.btnActivityEX2 -> intentResult = Intent(this, ex2::class.java)
            R.id.btnActivityEX3 -> intentResult = Intent(this, ex3::class.java)
        }
        startActivity(intentResult)
    }

    fun btnActivityEX0(view: View) {
        val intent = Intent(this, ex0::class.java)
        startActivity(intent)
    }

    fun btnActivityEX1(view: View) {
        val intent = Intent(this, ex1::class.java)
        startActivity(intent)
    }



}