package com.example.hou.net

import cn.finalteam.okhttpfinal.BaseHttpRequestCallback
import cn.finalteam.okhttpfinal.HttpRequest
import cn.finalteam.okhttpfinal.RequestParams
import com.example.hou.LoadTasksCallBack
import com.example.hou.model.IpInfo

/**
 * Created by hou on 2018/9/19.
 */
class IpInfoTask : NetTask<String> {

    private constructor()

    companion object {
        private var INSTANCE : IpInfoTask? = null
        private val HOST : String = "http://ip.taobao.com/service/getIpInfo.php"

        fun getInstance():IpInfoTask{
            return if (INSTANCE==null) IpInfoTask() else INSTANCE!!
        }
    }

    private var loadTaskCallBack : LoadTasksCallBack<*> ? =null


    override fun <T> execute(ip: T, callBack: LoadTasksCallBack<*>) {
        val requestParams  = RequestParams()
        requestParams.addFormDataPart("ip",ip.toString())
        HttpRequest.post(HOST,requestParams,object : BaseHttpRequestCallback<IpInfo>() {
            override fun onStart() {
                super.onStart()
                loadTaskCallBack!!.onStart()
            }

            override fun onSuccess(t: IpInfo?) {
                super.onSuccess(t)
                loadTaskCallBack!!.onSuccess(t!!)
            }

            override fun onFinish() {
                super.onFinish()
                loadTaskCallBack!!.onFinish()
            }

            override fun onFailure(errorCode: Int, msg: String?) {
                super.onFailure(errorCode, msg)
                loadTaskCallBack!!.onFailed()
            }


        })
    }



}