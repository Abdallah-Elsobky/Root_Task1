package com.example.routetask1;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Course implements Parcelable {
    final private int imageId;
    final private String courseName;
    final private ArrayList<String> courseContentList;
    public Course(int imageId, String name, ArrayList<String> content){
        this.imageId = imageId;
        this.courseName = name;
        this.courseContentList = content;
    }

    protected Course(Parcel in) {
        imageId = in.readInt();
        courseName = in.readString();
        courseContentList = in.createStringArrayList();
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };

    public int getImageId() {
        return imageId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<String> getCourseContentList() {
        return courseContentList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(imageId);
        parcel.writeString(courseName);
        parcel.writeStringList(courseContentList);
    }
}
