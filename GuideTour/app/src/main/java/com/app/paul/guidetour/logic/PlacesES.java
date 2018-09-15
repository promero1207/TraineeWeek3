package com.app.paul.guidetour.logic;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for all information from the places
 */
public class PlacesES implements Parcelable {

    //Fields
    private String name;
    private String city;
    private String address;
    private String phone;
    private String web;
    private List<Integer> img;

    //Constructor
    PlacesES(String name, String city, String address, String phone, String web, List<Integer> img) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.web = web;
        this.img = img;
    }

    //Setters an getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb() {
        return web;
    }



    public List<Integer> getImg() {
        return img;
    }


    //Parcelable methods

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.city);
        dest.writeString(this.address);
        dest.writeString(this.phone);
        dest.writeString(this.web);
        dest.writeList(this.img);
    }

    private PlacesES(Parcel in) {
        this.name = in.readString();
        this.city = in.readString();
        this.address = in.readString();
        this.phone = in.readString();
        this.web = in.readString();
        this.img = new ArrayList<>();
        in.readList(this.img, Integer.class.getClassLoader());
    }

    public static final Creator<PlacesES> CREATOR = new Creator<PlacesES>() {
        @Override
        public PlacesES createFromParcel(Parcel source) {
            return new PlacesES(source);
        }

        @Override
        public PlacesES[] newArray(int size) {
            return new PlacesES[size];
        }
    };
}
