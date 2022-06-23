package com.anushka.didemo.DaggerModules

import com.anushka.didemo.MemoryCard
import dagger.Module
import dagger.Provides


@Module
class MemoryCardModule {

    @Provides
    fun provideMemoryCard(): MemoryCard {
       return MemoryCard()

    }
}