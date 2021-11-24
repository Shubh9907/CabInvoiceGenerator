package com.bridgelabz;

public class CabInvoiceGenerator {
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MINUTES = 1 ;

    public double calculateFare(double distance, int time) {
        return distance*COST_PER_KM + time*COST_PER_MINUTES;
    }
}
