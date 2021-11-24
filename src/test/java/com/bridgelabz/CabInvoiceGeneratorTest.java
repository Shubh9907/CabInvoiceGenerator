package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {

    static CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void GivenDistanceAndTime_ShouldReturnTotalFare() {
        double fare = cabInvoiceGenerator.calculateFare(2,5);
        Assertions.assertEquals(25,fare);
    }

    @Test
    void GivenDistanceAndTime_WhenLess_ShouldReturnMinimumFare() {
        double fare = cabInvoiceGenerator.calculateFare(0.2,1);
        Assertions.assertEquals(5,fare);
    }

    @Test
    void GivenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2,5),
                new Ride(0.1,1)
        };
        double totalFare = cabInvoiceGenerator.calculateTotalFare(rides);
        Assertions.assertEquals(30,totalFare);
    }
}
