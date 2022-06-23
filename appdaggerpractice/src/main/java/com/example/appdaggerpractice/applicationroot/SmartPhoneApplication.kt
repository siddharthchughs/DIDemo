package com.example.appdaggerpractice.applicationroot

import android.app.Application
import com.example.appdaggerpractice.componentsmartphone.DaggerSmartphoneComponent
import com.example.appdaggerpractice.componentsmartphone.SmartphoneComponent
import com.example.appdaggerpractice.module.MemoryCardModule

class SmartPhoneApplication : Application() {

    lateinit var smartphoneComponent: SmartphoneComponent

    override fun onCreate() {
      smartphoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SmartphoneComponent =
        DaggerSmartphoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()
}