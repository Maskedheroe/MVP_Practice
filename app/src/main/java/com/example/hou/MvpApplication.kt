package com.example.hou

import android.app.Application
import cn.finalteam.okhttpfinal.OkHttpFinal
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration

/**
 * Created by hou on 2018/9/19.
 */
class MvpApplication : Application() {

    //TODO (1)
    override fun onCreate() {
        super.onCreate()
        val builder: OkHttpFinalConfiguration.Builder = OkHttpFinalConfiguration.Builder()
        OkHttpFinal.getInstance().init(builder.build())
    }
}