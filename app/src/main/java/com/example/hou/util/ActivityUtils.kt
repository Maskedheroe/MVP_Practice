package com.example.hou.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * Created by hou on 2018/9/19.
 */
class ActivityUtils {
    companion object {
        public fun addFragmentToActivity(fragmentManager: FragmentManager,fragment: Fragment,frameId : Int){
           val transition = fragmentManager.beginTransaction()
            transition.add(frameId,fragment)
            transition.commit()
        }
    }
}