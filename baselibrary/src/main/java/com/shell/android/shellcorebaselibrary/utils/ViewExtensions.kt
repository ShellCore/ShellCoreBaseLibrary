package com.shell.android.shellcorebaselibrary.utils

import android.support.design.widget.Snackbar
import android.support.design.widget.TextInputLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun View.showMessage(message: String, duration: Int = Snackbar.LENGTH_SHORT) = Snackbar.make(this, message, duration).show()

fun TextInputLayout.setText(msg: String) = this.editText!!.setText(msg)

fun TextInputLayout.getText() = this.editText!!.text.toString()

fun ViewGroup.inflate(resource: Int): View = LayoutInflater.from(context).inflate(resource, this, false)

