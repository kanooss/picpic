package com.example.main_user.profile_rating.swipe_fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.main_user.profile_rating.R

//프래그먼트 생성시 임폴트에
//import android.support.v4.app.Fragment
//이거로 바꿔줘야함!
class My_Result_frag : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater!!.inflate(R.layout.activity_my_result_frag, container, false)
        return rootView
    }


    companion object {
        fun newInstance(): My_Result_frag {
            val fragment = My_Result_frag()
            return fragment
        }
    }
}