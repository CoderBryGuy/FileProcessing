package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/myfile.txt");
        String line = null;
        try(Scanner input = new Scanner(file) ) {
        while(input.hasNext()){
            line = input.nextLine();
            System.out.println(line);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(MyFileUtils.subtract10FromLargerNumber(9));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
