package main.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputs {

    public static void main(String[] args) throws IOException {
        System.out.println("Entrez votre nom : ");

        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        String name = reader.readLine();

        System.out.println("Mon nom est : " + name);
    }
}
