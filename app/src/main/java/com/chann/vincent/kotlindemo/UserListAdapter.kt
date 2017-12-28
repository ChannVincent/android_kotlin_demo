package com.chann.vincent.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * Created by vincentchann on 28/12/2017.
 */

class UserListAdapter (private val userList:List<User>, private val context:Context) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.cell_user, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.titleView?.text = userList.get(position).firstName + " " + userList.get(position).name
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val titleView = v.findViewById<TextView>(R.id.cell_title)
    }
}



