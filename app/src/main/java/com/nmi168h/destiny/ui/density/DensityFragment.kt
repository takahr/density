package com.nmi168h.destiny.ui.density

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nmi168h.destiny.R

class DensityFragment : Fragment() {

    companion object {
        fun newInstance() = DensityFragment()
    }

    private lateinit var viewModel: DensityViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.density_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DensityViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
