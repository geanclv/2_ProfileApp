package com.geancarloleiva.a2_profileapp

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //rounding logo corners
        val myBitmap = BitmapFactory.decodeResource(resources, R.drawable.logo)
        val imgRounded = RoundedBitmapDrawableFactory.create(resources, myBitmap)
        //imgRounded.cornerRadius = 15f
        imgRounded.isCircular = true
        //obtaining the logo resource from activity
        val imgLogo: ImageView = findViewById(R.id.imgLogo)
        //setting the rounded image
        imgLogo.setImageDrawable(imgRounded)
    }
}