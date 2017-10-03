package com.lenovo.prj;

/**
 * Created by lenovo on 8/13/2016.
 */
public class FoodSquareMenuBean {

    String name,name2;

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "YellowChilliMenuBean{" +
                "name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    public FoodSquareMenuBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
