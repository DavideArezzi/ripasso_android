package com.example.ripasso_android.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ripasso_android.activity.SecondActivity
import com.example.ripasso_android.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)


        binding.primo.setOnClickListener{
            val intent = Intent(requireContext(),SecondActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}
