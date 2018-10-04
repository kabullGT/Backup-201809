package com.royalrockets.soluzione.royalrockets_pay.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Order implements Parcelable {
    private String POC_orderDetails;

    public Order(){
        this.POC_orderDetails = "";
    }

    private Order(Parcel in){
        this.POC_orderDetails = in.readString();
    }

    public void POC_addToOrder(String addition){
        this.POC_orderDetails += addition;
    }

    public String POC_getOrderDetails(){
        return POC_orderDetails;
    }

    @Override
    public void writeToParcel(Parcel out, int flags){
        out.writeString(POC_orderDetails);
    }

    @Override
    public int describeContents(){
        return 0;
    }

    public static final Creator<Order> CREATOR
            = new Creator<Order>(){
        @Override
        public Order createFromParcel(Parcel in){
            return new Order(in);
        }

        @Override
        public Order[] newArray(int size){
            return new Order[size];
        }
    };
}
