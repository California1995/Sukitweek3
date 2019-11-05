package com.example.sukit

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btn_lampang.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.lampang)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_lampang),
                    getString(R.string.content_lp)
                )
            }

        })
        btn_nan.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.nan)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_nan),
                    getString(R.string.content_nn)
                )
            }
        })
        btn_phitsanulok.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.phitsanulok)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_phitsanulok),
                    getString(R.string.content_pl)
                )
            }
        })
        btn_uttaradit.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.uttaradit)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_uttaradit),
                    getString(R.string.content_ud)
                )
            }
        })
    }
    fun setProvice(drawable: Drawable, header: String, content: String) {

        img_province.setImageDrawable(drawable)
        tv_header.setText("ข้อมูลจังหวัด " + header)
        tv_history.setText(content)

    }
    }

