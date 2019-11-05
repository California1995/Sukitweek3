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
        var pet = intent.extras?.getString(MainActivity().TAG_PET)
        var mt = intent.extras?.getString(MainActivity().TAG_MT)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_old.setText(old)
        tv_res_pet.setText(pet)
        tv_res_mt.setText(mt)

        btn_back.setOnClickListener {

            finish()

        }


    }

}