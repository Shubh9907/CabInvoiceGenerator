package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {

    static CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double fare = cabInvoiceGenerator.calculateFare(2, 5);
        Assertions.assertEquals(25, fare);
    }

    @Test
    void givenDistanceAndTime_WhenLess_ShouldReturnMinimumFare() {
        double fare = cabInvoiceGenerator.calculateFare(0.2, 1);
        Assertions.assertEquals(5, fare);
    }

    @Test
    void givenMultipleRides_ShouldReturnTotalFare() {
        Ride[] rides = {
                new Ride(2, 5),
                new Ride(0.1, 1)
        };
        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(30, totalFare);
    }

    @Test
    void givenRidesDetail_ShouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2, 5),
                new Ride(3, 5)
        };
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.invoiceGenerator(rides);
        InvoiceSummary expectedSummary = new InvoiceSummary(2,60);
        Assertions.assertEquals(expectedSummary,invoiceSummary);
    }
}
