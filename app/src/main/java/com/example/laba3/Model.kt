package com.example.laba3

import android.media.Image
import android.os.Parcel
import android.os.Parcelable

class Model() : Parcelable {
    var title:String=""
    var desc:String=""

    constructor(parcel: Parcel) : this() {
        title = parcel.readString().toString()
        desc = parcel.readString().toString()
    }

    constructor(title: String, desc: String, /*image: Image*/) : this() {
        this.title = title
        this.desc = desc
     //   this.image = image
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(desc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Model> {
        override fun createFromParcel(parcel: Parcel): Model {
            return Model(parcel)
        }

        override fun newArray(size: Int): Array<Model?> {
            return arrayOfNulls(size)
        }
    }
}