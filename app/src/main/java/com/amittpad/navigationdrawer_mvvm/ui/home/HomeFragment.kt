package com.amittpad.navigationdrawer_mvvm.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.amittpad.navigationdrawer_mvvm.R
import com.amittpad.navigationdrawer_mvvm.base.BaseFragment
import com.amittpad.navigationdrawer_mvvm.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override fun getFragmentView() = R.layout.fragment_home

    override fun getViewModel() = HomeViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.textHome.text = "Home"
    }
}