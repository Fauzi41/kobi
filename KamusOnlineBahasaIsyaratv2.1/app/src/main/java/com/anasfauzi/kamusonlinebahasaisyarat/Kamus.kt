package com.anasfauzi.kamusonlinebahasaisyarat

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_kamus.*

class Kamus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kamus)
        rv_kamus.layoutManager = GridLayoutManager(this, 2)
        val adapter = GroupAdapter<ViewHolder>()

        btn_title.setOnClickListener({
            MainActivity.launchIntent(this)
        })

        btn_kamus_terjemah.setOnClickListener({
            var kalimat: String
            kalimat = et_kamus_kalimat.text.toString()

            var dataKu: List<String>
            var dataku2 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            var dummy: String = "nodata"
            var dataKalimat: String = ""

            for (i in kalimat) {
                dataKalimat += when {
                    i.isUpperCase() -> i.toLowerCase()
                    else -> i
                }
            }
            dataKu = "$dataKalimat".split(" ")

            if (dataKu.size % 2 != 0) {
                dataKu += dummy
            }
            for (i in 1..dataKu.size) {
                var title: String = dataKu[i - 1]
                var lokasi: Int = resources.getIdentifier("$title", "drawable", packageName)
                Log.d("TAGLokasi", "$lokasi")
                dataku2[i - 1] = lokasi
                adapter.add(AdapterKamusGenap(dataKu, dataku2))
            }
            Log.d("TAG1", "${dataku2[0]}")
            Log.d("TAG0", "$dataKu")
            Log.d("TAG0", "${dataku2[0]}")
        })

        rv_kamus.adapter = adapter
    }

    companion object {
        val FRIEND_KEY = "friend_key"
        fun launchIntent(context : Context){
            val intent = Intent(context, Kamus::class.java)
            context.startActivity(intent)
        }
    }
}
