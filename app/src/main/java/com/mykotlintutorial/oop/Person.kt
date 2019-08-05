package com.mykotlintutorial.oop

import android.util.Log

interface Signatory {
    fun sign(): Int
}

class Person() : Signatory{
    override fun sign() = Log.d("tag_sign", "i am signing")
}