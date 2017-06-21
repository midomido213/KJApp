package com.example.g031n064.kjapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
    }

        // 変数
        private char projectName;
        private char hostName;
        private char gestName;
        private int textId;
        private char receiveText;
        private boolean passflag;
        private int password_host;

        // ホスト作成
        public void setSQL_Host(char projectName, int password_host){

        }

        // パスワードセット(?)
        public void setSQL_Pass(boolean passflag, char hostName){

        }

        // ゲスト取得(?)
        public void getSQL_Gest(){

        }

        // テキスト表示
        public void showText{

        }

        // テキスト削除
        public void deleteText{

        }
}
