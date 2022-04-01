package com.binar.navigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.navigationexercise.data.User
import com.binar.navigationexercise.databinding.FragmentScreen1Binding

class FragmentScreen1 : Fragment() {

    lateinit var binding: FragmentScreen1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentScreen1Binding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val userList = listOf(
            User("Badhrul Salman", "22 Tahun"),
            User("Ibnu Aqil", "21 Tahun"),
            User("Bintang Sanjaya", "23 Tahun"),
            User("Erik Tohir", "24 Tahun"),
            User("Salma Safira", "25 Tahun"),
            User("Kurir Gojek", "28 Tahun"),
            User("Rahmah Nisa", "30 Tahun"),
            User("Nisa Subandar", "25 Tahun"),
            User("Raisa Aji", "29 Tahun"),
            User("Anom Setiawan", "28 Tahun"),
            User("Hari Pera", "27 Tahun"),
            User("Puji Dewantoro", "19 Tahun"),
            User("Alfiyah ratri", "17 Tahun"),
        )

        val adapter = UserAdapter(userList)

        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        binding.recyclerView.layoutManager = layoutManager

        binding.recyclerView.adapter = adapter

    }


}