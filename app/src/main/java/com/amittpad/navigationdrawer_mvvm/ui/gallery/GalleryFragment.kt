package com.amittpad.navigationdrawer_mvvm.ui.gallery

import android.os.Bundle
import com.amittpad.navigationdrawer_mvvm.R
import com.amittpad.navigationdrawer_mvvm.base.BaseFragment
import com.amittpad.navigationdrawer_mvvm.databinding.FragmentGalleryBinding

class GalleryFragment : BaseFragment<FragmentGalleryBinding, GalleryViewModel>( ){
    override fun getFragmentView() = R.layout.fragment_gallery

    override fun getViewModel() = GalleryViewModel::class.java


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.textGallery.text = "Gallery"
    }
}