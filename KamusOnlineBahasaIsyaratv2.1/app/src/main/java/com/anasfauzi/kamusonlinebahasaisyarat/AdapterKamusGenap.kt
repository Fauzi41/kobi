package com.anasfauzi.kamusonlinebahasaisyarat

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.widget.Toast
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item.view.*


class AdapterKamusGenap(var dataKuTitle: List<String>, var dataKuLokasi : IntArray) : Item<ViewHolder>() {

    override fun getLayout(): Int {
        return R.layout.item
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        var title : String
        var data : Int

        if (dataKuTitle[position] != "nodata"){
            viewHolder.itemView.tv_item.setText(dataKuTitle[position])
        }
        viewHolder.itemView.iv_item.setImageResource(dataKuLokasi[position])

        viewHolder.itemView.iv_item.setOnClickListener {
            var intent = Intent(it.context, MainContent::class.java)
            intent.putExtra("judul",dataKuTitle[position])
            intent.putExtra("gambar",dataKuLokasi[position])
//            Toast.makeText(it.context,title,Toast.LENGTH_SHORT).show()
            it.context.startActivity(intent)
//            MainContent.launchIntent(it.context)
//            Toast.makeText(it.context,position!!,Toast.LENGTH_SHORT).show()
        }

    }
    override fun getItemCount(): Int {
        return super.getItemCount()
    }
}