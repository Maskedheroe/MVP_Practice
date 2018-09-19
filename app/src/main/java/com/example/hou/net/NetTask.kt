package com.example.hou.net

import com.example.hou.LoadTasksCallBack

/**
 * Created by hou on 2018/9/19.
 */
interface NetTask<in T> {
    fun<T> execute(data : T, callBack: LoadTasksCallBack<*>)
}