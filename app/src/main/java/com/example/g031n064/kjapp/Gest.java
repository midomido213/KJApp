package com.example.g031n064.kjapp;

/**
 * Created by g031n064 on 2017/06/21.
 */

public class Gest {
    String sendText;
    int textId;
    char projectName;
    boolean passCheck;
    int password_host;
    int password_gest;

    Gest(String sendText,int textId, char projectName, boolean passCheck, int password_host, int password_gest){
        this.sendText= sendText;
        this.textId = textId;
        this.projectName = projectName;
        this.passCheck = passCheck;
        this.password_host = password_host;
        this.password_gest = password_gest;
    }
}
