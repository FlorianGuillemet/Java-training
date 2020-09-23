package main.fileIO;

import java.io.*;

public class ByteStreams {

    public static void main(String[] args) throws IOException {

        FileInputStream input = null;

        input = new FileInputStream("/home/vagrant/Documents/Java-training/bin/FileInput.txt");

        int number;

        while ((number = input.read()) != -1) {
            System.out.println(number);
        }

        FileOutputStream output = null;

        output = new FileOutputStream("/home/vagrant/Documents/Java-training/bin/FileOutput.txt");

        output.write(65);


    }
}
