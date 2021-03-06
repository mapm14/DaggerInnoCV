package com.borjabravo.daggerinnocv.presentation.main

import android.os.Bundle
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.extensions.showDetailFragment
import com.borjabravo.daggerinnocv.presentation.general.BaseActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import javax.inject.Inject

class MainActivity : BaseActivity(), MainActivityView {

    @Inject
    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.init(this)

        detailButton.setOnClickListener { showDetailFragment(R.id.fragmentContainer) }
    }

    override fun showToast(message: String) {
        toast(message)
    }

}
