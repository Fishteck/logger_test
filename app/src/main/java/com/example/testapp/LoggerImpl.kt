package com.example.testapp

import android.util.Log

class LoggerImpl : Logger {
    override fun printHello() { Log.e("tmps", "Hello") }

    override fun printCount(count: Int) { Log.e("tmps", "Count $count") }
}