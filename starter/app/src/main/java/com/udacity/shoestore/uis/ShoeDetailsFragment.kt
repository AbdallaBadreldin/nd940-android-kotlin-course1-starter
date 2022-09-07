package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.databinding.ShowDetailsFragmentBinding
import com.udacity.shoestore.viewmodels.AppViewModel

class ShoeDetailsFragment : Fragment() {
    lateinit var binding: ShowDetailsFragmentBinding
    lateinit var viewModel: AppViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ShowDetailsFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]

        viewModel.shoeList.observe(viewLifecycleOwner) {
            clearLinearLayout()
            renderListToLayout()
        }

        return binding.root
    }

    private fun renderListToLayout() {
        TODO("Not yet implemented")
    }

    private fun clearLinearLayout() {
    }
}