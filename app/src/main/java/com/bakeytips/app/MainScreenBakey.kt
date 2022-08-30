package com.bakeytips.app

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bakeytips.app.databinding.ActivityMainScreenBakeyBinding
import com.bakeytips.app.utils.BakeyUtils
import kotlin.random.Random

class MainScreenBakey : AppCompatActivity() {
    private lateinit var binding : ActivityMainScreenBakeyBinding
    private var mdqwdqwo = false
    private var pqwoeqfw: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBakeyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.stButton.setOnClickListener {
            getImgRes()
        }
    }


    private fun getImgRes() = with(binding){
        var counter = 0
        pqwoeqfw?.cancel()
        pqwoeqfw = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                counter++
                mdqwdqwo = true
                stButton.alpha = 0.7f
                tvPlease.visibility = View.GONE
                tvTip.visibility = View.GONE
                if(counter>5) counter = 0
                mainImage.setImageResource(BakeyUtils.imageList[counter])
            }

            override fun onFinish() {
                pwqwqeqew()
                mdqwdqwo = false
                stButton.alpha = 1.0f
                tvPlease.visibility = View.VISIBLE
                tvTip.visibility = View.VISIBLE

            }

        }.start()

    }

    private fun pwqwqeqew() =with(binding) {
        val image = BakeyUtils.imageList[Random.nextInt(6)]
        val tipText = BakeyUtils.tipList[Random.nextInt(8)]
        mainImage.setImageResource(image)
        tvTip.text = tipText
    }
}