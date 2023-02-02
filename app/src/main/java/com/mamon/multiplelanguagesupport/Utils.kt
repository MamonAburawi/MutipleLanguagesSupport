package com.mamon.multiplelanguagesupport


import android.content.Context
import androidx.fragment.app.Fragment
import java.util.*


fun Context.setAppLocale(language: String) {
    val locale = Locale(language)
    val sessionManger = SessionManager(this)
    val config = resources.configuration

    Locale.setDefault(locale)
    config.setLocale(locale)
    createConfigurationContext(config)
    sessionManger.setLastUpdateLang(language)
    resources.updateConfiguration(config, resources.displayMetrics)
}



fun Context.getLastUpdateLang() = SessionManager(this).getLastUpdateLang() ?: ""





//@SuppressLint("CommitPrefEdits")
//fun setLastUpdateLang(context: Context){
//    val pref = context.getSharedPreferences("Language",Context.MODE_PRIVATE)
//    val edit = pref.edit()
//    edit.putBoolean()
//}
//
