package com.example.chayuttapongweek3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acitivity_second.*


class SecoundAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_second)

        setTitle("แอพบันทึกข้อมูลหน้า2")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var old = intent.extras?.getString(MainActivity().TAG_OLD)
        var hb = intent.extras?.getString(MainActivity().TAG_HB)
        var st = intent.extras?.getString(MainActivity().TAG_ST)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_old.setText(old)
        tv_res_hb.setText(hb)
        tv_res_st.setText(st)

        btn_back.setOnClickListener {

            finish()

        }


    }

}