package com.binar.navigationexercise

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.binar.navigationexercise.databinding.FragmentScreen2Binding

class FragmentScreen2 : Fragment() {

    lateinit var binding: FragmentScreen2Binding
    private val arguments: FragmentScreen2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentScreen2Binding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val dataReceive = arguments.dataParcel

        binding.title.text = "DETAIL DATA"
        binding.name2.text = dataReceive.username
        binding.age2.text = dataReceive.age

        
    }

}