package com.mamon.multiplelanguagesupport.screens

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mamon.multiplelanguagesupport.MainActivity
import com.mamon.multiplelanguagesupport.setAppLocale
import com.mamon.mutiplelanguagesupport.databinding.SettingsBinding


class Settings : Fragment() {

    companion object {
        const val ENGLISH = "en"
        const val ARABIC = "ar"
    }

    private lateinit var binding: SettingsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = SettingsBinding.inflate(inflater,container,false)

        setViews()

        return binding.root
    }

    private fun setViews() {
        binding.apply {

            btnEnglish.setOnClickListener { setEnglish() }

            btnArabic.setOnClickListener { setArabic() }

            btnBack.setOnClickListener { back() }


        }
    }


    private fun updateLocalLang(language: String) {
        requireContext().setAppLocale(language)
        val refresh = Intent(requireContext(), MainActivity::class.java)
        startActivity(refresh) // you have to refresh the activity after update the language
    }


    private fun setEnglish(){
        updateLocalLang(ENGLISH)
    }


    private fun setArabic(){
        updateLocalLang(ARABIC)
    }


    private fun back(){
        findNavController().navigateUp()
    }



}