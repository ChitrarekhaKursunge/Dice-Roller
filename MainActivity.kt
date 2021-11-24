package com.firstaap.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivDice: ImageView = findViewById(R.id.ivDice)

        val btnRoll: Button = findViewById(R.id.btnRoll)

        //animation for dice roller
        val anim_rotate = AnimationUtils.loadAnimation(this,R.anim.rotation)


        btnRoll.setOnClickListener {

            //apply animation
            ivDice.startAnimation(anim_rotate)

            //code to generate random number

            val randomNumber = Random.nextInt(6) + 1

            if(randomNumber==1)
            {
                ivDice.setImageResource(R.drawable.dice1)
            }
            else if(randomNumber==2)
            {
                ivDice.setImageResource(R.drawable.dice2)
            }
            else if(randomNumber==3)
            {
                ivDice.setImageResource(R.drawable.dice3)
            }
            else if(randomNumber==4)
            {
                ivDice.setImageResource(R.drawable.dice4)
            }
            else if(randomNumber==5)
            {
                ivDice.setImageResource(R.drawable.dice5)
            }
            else if(randomNumber==6)
            {
                ivDice.setImageResource(R.drawable.dice6)
            }
        }

    }
}