package com.company;

public class MyFileUtils  {

    static public int subtract10FromLargerNumber(int number) throws Exception {
        if(number < 10){
            throw new FooRuntimeException("number too small");
        }
        return number -10;
    }

    public static class FooRuntimeException extends Exception{
        public FooRuntimeException(String message) {
            super(message);
        }
    }
}
