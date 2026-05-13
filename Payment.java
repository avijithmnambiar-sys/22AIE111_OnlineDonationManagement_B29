package javaProject;

public class Payment {
    private int paymentID;
    private double amount;
    private String paymentType;
    private String status;

    public Payment(int paymentID, double amount, String paymentType) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentType = paymentType;
        this.status = "Pending";
    }

    public void processPayment() {
    	if (amount <= 0) {
            status = "Failed";
            System.out.println("Invalid payment amount!");
            return;
        }

        status = "Completed";
        System.out.println("Payment processed successfully.");
    }

    public boolean verifyPayment() {
        return status.equals("Completed");
    }
}

