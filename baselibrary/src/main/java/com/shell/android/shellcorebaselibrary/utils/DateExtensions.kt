package com.shell.android.shellcorebaselibrary.utils

import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

fun Date.getFormattedDay() = SimpleDateFormat("dd", Locale.US).format(this)

fun Date.getFormattedDaySimple() = SimpleDateFormat("d", Locale.US).format(this)

fun Date.getFormattedMonthYear() = SimpleDateFormat("MMMM yyyy", Locale.US).format(this)

fun Date.getFormattedHour() = SimpleDateFormat("HH:mm", Locale.US).format(this)

fun Date.getBeginDay() : Date {
    val sdf = SimpleDateFormat("yyyy MM dd", Locale.US)
    val strDate = sdf.format(this)
    return sdf.parse(strDate)
}

fun Date.setCustomDay(day: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time = this
    calendar.set(Calendar.DAY_OF_MONTH, day)
    return calendar.time
}

fun Date.getBeginMonth() : Date {
    val sdf = SimpleDateFormat("yyyy MM", Locale.US)
    val strDate = sdf.format(this)
    return sdf.parse(strDate)
}

fun Int.format2Digits(): String {
    val f = DecimalFormat("00");
    return f.format(this)
}