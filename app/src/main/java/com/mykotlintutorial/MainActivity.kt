package com.mykotlintutorial

import android.annotation.TargetApi
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.mykotlintutorial.oop.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {

          /*  //        val name:String = "kevin"
            val name = "kevin"
            Toast.makeText(applicationContext,"my name is $name",Toast.LENGTH_SHORT).show()*/
            ////////////////////////////////////////////////////////////////////////////////////////////////
            providers()
        })

        button2.setOnClickListener(View.OnClickListener {
            val providers = getProviders()
        })

        oop.setOnClickListener(View.OnClickListener {
            val person = Person()
            person.sign()
        })
    }

    @TargetApi(Build.VERSION_CODES.N)
    private fun providers() {
        val providers = getProviders()
        val it = providers.iterator()

        while (it.hasNext()) {
            val provider = it.next()
    //                Toast.makeText(applicationContext, provider.name, Toast.LENGTH_SHORT).show()
            Log.d("provider_tag", provider.name)

            provider.forEach { key, value ->
                Log.d("key_value_tag", "$key, $value")
            }
        }
    }
}

/*
//class Person(val name:String){}

class Person{
    val name:String

}*/
