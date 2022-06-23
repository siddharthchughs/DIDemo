package com.example.appdaggerpractice.componentsmartphone

import com.example.appdaggerpractice.MainActivity
import com.example.appdaggerpractice.SmartPhone
import com.example.appdaggerpractice.module.BatteryUnitModule
import com.example.appdaggerpractice.module.MemoryCardModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules=[MemoryCardModule::class,BatteryUnitModule::class])
interface SmartphoneComponent {
//     fun getSmartPhone(): SmartPhone
     fun inject(mainActivity: MainActivity)
}