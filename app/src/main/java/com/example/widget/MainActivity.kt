package com.example.widget

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Activity 결과를 받을 콜백 등록
    private val subActivityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val returnedData = result.data?.getStringExtra("resultData")
//            Toast.makeText(this, "SubActivity에서 받은 값: $returnedData", Toast.LENGTH_LONG).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ConstraintLayout>(R.id.setting1).setOnClickListener {
            val intent = Intent(this, Setting1Activity::class.java)
            subActivityResultLauncher.launch(intent)
        }

        findViewById<ConstraintLayout>(R.id.setting2).setOnClickListener {
            val intent = Intent(this, Setting2Activity::class.java)
            subActivityResultLauncher.launch(intent)
        }
    }
}