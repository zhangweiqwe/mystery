package cn.wsgwz.mystery;

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.view.SurfaceHolder
import android.view.SurfaceView
import cn.wsgwz.mystery.base.BaseRule
import java.lang.Exception

class SimpleSurfaceView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : SurfaceView(context, attrs, defStyleAttr), SurfaceHolder.Callback, Runnable {
    lateinit var mBaseRule: BaseRule

    private var mThread: Thread? = null

    override fun run() {
        draw()
    }


    init {
        holder.addCallback(this)
    }

    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) {
        mThread.also {
            if (it != null) {
                try {
                    it.interrupt()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                mThread = null
            }
        }
    }

    override fun surfaceCreated(holder: SurfaceHolder?) {
        mThread = Thread(this).apply {
            start()
        }
    }

    private fun draw() {
        holder.lockCanvas()?.also {
            BaseRule.draw(it, context.resources.displayMetrics, mBaseRule)
            holder.unlockCanvasAndPost(it)

        }
    }


}
