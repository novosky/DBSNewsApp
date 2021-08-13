package com.laurentdarl.myapplication.fragments.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laurentdarl.myapplication.R
import com.laurentdarl.myapplication.databinding.FragmentEntertainmentTabBinding


class EntertainmentTabFragment : Fragment() {

    private lateinit var binding: FragmentEntertainmentTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEntertainmentTabBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}