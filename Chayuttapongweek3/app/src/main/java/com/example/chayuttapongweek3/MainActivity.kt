package com.example.chayuttapongweek3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_FNAME = "FNAME"
    public final var TAG_LNAME = "LNAME"
    public final var TAG_OLD = "OLD"
    public final var TAG_PET = "PET"
    public final var TAG_MT = "MT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("แอพบันทึกข้อมูล")

        btn_sender.setOnClickListener{
            // ดึงค่าจากEdit Text
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var old = et_old.text.toString()
            var pet = et_pet.text.toString()
            var mt = et_mt.text.toString()
            // เรียกใช้ Method senderFun เพื่อ ฝากและ ส่งข้อมูล
            senderFun(fname,lname,old,pet,mt)

        }
        btn_clear.setOnClickListener {
            //ล้างข้อมูล
            et_fname.setText("")
            et_lname.setText("")
            et_old.setText("")
            et_pet.setText("")
            et_mt.setText("")

        }
        btn_close.setOnClickListener {
            //ปิด App
            finish()

        }
    }
    fun senderFun(str1 : String , str2 : String , str3 : String , str4 : String , str5 : String){
        //กำหนดค่าเริ่มต้น (ตัวมันเอง , class ปลายทาง)
        var goPageSecond = Intent (this,SecoundAcitivity :: class.java)
        //กำหนดข้อมูลและส่งข้อมูล (ชื่อของข้อมูล , ข้อมูล)
        goPageSecond.putExtra(TAG_FNAME,str1)
        goPageSecond.putExtra(TAG_LNAME,str2)
        goPageSecond.putExtra(TAG_OLD,str3)
        goPageSecond.putExtra(TAG_PET,str4)
        goPageSecond.putExtra(TAG_MT,str5)
        //เริ่มต้นเข้าสู่ Activity second
        startActivity(goPageSecond)
    }

}
