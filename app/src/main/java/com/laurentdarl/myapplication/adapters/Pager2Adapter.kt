package com.laurentdarl.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.laurentdarl.myapplication.fragments.HomeFragment
import com.laurentdarl.myapplication.fragments.tabs.*

class Pager2Adapter(fm: FragmentManager, lifecycle: Lifecycle):
                    FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int {

        return 6
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {
            0 -> HomeTabFragment()
            1 -> PoliticsTabFragment()
            2 -> BusinessTabFragment()
            3 -> ScienceAndTechTabFragment()
            4 -> SportsTabFragment()
            5 -> EntertainmentTabFragment()
            else -> HomeTabFragment()
        }
    }
}