package com.mykotlintutorial.functional

import android.annotation.TargetApi
import android.os.Build
import com.mykotlintutorial.providers.Providers

class FunctionalProvider {

    companion object {
        @TargetApi(Build.VERSION_CODES.N)
        fun getAllProviders(fn: (String, String) -> Unit) {
            val allProviders = Providers.getProviders()

            val it = allProviders.iterator()

            while (it.hasNext()) {
                val provider = it.next()
                provider.forEach{key, value -> fn(key.toString(), value.toString())}
            }
        }
    }


}