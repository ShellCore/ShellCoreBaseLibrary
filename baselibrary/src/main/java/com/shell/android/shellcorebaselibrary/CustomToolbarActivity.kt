package com.shell.android.shellcorebaselibrary

import android.support.v7.app.AppCompatActivity
import android.widget.Toolbar

open class CustomToolbarActivity : AppCompatActivity(), CustomToolbar {

    protected var _toolbar: Toolbar? = null

    override fun loadToolbar(toolbar: Toolbar?) {
        _toolbar = toolbar
        _toolbar?.let {
            setActionBar(_toolbar)
        }
    }

    override fun enableHomeDisplay(enabled: Boolean) {
        actionBar.setDisplayHomeAsUpEnabled(enabled)
    }
}