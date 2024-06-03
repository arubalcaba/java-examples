package com.java.patterns.chapter1;

import java.util.Optional;

public class NoHonk implements HonkBehavior{

    @Override
    public Optional<String> honk() {
        return Optional.empty();
    }
}
