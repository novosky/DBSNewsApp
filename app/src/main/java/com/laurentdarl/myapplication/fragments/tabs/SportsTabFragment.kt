package com.laurentdarl.myapplication.fragments.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laurentdarl.myapplication.R
import com.laurentdarl.myapplication.databinding.FragmentSportsTabBinding

class SportsTabFragment : Fragment() {

    private lateinit var binding: FragmentSportsTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSportsTabBinding.inflate(layoutInflater)


        // Inflate the layout for this fragment
        return binding.root
    }
}