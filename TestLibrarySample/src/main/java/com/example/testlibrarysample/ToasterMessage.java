package com.example.testlibrarysample;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,"Novus" +message,Toast.LENGTH_SHORT).show();

    }
}
