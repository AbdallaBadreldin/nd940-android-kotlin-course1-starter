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

        binding = ShoeAddFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.goto_shoeDetailsFragment_from_shoeAddFragment)
            addShoe()
        }
        binding.appViewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    private fun addShoe() {
//        val name = binding.editTextTextPersonName3.text.toString()
//        val size = binding.editTextTextPersonName4.text.toString()
//        val company = binding.editTextTextPersonName5.text.toString()
//        val desc = binding.editTextTextPersonName6.text.toString()
//        val shoe = Shoe(name = name, size = size.toDouble(), company = company, description = desc)
        viewModel.addShoe()
    }
}