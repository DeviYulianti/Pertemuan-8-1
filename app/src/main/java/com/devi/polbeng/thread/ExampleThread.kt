package com.devi.polbeng.thread

import android.util.Log
import android.view.View

class ExampleThread :Thread{
    var seconds =0
    val TAG ="MainActivity"

    constructor(seconds: Int) {
        this.seconds = seconds
    }
    override fun run(){
        for (i in 1..10){
            Log.d(TAG, "startThread:$i")
            try {
                Thread.sleep(1000)
            }catch (ie: InterruptedException){
                ie.printStackTrace()
            }
        }
    }
}