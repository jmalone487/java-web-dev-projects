package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);  // 10 gallons tank, 50 miles per gallon
    }

    // Test to check if the initial gas tank is set properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    // Test to check if gas tank level is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);  // Drive 50 miles
        assertEquals(9, test_car.getGasTankLevel(), .001);  // Expected gas tank level should be 9
    }

    // Test to check if gas tank level is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(600);  // Attempt to drive 600 miles (exceeding the tank range)
        assertEquals(0, test_car.getGasTankLevel(), .001);  // Gas tank should be empty after driving
    }

    // Test to check if exception is thrown when trying to overfill the gas tank
    @Test
    public void testGasOverfillException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            test_car.addGas(5);  // Attempt to overfill the tank (it already has 10 gallons)
        });
        assertEquals("Can't exceed tank size", exception.getMessage());
    }
}
