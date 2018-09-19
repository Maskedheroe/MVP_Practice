package com.example.hou.ipinfo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.hou.model.IpData
import com.example.hou.mvppractive.R
import com.example.hou.net.IpInfoTask
import com.example.hou.util.ActivityUtils

class MainActivity : AppCompatActivity() {

    private var ipInfoPresenter : IpInfoPresenter? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ipInfoFragment  =  supportFragmentManager.findFragmentById(R.id.contentFragemnt) as IpInfoFragment
        if (ipInfoFragment == null){
            ipInfoFragment = IpInfoFragment.newInstance() as IpInfoFragment
            ActivityUtils.addFragmentToActivity(supportFragmentManager,ipInfoFragment as Fragment,R.id.contentFragemnt)
        }
        var ipInfoTask : IpInfoTask = IpInfoTask.getInstance()
        ipInfoPresenter = IpInfoPresenter(ipInfoTask,ipInfoFragment)
        ipInfoFragment.setPresenter(ipInfoPresenter!!)
     }
}
