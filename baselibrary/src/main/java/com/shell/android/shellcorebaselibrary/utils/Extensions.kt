package com.shell.android.shellcorebaselibrary.utils

import android.support.design.widget.Snackbar
import android.view.View
import java.text.SimpleDateFormat
import java.util.*

fun View.showMessage(message: String, duration: Int = Snackbar.LENGTH_SHORT) = Snackbar.make(this, message, duration).show()

fun Date.getFormattedDay() = SimpleDateFormat("dd", Locale.US).format(this)

fun Date.getFormattedMonthYear() = SimpleDateFormat("MMMM yyyy", Locale.US).format(this)
