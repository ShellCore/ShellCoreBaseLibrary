package com.shell.android.shellcorebaselibrary.utils

import android.app.DownloadManager
import android.content.Context
import android.net.Uri

fun String.downloadFile(context: Context) {
    val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
    val uri = Uri.parse(this)
    val request = DownloadManager.Request(uri)
    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
    downloadManager.enqueue(request)
}