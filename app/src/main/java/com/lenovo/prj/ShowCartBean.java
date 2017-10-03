package com.lenovo.prj;

/**
 * Created by lenovo on 8/22/2016.
 */
public class ShowCartBean {

    String name,r;
    int price;

    public ShowCartBean(String name, String r, int price) {
        this.name = name;
        this.r = r;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShowCartBean{" +
                "name='" + name + '\'' +
                ", r='" + r + '\'' +
                ", price=" + price +
                '}';
    }
}
