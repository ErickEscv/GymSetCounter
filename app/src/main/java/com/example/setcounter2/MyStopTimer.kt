package com.example.setcounter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.animsh.animatedcheckbox.AnimatedCheckBox
import kotlinx.android.synthetic.main.activity_my_stop_timer.*
import java.lang.Exception

class MyStopTimer : AppCompatActivity(), AnimatedCheckBox.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_stop_timer)

        go_back_button.setOnClickListener {
            finish()
        }

        primerCheckbox.setChecked(false,true)


        primerCheckbox.setOnCheckedChangeListener { checkBox, isChecked ->
            if(isChecked == true)
                //Toast.makeText(this,"¿ESTAS SEGURO?" ,Toast.LENGTH_SHORT).show()
                Toast.makeText(this,"Muy bien campeón" ,Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Oops" ,Toast.LENGTH_SHORT).show()
        }

        myChrono.start()

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

    }

    //NO QUIZO JALAR :(
    override fun onCheckedChanged(checkBox: AnimatedCheckBox?, isChecked: Boolean) {
        Toast.makeText(this,"Muy bien campeón" ,Toast.LENGTH_SHORT).show()
        if(isChecked == true)
        //Toast.makeText(this,"¿ESTAS SEGURO?" ,Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Muy bien campeón" ,Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this,"Oops" ,Toast.LENGTH_SHORT).show()
    }


}