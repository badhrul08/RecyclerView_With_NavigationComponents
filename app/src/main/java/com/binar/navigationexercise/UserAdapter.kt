package com.binar.navigationexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.binar.navigationexercise.data.User

class UserAdapter(private val user: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val usernameTextView : TextView = view.findViewById(R.id.name)
        val ageTextView : TextView = view.findViewById(R.id.age)
        val button : Button = view.findViewById(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.usernameTextView.text = user[position].username
        holder.ageTextView.text = user[position].age

        holder.button.setOnClickListener {
            val dataParcelable = User(
                username = user[position].username,
                age = user[position].age
            )
            it.findNavController().navigate(FragmentScreen1Directions.actionFragmentScreen1ToFragmentScreen2(dataParcelable))
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }
}