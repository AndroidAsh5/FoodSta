package com.lenovo.prj;

/**
 * Created by lenovo on 7/20/2016.
 */
public class LudhianaHotelListBean {
    int icon;
    String name,text;
    //RatingBar ratingBar;


    public LudhianaHotelListBean(int icon, String name, String text) {
        this.icon = icon;
        this.name = name;
        this.text=text;
        //this.ratingBar = ratingBar;
    }



    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //    public RatingBar getRatingBar() {
//        return ratingBar;
//    }
//
//    public void setRatingBar(RatingBar ratingBar) {
//        this.ratingBar = ratingBar;
//    }

    @Override
    public String toString() {
        return "LudhianaHotelListBean{" +
                "icon=" + icon +
                ", name='" + name + "\t\t\t\t\t" +
                ", text='" + text + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "LudhianaHotelListBean{" +
//                "icon=" + icon +
//                ", name='" + name + '\'' + '}';
//    }
}

