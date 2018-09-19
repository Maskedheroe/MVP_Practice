package com.example.hou.ipinfo

import android.app.Dialog
import android.app.Fragment
import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.hou.model.IpData
import com.example.hou.model.IpInfo
import com.example.hou.mvppractive.R

/**
 * Created by hou on 2018/9/19.
 */
class IpInfoFragment : Fragment(),IpInfoContract.View {

    private var mDialog : Dialog? = null
    private var mPresenter : IpInfoContract.Presenter? =null
    private var button : Button? =null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val root = inflater!!.inflate(R.layout.fragment_blank,container,false)
        button= root.findViewById<Button>(R.id.button)
        return root
    }

    companion object {
        fun newInstance():IpInfoFragment{
            return IpInfoFragment()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mDialog = ProgressDialog(activity)
        mDialog!!.setTitle("获取数据中")
        button!!.setOnClickListener(object : View.OnClickListener{
             override fun onClick(v: View?) {
                mPresenter!!.getIpInfo("39.155.184.147")
            }
        })
    }

    override fun setPresenter(presenter: IpInfoContract.Presenter) {
        mPresenter = presenter
    }

    override fun setIpInfo(ipInfo: IpInfo) {
        if (ipInfo != null && ipInfo.data!=null){
            val ipData : IpData = ipInfo.data as IpData
            Toast.makeText(activity,
                    ipData.getCity()+ipData.getCity()+ipData.getArea(),Toast.LENGTH_SHORT).show()

        }
    }

    override fun showLoading() {
        mDialog!!.show()
    }

    override fun hideLoading() {
        if (mDialog!!.isShowing){
            mDialog!!.dismiss()
        }
    }

    override fun showError() {
        Toast.makeText(activity.applicationContext,"网络出错",Toast.LENGTH_SHORT).show()
    }

    override fun isActive(): Boolean {
        return isAdded
    }

}