package cn.bleedyao.parcelable_vs_serializabledemo;

import java.io.Serializable;

/**
 * Created by yaoluhao on 27/12/2017.
 */

public class UserForSerializable implements Serializable {
    private String name;
    private int age;

    public UserForSerializable(String name,int age){
        this.name = name;
        this.age = age;
    }
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
}
