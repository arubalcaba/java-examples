package com.java.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class FileTraverseService {
    private static final Logger log = LoggerFactory.getLogger(FileTraverseService.class);
    public Collection<String> getFilePaths(String dirPath) {
        log.info("Traversing files in directory: {}", dirPath);
        Collection<String> filePathCol = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(dirPath))){
            paths
                    .filter(Files::isRegularFile)
                    .forEach(path -> filePathCol.add(path.toString()));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return filePathCol;
    }

}
