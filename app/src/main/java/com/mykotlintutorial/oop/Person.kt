package com.mykotlintutorial.oop

import android.util.Log

interface Signatory {
    fun sign(): Int
}

// open is needed to inherit the class
open class Person(val name: String, var age: Int) : Signatory{
    init{
        // sign == works as String.equals() in java
        if(name == "moshe" && age<54) throw Exception("name and age is not valid")
    }

    override fun sign() = Log.d("tag_sign", "$name is signing, age is $age")
}

class Student(name: String, age: Int) : Person(name, age)

//class User(name: String, age: Int, isValid: Boolean = false) : Person(name, age)
class User(name: String, age: Int) : Person(name, age){
    var isValid: Boolean = false

    // secondary costructor - not obligatory
    constructor(name: String, age: Int, isValid: Boolean): this(name, age){
        this.isValid = isValid
    }
}

// good for getting data from DAO
data class personsData(val name: String, var age: Int)


