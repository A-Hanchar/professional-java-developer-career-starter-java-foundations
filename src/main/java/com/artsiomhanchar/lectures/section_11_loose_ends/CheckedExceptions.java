package com.artsiomhanchar.lectures.section_11_loose_ends;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            Files.lines(Path.of("blahblahblah"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("We were unable to open the file");
//            throw new RuntimeException(e);
        } finally {
            System.out.println("Make sure this runs no matter what..");
        }
    }
}
