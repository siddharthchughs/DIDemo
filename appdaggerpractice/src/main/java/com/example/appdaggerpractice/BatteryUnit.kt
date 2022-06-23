package com.example.appdaggerpractice

import android.util.Log
import javax.inject.Inject


//a customized class for dagger inject and to type cast className as Battery Dependency and
// and defined as a separate Module
class  BatteryUnit @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MYTAG","custom dagger injection with type casted")
    }
}