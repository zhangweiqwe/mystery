package cn.wsgwz.mystery

import android.os.Parcel
import android.os.Parcelable
import cn.wsgwz.mystery.base.BaseRule

class BaseRuleBean(val mClass: Class<out BaseRule>, val mDescription: String?) :Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readSerializable() as Class<out BaseRule>,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(mDescription)
        parcel.writeSerializable(mClass)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BaseRuleBean> {
        override fun createFromParcel(parcel: Parcel): BaseRuleBean {
            return BaseRuleBean(parcel)
        }

        override fun newArray(size: Int): Array<BaseRuleBean?> {
            return arrayOfNulls(size)
        }
    }
}