package com.anushka.didemo.componentInterface

import com.anushka.didemo.DaggerModules.MemoryCardModule
import com.anushka.didemo.SmartPhone
import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}