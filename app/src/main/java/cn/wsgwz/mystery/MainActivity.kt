package cn.wsgwz.mystery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import cn.wsgwz.mystery.base.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        //sample_text.text = stringFromJNI()
        rv.also {
            it.adapter = SimpleRuleAdapter(
                this, arrayOf(
                    BaseRuleBean(SimpleRule_A::class.java, "Martin Büttner")
                    ,BaseRuleBean(SimpleRule_B::class.java, "Martin Büttner")
                    ,BaseRuleBean(SimpleRule_C::class.java, "Martin Büttner")
                    ,BaseRuleBean(SimpleRule_D::class.java, "Manuel Kasten")
                    ,BaseRuleBean(SimpleRule_E::class.java, "Manuel Kasten")
                    ,BaseRuleBean(SimpleRule_F::class.java, "githubphagocyte ")
                    ,BaseRuleBean(SimpleRule_G::class.java, "")
                    ,BaseRuleBean(SimpleRule_H::class.java, "")


                )
            )
            it.layoutManager = LinearLayoutManager(this)
        }

        /**
         * SimpleRule_A native method that is implemented by the 'native-lib' native library,
         * which is packaged with this application.
         */
        /*external fun stringFromJNI(): String

        companion object {

            // Used to load the 'native-lib' library on application startup.
            init {
                System.loadLibrary("native-lib")
            }
        }*/
    }
}
