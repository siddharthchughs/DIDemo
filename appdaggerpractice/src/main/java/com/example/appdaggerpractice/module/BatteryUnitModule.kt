package com.example.appdaggerpractice.module

import com.example.appdaggerpractice.Battery
import com.example.appdaggerpractice.BatteryUnit
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class BatteryUnitModule {
    @Binds
    abstract fun bindBatteryunitModule(unitBattery: BatteryUnit): Battery
}
//@Module
// class BatteryUnitModule {
//    @Provides
//    fun getBatteryunitModule(unitBattery: BatteryUnit): Battery {
//     return unitBattery
//    }
//}