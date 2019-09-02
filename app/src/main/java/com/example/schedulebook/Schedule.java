package com.example.schedulebook;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Schedule extends RealmObject {
    @PrimaryKey
    public long id;  //予定を見分けるためのIDが必要
    //予定の日付
    public Date date;
    //予定のタイトル
    public String title;
    //予定の詳細
    public String detail;

}
