package com.java.patterns.chapter1;

import java.util.Optional;

public class HonkLoudly implements HonkBehavior{
    @Override
    public Optional<String> honk() {
        return Optional.ofNullable("HONK HONK!");
    }
}
