package cn.wsgwz.mystery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.wsgwz.mystery.base.BaseRule
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        ssv.mBaseRule = (intent.getSerializableExtra("data") as Class<out BaseRule>).newInstance()
    }
}
