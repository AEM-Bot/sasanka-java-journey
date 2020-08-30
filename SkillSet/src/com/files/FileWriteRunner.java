package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToWrite = Paths.get("./resources/file-write.txt");

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");

        Files.write(pathFileToWrite, list);
    }
}
