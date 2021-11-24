package com.bridgelabz;

public class CabInvoiceGenerator {
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MINUTES = 1;
    private static final double MINIMUM_FARE = 5;

    /*
    Method to calculate fare
    @Param distance, time
     */
    public double calculateFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MINUTES;
        if (fare > MINIMUM_FARE) return fare;
        else return MINIMUM_FARE;
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare = totalFare + calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

    public InvoiceSummary invoiceGenerator(Ride[] rides) {
        double totalFare = 0;
        totalFare = calculateFare(rides);
        return new InvoiceSummary(rides.length, totalFare);
    }
}
