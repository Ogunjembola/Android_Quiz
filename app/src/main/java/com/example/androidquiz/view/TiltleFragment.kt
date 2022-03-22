package com.example.androidquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.androidquiz.R
import com.example.androidquiz.databinding.FragmentTiltleBinding


class TiltleFragment : Fragment() {

private lateinit var binding: FragmentTiltleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tiltle, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val action =
                TiltleFragmentDirections.actionTiltleFragmentToGameFragment()
            // Navigation.findNavController(it).navigate(action)
            Navigation.findNavController(it).navigate(action)
        }
    }

}