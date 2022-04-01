package com.anasfauzi.kamusonlinebahasaisyarat

import android.content.Intent
import android.graphics.Typeface
import android.text.InputFilter
import android.util.Log
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_library.view.*

class AdapterLibrary (var data : Item_Content) : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.item_library
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_item_library.setText(data.alldata.toUpperCase())
        Log.d("TAG 2","$data")

        viewHolder.itemView.tv_item_library.setOnClickListener{
            var intent = Intent(it.context, MainContent::class.java)
            intent.putExtra("judul",data.alldata)
            it.context.startActivity(intent)
        }

    }
}