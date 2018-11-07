package com.nmi168h.destiny

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nmi168h.destiny.ui.density.DensityFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DensityFragment.newInstance())
                .commitNow()
        }
    }

}
