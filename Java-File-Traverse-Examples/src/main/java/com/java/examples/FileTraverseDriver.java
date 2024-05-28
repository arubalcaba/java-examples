package com.java.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTraverseDriver {

    private static final Logger log = LoggerFactory.getLogger(FileTraverseDriver.class);

    public static void main(String[] args) {
        var dirPath = "src/main/resources";
        FileTraverseService fileTraverseService = new FileTraverseService();
        fileTraverseService.getFilePaths(dirPath).forEach(log::info);
    }
}
