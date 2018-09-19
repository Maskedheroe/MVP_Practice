package com.example.hou.model

/**
 * Created by hou on 2018/9/19.
 */
class IpInfo {
    //TODO (2)
    var code : Int? = 0
    var data : IpData? = null

    fun setCode(value:Int){
        code = value
    }
    fun getCode():Int{
        return code!!
    }

    fun setIpData(value:IpData){
        data = value
    }
    fun getIpDats():IpData{
        return data!!
    }
}