package com.example.appdaggerpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appdaggerpractice.applicationroot.SmartPhoneApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SmartPhoneApplication).smartphoneComponent
            .inject(mainActivity = this)
            smartPhone.makeACallWithRecording()
//  DaggerSmartphoneComponent.builder().memoryCardModule(MemoryCardModule(1000))
//      .build()
//      .inject(mainActivity = this)
//
        /*DaggerSmartphoneComponent.create()
            .inject(mainActivity = this)
           smartPhone.makeACallWithRecording()
*/
//         constructor based injection is always advised as it is quite simple to use.
//        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard())
//        smartPhone.makeACallWithRecording()

    }
}