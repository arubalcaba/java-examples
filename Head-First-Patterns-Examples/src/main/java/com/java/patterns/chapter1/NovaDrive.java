package com.java.patterns.chapter1;

import java.util.Optional;

public class NovaDrive implements DriveBehavior{
    @Override
    public Optional<String> drive() {
        return Optional.empty();
    }
}
