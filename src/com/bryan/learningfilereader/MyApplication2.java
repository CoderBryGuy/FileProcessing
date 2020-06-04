package com.bryan.learningfilereader;

import java.io.IOException;

public class MyApplication2 {

    public static void main(String[] args)  {

        try(MyCloseable var = new MyCloseable()){

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
