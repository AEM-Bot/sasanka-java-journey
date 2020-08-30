package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

    public static void main(String[] args) throws IOException {
        Files.list(Paths.get(".")).forEach(System.out::println);


        Path currentDirectory = Paths.get(".");
        Predicate<? super Path> predicate = path -> String.valueOf(path).endsWith("java");
        Files.walk(currentDirectory, 6)
                .filter(predicate)
                .forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> matcher =
                (path, basicFileAttributes) -> String.valueOf(path).endsWith("java");

        BiPredicate<Path, BasicFileAttributes> directoryMatcher =
                (path, basicFileAttributes) -> basicFileAttributes.isDirectory();

        Files.find(currentDirectory, 5, directoryMatcher)
                .forEach(System.out::println);
    }
}
