package com.bryan.learningfilereader;

public class MyCloseable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("closing");

        if(false){
            throw new Exception("this is nonsense");
        }
    }
}
