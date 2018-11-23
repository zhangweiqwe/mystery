package cn.wsgwz.mystery.base

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Parcelable
import android.util.DisplayMetrics

abstract class BaseRule {


    abstract fun RD(i:Int,j:Int):Int
    abstract fun GR(i:Int,j:Int):Int
    abstract fun BL(i:Int,j:Int):Int
    companion object {
        private fun prepareHandler(s: String): String {
            return if (s.length == 1) {
                "0$s"
            } else s
        }

        fun draw(canvas: Canvas, displayMetrics: DisplayMetrics,baseRule: BaseRule) {
            val paint = Paint()
            for (j in 0 until displayMetrics.widthPixels)
                for (i in 0 until displayMetrics.heightPixels) {
                    val colorStr = "#" + prepareHandler(
                        Integer.toHexString(
                            baseRule.RD(
                                i,
                                j
                            ) and 255
                        )
                    ) + prepareHandler(Integer.toHexString(baseRule.GR(i, j) and 255)) + prepareHandler(
                        Integer.toHexString(
                            baseRule.GR(
                                i,
                                j
                            ) and 255
                        )
                    )
                    paint.color = Color.parseColor(colorStr)
                    canvas.drawPoint(j.toFloat(), i.toFloat(), paint)
                }

        }
    }


}