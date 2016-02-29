package com.marisayeung.homework4;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by marisayeung.
 */

public class Point implements Parcelable {
    float x, y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected Point(Parcel in) {
        x = in.readFloat();
        y = in.readFloat();
    }

    public static final Creator<Point> CREATOR = new Creator<Point>() {
        @Override
        public Point createFromParcel(Parcel in) {
            return new Point(in);
        }

        @Override
        public Point[] newArray(int size) {
            return new Point[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeFloat(x);
        dest.writeFloat(y);
    }
}
