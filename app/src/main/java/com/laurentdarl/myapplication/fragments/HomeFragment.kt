package com.laurentdarl.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.laurentdarl.myapplication.R
import com.laurentdarl.myapplication.adapters.Pager2Adapter
import com.laurentdarl.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var pager2Adapter: Pager2Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        pager2Adapter = Pager2Adapter(requireActivity().supportFragmentManager, lifecycle)
        binding.pager2.adapter = pager2Adapter

        TabLayoutMediator(binding.tabs, binding.pager2) {tab,position ->

            when(position) {
                0 -> {
                    tab.text = "Home"
                }
                1 -> {
                    tab.text = "Politics"
                }
                2 -> {
                    tab.text = "Business"
                }
                3 -> {
                    tab.text = "Science and Technology"
                }
                4 -> {
                    tab.text = "Sports"
                }
                5 -> {
                    tab.text = "Entertainment"
                }
                else -> {
                    tab.text = "Home"
                }
            }

        }.attach()


        // Inflate the layout for this fragment
        return binding.root
    }

}