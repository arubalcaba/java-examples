package com.java.patterns.chapter1;

import java.util.Optional;

public class DriveImpl implements DriveBehavior{
    @Override
    public Optional<String> drive() {
        return Optional.ofNullable("Vroom vroom!");
    }
}
