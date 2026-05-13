package javaProject;

public class Organisation {
    private int orgID;
    private String orgName;
    private String description;
    private double totalFunds;

    public Organisation(int orgID, String orgName, String description) {
        this.orgID = orgID;
        this.orgName = orgName;
        this.description = description;
        this.totalFunds = 0;
    }

    public void receiveDonation(double amount) {
        totalFunds += amount;
        System.out.println(orgName + " received donation: " + amount);
    }

    public void updateUsage(String usage, double amount) {
        System.out.println("Funds used for: " + usage);
        totalFunds -= amount;
    }

    public void viewFunds() {
        System.out.println("Total Funds in " + orgName + ": " + totalFunds);
    }

    public String getOrgName() {
        return orgName;
    }

    public double getTotalFunds() {
        return totalFunds;
    }
}
