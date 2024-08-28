package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kelineyt.R
import com.example.kelineyt.adapters.HomeViewpagerAdapter
import com.example.kelineyt.databinding.FragmentHomeBinding
import com.example.kelineyt.fragments.categories.MainCategoryFragment
import com.example.kelineyt.fragments.categories.ShirtFragment
import com.example.kelineyt.fragments.categories.TShirtFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment:Fragment(R.layout.fragment_home) {
    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val categoriesFragment= arrayListOf<Fragment>(
            MainCategoryFragment(),
            ShirtFragment(),
            TShirtFragment()
        )

        val viewPager2Adapter=HomeViewpagerAdapter(
            categoriesFragment,childFragmentManager,lifecycle
        )
        binding.viewPagerHome.adapter=viewPager2Adapter
        TabLayoutMediator(binding.tabLayout,binding.viewPagerHome) { tab, position ->
            when (position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "Shirts"
                2 -> tab.text = "T-Shirts"
            }
        }.attach()
    }
}