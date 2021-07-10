package com.nestor.recyclerviewexposicion;

import android.widget.Button;

public class ModelClaas {

    private int imageIcon;
    String title;
    String body;
    Button btn;

    public ModelClaas(int imageIcon, String title, String body) {
        this.imageIcon = imageIcon;
        this.title = title;
        this.body = body;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getTitleBody(){
        return title + body;
    }

    public Button getBtn() {return  btn;}
}
