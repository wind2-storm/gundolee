//package com.example.widget
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.recyclerview.widget.RecyclerView
//
//
//// ViewPagerAdapter.kt
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.recyclerview.widget.RecyclerView
//
//class ViewPagerAdapter(private val images: List<List<Int>>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val imageList = images[position]
//        for (i in imageList.indices) {
//            holder.imageViews[i]?.setImageResource(imageList[i])
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return images.size // 페이지 수
//    }
//
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imageViews: Array<ImageView?> = arrayOf(
//            itemView.findViewById(R.id.imageView1),
//            itemView.findViewById(R.id.imageView2),
//            itemView.findViewById(R.id.imageView3),
//            itemView.findViewById(R.id.imageView4),
//            itemView.findViewById(R.id.imageView5),
//            itemView.findViewById(R.id.imageView6)
//        )
//    }
//}
