package com.example.itemclicklistener

import android.os.Parcel
import android.os.Parcelable

data class Art(val image:Int,val name:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Art> {
        override fun createFromParcel(parcel: Parcel): Art {
            return Art(parcel)
        }

        override fun newArray(size: Int): Array<Art?> {
            return arrayOfNulls(size)
        }
    }
}
