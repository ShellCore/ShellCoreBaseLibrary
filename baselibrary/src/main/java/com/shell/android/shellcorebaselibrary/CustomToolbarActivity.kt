package com.shell.android.shellcorebaselibrary

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar


open class CustomToolbarActivity : AppCompatActivity(), CustomToolbar {

    protected var _toolbar: Toolbar? = null

    override fun loadToolbar(toolbar: Toolbar?) {
        _toolbar = toolbar
        _toolbar?.let {
            setSupportActionBar(_toolbar)
        }
        supportActionBar?.apply {
            setDisplayShowHomeEnabled(true)
            setHomeButtonEnabled(true)
        }
    }

    override fun enableHomeDisplay(enabled: Boolean) {
        supportActionBar?.setDisplayShowHomeEnabled(enabled)
    }
}