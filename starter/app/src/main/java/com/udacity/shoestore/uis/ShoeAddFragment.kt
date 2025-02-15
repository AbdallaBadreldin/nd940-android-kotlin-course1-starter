package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeAddFragmentBinding
import com.udacity.shoestore.viewmodels.AppViewModel

class ShoeAddFragment : Fragment() {
    lateinit var binding: ShoeAddFragmentBinding
    lateinit var viewModel: AppViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]
        binding = ShoeAddFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.appViewModel = viewModel

        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.goto_shoeDetailsFragment_from_shoeAddFragment)
            addShoe()
        }
        return binding.root
    }

    private fun addShoe() {
        viewModel.addShoe()
    }
}