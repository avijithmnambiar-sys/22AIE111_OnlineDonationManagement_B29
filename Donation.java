package javaProject;

public class Donation {
    private int donationID;
    private int donorID;
    private double amount;
    private String date;
    private String paymentMethod;
    private Payment payment;

    public Donation(int donationID, int donorID, double amount,
                    String date, String paymentMethod,
                    Payment payment) {
        this.donationID = donationID;
        this.donorID = donorID;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.payment = payment;
    }

    public void recordDonation() {
        System.out.println("Donation recorded: " + amount);
    }

    public boolean validateDonation() {
        return amount > 0;
    }
}
