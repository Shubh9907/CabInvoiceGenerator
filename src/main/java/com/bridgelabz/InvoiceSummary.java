package com.bridgelabz;

import java.util.Objects;

public class InvoiceSummary {
    int numOfRides;
    double totalFare;
    double averageFare;

    public InvoiceSummary(int numberOFRides, double totalFare) {
        this.numOfRides = numberOFRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0
                && Objects.equals(averageFare, that.averageFare);
    }
}
