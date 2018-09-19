package com.example.hou.ipinfo

import com.example.hou.BaseView
import com.example.hou.model.IpInfo

/**
 * Created by hou on 2018/9/19.
 */
interface IpInfoContract {
    interface Presenter{
        //P在此出现
        fun getIpInfo(ip : String)
    }

    interface View : BaseView<Presenter>{  //为何要继承BaseView ?  目的是给view绑定presenter
        fun setIpInfo(ipInfo : IpInfo)

        fun showLoading()

        fun hideLoading()

        fun showError()

        fun isActive():Boolean

    }
}