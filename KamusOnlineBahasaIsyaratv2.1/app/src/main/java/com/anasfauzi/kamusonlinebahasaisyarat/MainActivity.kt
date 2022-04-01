package com.anasfauzi.kamusonlinebahasaisyarat

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_kamus.setOnClickListener({
            Kamus.launchIntent(this)
        })
        btn_main_library.setOnClickListener {
            Library.launchIntent(this)
        }

    }


    companion object {
        fun launchIntent(context : Context){
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }
}


