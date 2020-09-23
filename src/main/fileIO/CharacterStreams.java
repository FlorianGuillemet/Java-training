package main.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String[] args) throws IOException {

        FileReader input = null;

        input = new FileReader("/home/vagrant/Documents/Java-training/bin/FileReaderInput.txt");

        int number;

        while ((number = input.read()) != -1) {
            System.out.println(number);
        }

        FileWriter output = null;

        output = new FileWriter("/home/vagrant/Documents/Java-training/bin/FileReaderOutput.txt");

        output.write("Hello you !");

    }
}
