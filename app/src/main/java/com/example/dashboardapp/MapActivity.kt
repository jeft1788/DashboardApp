package com.example.dashboardapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView

class MapActivity(context: Context, attrs: AttributeSet) : AppCompatImageView(context, attrs) {



    fun setVectorDrawable(@DrawableRes drawableRes: Int){
        setImageResource(drawableRes)
    }


    

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            when(event.action){
                MotionEvent.ACTION_DOWN->{
                    val x = event.x
                    val y = event.y
                    if(isInsidePath1(x,y)){
                        return true
                    }else if(isInsidePath2(x,y)){
                        return true
                    }
                }
            }
        }
     return super.onTouchEvent(event)
    }
    private fun isInsidePath1(x: Float, y: Float): Boolean {
        // Check if the touch point (x, y) is inside the area of the first path element
        // Implement your logic to detect clicks within the first path element
        return false // replace with your logic
    }

    private fun isInsidePath2(x: Float, y: Float): Boolean {
        // Check if the touch point (x, y) is inside the area of the second path element
        // Implement your logic to detect clicks within the second path element
        return false // replace with your logic
    }

    }