package com.example.testlibrarysample;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage implements WelcomeMyName{

    public static void s(Context c, String message){

        //Toast.makeText(c,"Novus" +message,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void testFunctionOne(Context c,String name) {
        Toast.makeText(c,"Novus" +name,Toast.LENGTH_SHORT).show();
    }
}
