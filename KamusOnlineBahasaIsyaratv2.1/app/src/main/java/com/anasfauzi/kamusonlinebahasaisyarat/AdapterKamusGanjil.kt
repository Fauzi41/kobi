//package com.anasfauzi.kamusonlinebahasaisyarat
//
//import android.util.Log
//import com.xwray.groupie.Item
//import com.xwray.groupie.ViewHolder
//
//
//class AdapterKamusGanjil(var nama : String,var nama2 : String, var lokasi : Int, var lokasi2 : Int) : Item<ViewHolder>() {
//    override fun getLayout(): Int {
//        return R.layout.item_library
//    }
//
//    override fun bind(viewHolder: ViewHolder, position: Int) {
//        var title : String
//        var data : Int
//        title = nama
//        Log.d("Tag Adapter","$position")
//        Log.d("Tag Adapter1","$nama")
//        Log.d("Tag Adapter2","$nama2")
//
//        if (nama2 != "nodata"){
//            viewHolder.itemView.tv_itemkamus_genap.setText(nama2).toString()
//        }
//
//        viewHolder.itemView.gambar_ganjil.setImageResource(lokasi)
//        viewHolder.itemView.tv_itemkamus_ganjil.setText(nama).toString()
//        viewHolder.itemView.gambar_genap.setImageResource(lokasi2)
//    }
//
//
//}