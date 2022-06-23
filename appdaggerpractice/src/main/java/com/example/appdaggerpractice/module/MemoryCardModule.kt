package com.example.appdaggerpractice.module

import android.util.Log
import com.example.appdaggerpractice.MemoryCard
import dagger.Module
import dagger.Provides

//@Module
//class MemoryCardModule {
//    @Provides
//    fun provideSmartMemoryCard(): MemoryCard{
////       Log.i("the MYTAG","Size of memory is: ${memorySize}")
//       return MemoryCard()
//    }
//}
@Module
class MemoryCardModule(val memorySize: Int) {
    @Provides
    fun provideSmartMemoryCard(): MemoryCard{
       Log.i("the MYTAG","Size of memory is: ${memorySize}")
       return MemoryCard()
    }
}