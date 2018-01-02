package com.chann.vincent.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var userList: MutableList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserListAdapter(userList, this, { user : User ->
                    Toast.makeText(this, "hello " + user.name + " " + user.firstName, Toast.LENGTH_LONG).show()
                    Log.e("TAG", "hello " + user.name + " " + user.firstName)
        })
        loadData()
    }

    private fun loadData() {
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
        userList.add(User("Chann", "Vincent", "https://", 26))
        userList.add(User("Cheniere", "Jon", "https://", 35))
        userList.add(User("Gay", "Alexandre", "https://", 24))
    }

}
