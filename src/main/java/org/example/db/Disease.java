package org.example.db;

public class Disease {
    private final String diseaseName;

    private final int year;

    private final int cases;

    private final double incidenceRate;

    public Disease(String diseaseName, int year, int cases, double incidenceRate) {
        this.diseaseName = diseaseName;
        this.year = year;
        this.cases = cases;
        this.incidenceRate = incidenceRate;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public int getYear() {
        return year;
    }

    public int getCases() {
        return cases;
    }

    public double getIncidenceRate() {
        return incidenceRate;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "diseaseName='" + diseaseName + '\'' +
                ", year=" + year +
                ", cases=" + cases +
                ", incidenceRate=" + incidenceRate +
                '}';
    }
}
