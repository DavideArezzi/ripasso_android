package com.example.ripasso_android.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ripasso_android.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
   private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= FragmentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}