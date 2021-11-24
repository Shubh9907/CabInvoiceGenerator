package com.bridgelabz;

public class CabInvoiceGenerator {
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MINUTES = 1 ;

    /*
    Method to calculate fare
    @Param distance, time
     */
    public double calculateFare(double distance, int time) {
        double fare =  distance*COST_PER_KM + time*COST_PER_MINUTES;
        if (fare>5) return fare;
        else return 5;
    }
}
