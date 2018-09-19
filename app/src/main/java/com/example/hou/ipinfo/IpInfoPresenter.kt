package com.example.hou.ipinfo

import android.icu.text.IDNA
import com.example.hou.LoadTasksCallBack
import com.example.hou.model.IpInfo
import com.example.hou.net.NetTask

/**
 * Created by hou on 2018/9/19.
 */
class IpInfoPresenter : IpInfoContract.Presenter,LoadTasksCallBack<IpInfo> {

    private var netTask : NetTask<*>? = null
    private var addTaskView : IpInfoContract.View? = null

    constructor(netTask: NetTask<*>?, addTaskView: IpInfoContract.View?) {
        this.netTask = netTask
        this.addTaskView = addTaskView
    }


    override fun onSuccess(t: IpInfo) {
        if (addTaskView!!.isActive()){
            addTaskView!!.setIpInfo(t)
        }
    }

    override fun onStart() {
        if (addTaskView!!.isActive()){
            addTaskView!!.showLoading()
        }
    }

    override fun onFailed() {
        if (addTaskView!!.isActive()){
            addTaskView!!.showError()
            addTaskView!!.hideLoading()
        }
    }

    override fun onFinish() {
        if (addTaskView!!.isActive()){
            addTaskView!!.hideLoading()
        }
    }

    override fun getIpInfo(ip: String) {
        //1!!!
        netTask!!.execute(ip,this)
        //将自身传入 来 获取数据 并回调给 IpInfoPresenter
        //最后通过addTaskView 来和View进行交互  更改界面


    }
}