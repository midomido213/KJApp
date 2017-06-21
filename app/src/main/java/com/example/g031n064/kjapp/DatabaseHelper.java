package com.example.g031n064.kjapp;

/**
 * Created by g031n064 on 2017/06/21.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 4151116 on 2016/11/18.
 */


public class DatabaseHelper extends SQLiteOpenHelper {

    final static String dtable = "table01";
    final static String dname = "DATA_NAME";
    final static String dclassnum = "DATA_ID";
    final static String dclass = "DATA_CLASS";
    final static String dyear = "DATA_YEAR";
    final static String dmonth = "DATA_MONTH";
    final static String dday = "DATA_DAY";

    public DatabaseHelper(Context context) {
        //ストレージ(ローカルファイル)にＤＢを作成
        super(context, "NameAgeDB02", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //テーブル作成処理
        db.execSQL("create table "+ dtable +"(" + dname + " char, " + dclassnum + " int, " + dclass + " char, " + dyear + " int, " + dmonth + " int, " + dday +  " int);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
        // ここでアップデート条件を判定する
    }
}
