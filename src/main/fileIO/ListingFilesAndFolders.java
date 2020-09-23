package main.fileIO;

import java.io.File;

public class ListingFilesAndFolders {

    public static void main(String[] args) {

        String[] paths;

        File file = new File("/home/vagrant/Documents");

        paths = file.list();

        for (String path: paths) {
            System.out.println(path);
        }

    }
}
