package com.basibuyuk.weddingcardmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_wedding_card.*

class WeddingCardActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedding_card)

        val intent = intent
        val womanName = intent.getStringExtra("woman")
        val manName = intent.getStringExtra("man")
        val messageText = intent.getStringExtra("message")
        val dateText = intent.getStringExtra("date")
        val venueText = intent.getStringExtra("venue")
        getWomanName.text = " " + womanName
        getManName.text = manName
        getWeddingMessage.text = messageText
        getDateText.text = dateText
        getVenueText.text = venueText


    }
}