package com.bryan.learningfilereader;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        File file = new File("src/myfile.txt");


        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {

            String line = bufferedReader.readLine();

            while (!(line == null)) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem reading the file " + file.getName());
            e.printStackTrace();
        }
    }
}

