package com.lenovo.prj;

/**
 * Created by lenovo on 8/20/2016.
 */
public class SousSnacksBean {


    String name,r,r1;
    int price;




    public SousSnacksBean(String name, String r1, String r, int price) {
        this.name = name;

        this.r1=r1;
        this.price = price;
        this.r=r;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
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
        return
                "" + name + "\t\t\t\t\t\t\t\t\t\t" +
                        "" + r +
                        "" + price ;

    }

}
