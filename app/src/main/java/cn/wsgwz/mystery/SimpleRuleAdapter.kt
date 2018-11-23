package cn.wsgwz.mystery

import android.content.Context
import android.content.Intent
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cn.wsgwz.mystery.base.BaseRule

class SimpleRuleAdapter(mContext: Context, private val data: Array<BaseRuleBean>) :
    RecyclerView.Adapter<SimpleRuleAdapter.ViewHolder>(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.parentCL -> {
                (v.tag as BaseRuleBean).also {
                    v.context.startActivity(Intent(v.context,ShowActivity::class.java).apply {
                        putExtra("data",it.mClass)
                    })
                }
            }
        }
    }

    private val mLayoutInflater = LayoutInflater.from(mContext)
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SimpleRuleAdapter.ViewHolder {
        return ViewHolder(mLayoutInflater.inflate(R.layout.simple_rule_adapter_item, p0, false)).apply {
            parentCL.setOnClickListener(this@SimpleRuleAdapter)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(p0: SimpleRuleAdapter.ViewHolder, p1: Int) {
        val bean = data[p1]
        p0.also {
            it.parentCL.tag = bean
            it.tv.text = bean.mDescription
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val parentCL = itemView.findViewById<ConstraintLayout>(R.id.parentCL)!!
        val tv = itemView.findViewById<TextView>(R.id.tv)!!
    }
}