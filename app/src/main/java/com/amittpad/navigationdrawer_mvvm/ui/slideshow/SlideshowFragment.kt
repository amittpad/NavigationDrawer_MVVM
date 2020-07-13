package com.amittpad.navigationdrawer_mvvm.ui.slideshow

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
import com.amittpad.navigationdrawer_mvvm.databinding.FragmentSlideshowBinding

class SlideshowFragment : BaseFragment<FragmentSlideshowBinding, SlideshowViewModel>() {
    override fun getFragmentView() = R.layout.fragment_slideshow

    override fun getViewModel() = SlideshowViewModel::class.java


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.textSlide.text = "Slideshow"
    }
}