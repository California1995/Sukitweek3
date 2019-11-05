package com.example.chayuttapongweek3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_FNAME = "FNAME"
    public final var TAG_LNAME = "LNAME"
    public final var TAG_NNAME = "NNAME"
    public final var TAG_SP = "SP"
    public final var TAG_HB = "HB"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("แอพบันทึกข้อมูล")

        btn_sender.setOnClickListener{
            // ดึงค่าจากEdit Text
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var nname = et_nname.text.toString()
            var sp = et_sp.text.toString()
            var hb = et_hb.text.toString()
            // เรียกใช้ Method senderFun เพื่อ ฝากและ ส่งข้อมูล
            senderFun(fname,lname,nname,sp,hb)

        }
        btn_clear.setOnClickListener {
            //ล้างข้อมูล
            et_fname.setText("")
            et_lname.setText("")
            et_nname.setText("")
            et_sp.setText("")
            et_hb.setText("")

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
        goPageSecond.putExtra(TAG_NNAME,str3)
        goPageSecond.putExtra(TAG_SP,str4)
        goPageSecond.putExtra(TAG_HB,str5)
        //เริ่มต้นเข้าสู่ Activity second
        startActivity(goPageSecond)
    }

}
