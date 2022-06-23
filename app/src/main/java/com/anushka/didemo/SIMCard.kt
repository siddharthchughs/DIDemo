package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {

    //Field injection
//    private lateinit var serviceProvider: ServiceProvider

    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    // Dependecny injection using method injection
//    fun serviceProvider(serviceProvider: ServiceProvider){
//        this.serviceProvider = serviceProvider
//    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}