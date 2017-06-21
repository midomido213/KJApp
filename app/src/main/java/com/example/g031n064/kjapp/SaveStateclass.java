package com.example.g031n064.kjapp;

/**
 * Created by g031n064 on 2017/06/21.
 */

public class SaveStateclass {

    private int textid;
    private String recieveText;
    private Object textPosition;
    private int textColor;

    public void saveSQL_text(int textID, int sendText, int textPosition, int textColor) {
        this.textid = textID;
        this.recieveText = sendText;   //Stringとintで違う
        this.textPosition = textPosition;
        this.textColor = textColor;


    }
}
