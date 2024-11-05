package com.example.widget

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class Setting2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting2)


        // OnSeekBarChange 리스너 - Seekbar 값 변경시 이벤트처리 Listener
        findViewById<SeekBar>(R.id.seekBar).setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // onProgressChange - Seekbar 값 변경될때마다 호출

                // 0에서 100의 값을 0.0에서 1.0으로 변환하여 투명도 설정
                val alpha = progress / 100f
                findViewById<LinearLayout>(R.id.linearLayout1).setAlpha(alpha) // 버튼의 투명도 설정
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // onStartTeackingTouch - SeekBar 값 변경위해 첫 눌림에 호출
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // onStopTrackingTouch - SeekBar 값 변경 끝나고 드래그 떼면 호출
            }
        })

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