package com.example.test

import android.provider.UserDictionary.Words
import java.util.*

class MyMath {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }

    fun mult(a: Int, b: Int): Int {
        return a * b
    }

    fun div(a: Int, b: Int): Int {
        return a / b
    }

    fun reversWords(word: String): String {
        val digitsRemoved = word.replace("\\d+".toRegex(), "")
        val spacesRemoved = digitsRemoved.replace("\\s+".toRegex(), "")
        return spacesRemoved
    }
}


