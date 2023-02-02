package com.mamon.multiplelanguagesupport

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences

@SuppressLint("CommitPrefEdits")
class SessionManager(private val context: Context) {

    private val pref: SharedPreferences = context.getSharedPreferences(FileName,Context.MODE_PRIVATE)

    companion object{
        private const val FileName = "MultipleSupportLanguage"
        private const val KEY_SELECTED_LANGUAGE = "Language"
    }

    fun setLastUpdateLang(lang: String){
        val edit = pref.edit()
        edit.putString(KEY_SELECTED_LANGUAGE,lang)
        edit.apply()
    }

    fun getLastUpdateLang() = pref.getString(KEY_SELECTED_LANGUAGE,"")


}