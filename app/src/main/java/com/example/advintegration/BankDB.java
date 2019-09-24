package com.example.advintegration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

class BankDB {
SQLiteDatabase db;
    public  BankDB(Context ct) {
        db=ct.openOrCreateDatabase("bankdb", Context.MODE_PRIVATE,null);
        db.execSQL("create table if not exists customer(" +
                "cust_id int(5000)  not null ,cust_fname varchar(60),cust_mname varchar(60)," +
                "cust_lname varchar(60),cust_addr varchar(256),cust_dist varchar(60)," +
                "cust_state varchar(60),cust_mail varchar(255)," +
                "cust_mob int(10),cust_aadhar varchar(12)," +
                "cust_dob date,primary key(cust_id) )");
//db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
    }


}
