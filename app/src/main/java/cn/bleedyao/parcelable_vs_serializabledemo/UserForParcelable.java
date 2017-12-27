package cn.bleedyao.parcelable_vs_serializabledemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yaoluhao on 27/12/2017.
 */

public class UserForParcelable implements Parcelable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserForParcelable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\r\n";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    public UserForParcelable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected UserForParcelable(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<UserForParcelable> CREATOR = new Parcelable.Creator<UserForParcelable>() {
        @Override
        public UserForParcelable createFromParcel(Parcel source) {
            return new UserForParcelable(source);
        }

        @Override
        public UserForParcelable[] newArray(int size) {
            return new UserForParcelable[size];
        }
    };
}
