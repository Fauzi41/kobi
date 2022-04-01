package com.anasfauzi.kamusonlinebahasaisyarat

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main_content.*

class MainContent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_content)
        var intentMain : Intent = intent

        var judul : String = intentMain.getStringExtra("judul")
//        var lokasi : Int = intentMain.getIntExtra("gambar",0)
        var lokasi : Int = resources.getIdentifier("$judul","drawable", packageName)
        iv_MainContent_gambar.setImageResource(lokasi)
        data_teks.setText(judul)

        Log.d("MAIN CONTENT = ","$judul")
        Log.d("MAIN CONTENT = ","$lokasi")


//        val adapter = GroupAdapter<ViewHolder>()
//        var isiItemMain = intent.getParcelableExtra<Item_Content>(Kamus.FRIEND_KEY)
//        iv_MainContent_gambar.setImageResource(isiItemMain.lokasi)

    }

    companion object {
        fun launchIntent(context : Context){
            val intent = Intent(context, MainContent::class.java)
            context.startActivity(intent)
        }
    }
}
