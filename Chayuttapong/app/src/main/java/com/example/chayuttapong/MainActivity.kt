package com.example.chayuttapong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        btn_phrae.setOnClickListener(View.OnClickListener {
            img_province.setImageDrawable(getDrawable(R.drawable.phrae_img))
            tv_header.setText("ข้อมูลจังหวัด"+getString(R.string.btn_phrae))
            tv_history.setText(getString(R.string.content_phrae))


        })


    }

}
