package com.example.widget

import CheckboxListAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Setting1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting1)

        val items = List(20) { "군돌이 ${it + 1}" } // 20개의 아이템 생성
        val listView = findViewById<ListView>(R.id.checkbox_list_view)
        val adapter = CheckboxListAdapter(this, items)

        listView.adapter = adapter

        findViewById<ImageView>(R.id.back1).setOnClickListener {
            finish()
        }

        findViewById<ConstraintLayout>(R.id.constraintLayout1).setOnClickListener {
            // 결과 데이터를 Intent에 담아 반환
            val resultIntent = Intent()
            resultIntent.putExtra("resultData", "반환할 값 예시")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}