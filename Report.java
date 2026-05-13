package javaProject;

public class Report {
    private int reportID;
    private String date;
    private double totalAmount;

    public Report(int reportID, String date, double totalAmount) {
        this.reportID = reportID;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public void generateReport() {
        System.out.println("Report generated on " + date);
        System.out.println("Total Donations: " + totalAmount);
    }

    public void exportReport() {
        System.out.println("Report exported successfully.");
    }
}

