package com.anasfauzi.kamusonlinebahasaisyarat

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_kamus.*
import kotlinx.android.synthetic.main.activity_kamus.btn_title
import kotlinx.android.synthetic.main.activity_library.*

class Library : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val adaptery = GroupAdapter<ViewHolder>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        btn_title.setOnClickListener({
            MainActivity.launchIntent(this)
        })

        val fireDB = FirebaseDatabase.getInstance().getReference("/alldata/")
        fireDB.addListenerForSingleValueEvent(object : ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onDataChange(p0: DataSnapshot) {
                p0.children.forEach {
                    var data = it.getValue(Item_Content::class.java) as Item_Content
                    Log.d("TAG 1", "$data")
                    adaptery.add(AdapterLibrary(data))
                }
            }
        })
        rv_library.adapter = adaptery

    }


    companion object {
        fun launchIntent(context : Context){
            val intent = Intent(context, Library::class.java)
            context.startActivity(intent)
        }
    }
}
