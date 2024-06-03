package com.java.patterns.chapter1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class VehicleTest {

    private Vehicle car;
    private Vehicle modelToyCar;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Camry", 2020, 0, 120);
        modelToyCar = new ModelToyCar("Hot Wheels", "Tesla", 2020, 0, 0);
    }

    @Test
    void testDriveBehaviors() {
        assertEquals("Vroom vroom!", car.performDrive());
        assertNull(modelToyCar.performDrive());
    }

    @Test
    void testHonkBehaviors() {
        assertEquals("HONK HONK!", car.performHonk());
        assertNull(modelToyCar.performHonk());
    }

}
