package com.shell.android.shellcorebaselibrary

import android.widget.Toolbar

interface CustomToolbar {
    fun loadToolbar(toolbar: Toolbar?)
    fun enableHomeDisplay(value: Boolean)
}