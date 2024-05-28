package com.java.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileTraverseServiceTest {

    private FileTraverseService fileTraverseService;

    @BeforeEach
    void setUp() {
        fileTraverseService = new FileTraverseService();
    }

    @Test
    void testGetFilePaths() {
        var dirPath = "src/main/resources";
        var filePaths = fileTraverseService.getFilePaths(dirPath);
        assertNotNull(filePaths);
        assertEquals(2, filePaths.size());
        assertFalse(filePaths.isEmpty());
        filePaths.forEach(System.out::println);
    }


}
