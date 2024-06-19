package com.example.itemclicklistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val art=intent.getParcelableExtra<Art>("art")
        if(art!=null){
            val textView:TextView=findViewById(R.id.detailedActivityTv)
            val imageView:ImageView=findViewById(R.id.detailedActivityIv)

            textView.text=art.name
            imageView.setImageResource(art.image)
        }
    }
}