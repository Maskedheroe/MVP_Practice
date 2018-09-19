package com.example.hou

import com.example.hou.model.IpInfo

/**
 * Created by hou on 2018/9/19.
 */
interface LoadTasksCallBack<T> {
    fun onSuccess(t: IpInfo)
    fun onStart()
    fun onFailed()
    fun onFinish()
}