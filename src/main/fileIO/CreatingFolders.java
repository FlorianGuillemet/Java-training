package main.fileIO;

import java.io.File;

public class CreatingFolders {

    public static void main(String[] args) {

        String directory = "/home/vagrant/Documents/Hello";

        File file = new File(directory);

        file.mkdirs();

    }
}
