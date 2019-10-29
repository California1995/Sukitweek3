package com.example.chayuttapong016w2

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

        btn_maehongson.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.maehongson)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_maehongson),
                    getString(R.string.content_maehongson)
                )
            }

        })
        btn_phitsanulok.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.phitsanulok)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_phitsanulok),
                    getString(R.string.content_phitsanulok)
                )
            }
        })
        btn_phangnga.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.phangnga)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_phangnga),
                    getString(R.string.content_phangnga)
                )
            }
        })
        btn_lopburi.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.lopburi)?.let { it1 ->
                setProvice(
                    it1,
                    getString(R.string.btn_lopburi),
                    getString(R.string.content_lopburi)
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

