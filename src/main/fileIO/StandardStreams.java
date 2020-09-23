package main.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStreams {

    public static void main(String[] args) throws IOException {

        InputStreamReader in = null;

        in = new InputStreamReader(System.in);
        System.out.println("Enter characters, e for exit");

        char ch;

        do {
            ch = (char) in.read();
            System.out.println(ch);

        } while (ch != 'e');

        if (in != null) {
            in.close();
        }

    }
}
