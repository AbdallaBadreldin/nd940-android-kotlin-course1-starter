package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.udacity.shoestore.databinding.ShoeAddFragmentBinding

class ShoeAddFragment : Fragment() {
    lateinit var binding: ShoeAddFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ShoeAddFragmentBinding.inflate(inflater, container, false)


        return binding.root
    }
}