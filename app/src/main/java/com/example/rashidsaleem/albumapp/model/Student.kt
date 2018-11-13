package com.example.rashidsaleem.albumapp.model

import android.os.Parcel
import android.os.Parcelable


public class Student() : Parcelable {

    var id: Int = 0;
    var name: String = "";
    var picture: String = "";
    var phoneNo: String = "";
    var address: String = "";
    var socialMedia: HashMap<String, String> = HashMap<String, String>();
    var bestQuote: String = "";
    var imageId: Int = 0

    constructor(parcel: Parcel) : this() {
        id = parcel.readInt()
        name = parcel.readString()
        picture = parcel.readString()
        phoneNo = parcel.readString()
        address = parcel.readString()
        bestQuote = parcel.readString()
        imageId = parcel.readInt()
    }


//    /**
//     * @param id
//     * @param name
//     * @param picture
//     * @param phoneNo
//     * @param address
//     * @param socialMedia
//     * @param bestQuote
//     */
//    constructor(id: Int, name: String, picture: String, phoneNo: String, address: String, socialMedia: HashMap<String, String>, bestQuote: String) : this() {
//        this.id = id
//        this.name = name
//        this.picture = picture
//        this.phoneNo = phoneNo
//        this.address = address
//        this.socialMedia = socialMedia
//        this.bestQuote = bestQuote
//    }


    /***
     * @param id
     * @param name
     * @param imageId
     * @param phoneNo
     * @param address
     * @param socialMedia
     * @param bestQuote

     */
    constructor(id: Int, name: String, imageId: Int, phoneNo: String, address: String, socialMedia: HashMap<String, String>, bestQuote: String) : this() {
        this.id = id
        this.name = name
        this.imageId = imageId
        this.phoneNo = phoneNo
        this.address = address
        this.socialMedia = socialMedia
        this.bestQuote = bestQuote
    }



    // Getter Methods
    public fun  getSocialMediaInStringFormat(): String {

        var str: String = ""

        var keySet: Array<String> = socialMedia.keys.toTypedArray()

        var no: Int = 1;

        var line: String = "";
        keySet.forEach {



             line = (no++).toString() + ". " + it + " " + socialMedia.get(it)

            str + line

        }

        return str

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(picture)
        parcel.writeString(phoneNo)
        parcel.writeString(address)
        parcel.writeString(bestQuote)
        parcel.writeInt(imageId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }


}