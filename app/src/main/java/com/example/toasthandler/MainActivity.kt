package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //объявляем кнопку
    private lateinit var mybutton: Button

    //связываем с активностью
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связали переменную с элементом на экране.
        mybutton = findViewById(R.id.button_ok)
        //привязываем функцию сообщения к нашей кнопке
        mybutton.setOnClickListener{showToast()}
    }

    private fun showToast() {
        // как вызвать Toast - всплывающее сообщение(2 секунды)
        val myToast = Toast.makeText(this, "Кнопка ОК", Toast.LENGTH_SHORT)
        //показываем
        myToast.show()
    }
}