package com.mamon.multiplelanguagesupport.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mamon.multiplelanguagesupport.getLastUpdateLang
import com.mamon.multiplelanguagesupport.setAppLocale
import com.mamon.mutiplelanguagesupport.R
import com.mamon.mutiplelanguagesupport.databinding.HomeBinding


class Home : Fragment() {
    private lateinit var binding: HomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = HomeBinding.inflate(inflater,container,false)




        setViews()


        return binding.root
    }



    private fun setViews() {

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_settings)
        }

    }


}