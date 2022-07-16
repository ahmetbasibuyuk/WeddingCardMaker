package com.basibuyuk.weddingcardmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_wedding_card.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun next(view:View){

        val intent = Intent(applicationContext,WeddingCardActivity::class.java)
        intent.putExtra("woman",putWomanName.text.toString())
        intent.putExtra("man",putManName.text.toString())
        intent.putExtra("message",putWeddingMessage.text.toString())
        intent.putExtra("date",putDateText.text.toString())
        intent.putExtra("venue",putVenueText.text.toString())

        startActivity(intent)
    }

    fun delete(view: View){
        putWomanName.setText("")
        putManName.setText("")
        putWeddingMessage.setText("")
        putDateText.setText("")
        putVenueText.setText("")
    }


}