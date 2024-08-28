package com.example.kelineyt.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import hilt_aggregated_deps._com_example_kelineyt_fragments_loginRegister_LoginFragment_GeneratedInjector

class HomeViewpagerAdapter(
    private val fragment:List<Fragment>,
    fm :FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm,lifecycle) {
    override fun getItemCount(): Int {
        return fragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragment[position]
    }

}