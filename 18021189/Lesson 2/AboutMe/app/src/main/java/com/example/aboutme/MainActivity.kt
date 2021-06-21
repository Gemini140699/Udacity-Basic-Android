package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Aleks Haecky")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        binding.btnDone.setOnClickListener() {
            addNickName()
        }

    }

    private fun addNickName() {
        binding.apply {
//            nickName.text = nickNameEdit.text
            myName?.nickName = nickNameEdit.text.toString()
            invalidateAll()
            nickNameEdit.visibility = View.GONE
            btnDone.visibility = View.GONE
            nickName.visibility = View.VISIBLE
        }
    }


}