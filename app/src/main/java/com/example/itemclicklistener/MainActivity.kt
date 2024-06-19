package com.example.itemclicklistener

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var artList: ArrayList<Art>
    private lateinit var adapter: Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        artList= ArrayList()

        artList.add(Art(R.drawable.art1,"art1"))
        artList.add(Art(R.drawable.art2,"art2"))
        artList.add(Art(R.drawable.art3,"art3"))
        artList.add(Art(R.drawable.art4,"art4"))
        artList.add(Art(R.drawable.art5,"art5"))
        artList.add(Art(R.drawable.art6,"art6"))
        artList.add(Art(R.drawable.art7,"art7"))
        artList.add(Art(R.drawable.art8,"art8"))
        artList.add(Art(R.drawable.art9,"art9"))
        artList.add(Art(R.drawable.art10,"art10"))

        adapter= Adapter(artList)
        recyclerView.adapter=adapter

        adapter.onItemClick={
            val intent=Intent(this,DetailedActivity::class.java)
            intent.putExtra("art",it)
            startActivity(intent)
        }

    }
}