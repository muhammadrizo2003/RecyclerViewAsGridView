package com.example.project7k.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project7k.R
import com.example.project7k.adapter.CustomAdapter
import com.example.project7k.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var members: ArrayList<Member>
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        refreshAdapter(prepareMemberList())
    }

    private fun initViews() {
        context = this
        recyclerView = main_recycler_view
        recyclerView.layoutManager = GridLayoutManager(context, 3)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val customAdapter = CustomAdapter(context, prepareMemberList())
        recyclerView.adapter = customAdapter
    }

    private fun prepareMemberList(): ArrayList<Member> {
        members = ArrayList()
        for (i in 1..30) members.add(Member("Muhammadrizo$i", "Nurullaxo'jayev$i"))
        return members
    }
}



