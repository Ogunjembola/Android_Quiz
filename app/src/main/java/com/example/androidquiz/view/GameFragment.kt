package com.example.androidquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.androidquiz.R
import com.example.androidquiz.databinding.FragmentGameBinding
import com.example.androidquiz.model.Question
import com.example.androidquiz.viewModel.GameViewModel

class GameFragment : Fragment() {
    private lateinit var viewModel :GameViewModel
    lateinit var correctQuestion: Question
    lateinit var answers: MutableList<String>
    private var questionIndex =0

private lateinit var binding: FragmentGameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.submit.setOnClickListener {
            view.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
        }
    }

}