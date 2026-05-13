package javaProject;

public class Donor extends User {

    private String phone;
    private String address;
    private String password;
    private boolean loggedIn = false;

    public Donor(int donorID, String name, String email, String phone, String address, String password) {

        super(donorID, name, email);
        this.phone = phone;
        this.address = address;
        this.password = password;
    }

    public void register() {
        System.out.println(getName() + " registered successfully.");
    }

    public boolean login(String enteredPassword) {

        if (password.equals(enteredPassword)) {
            loggedIn = true;
            System.out.println(getName() + " logged in successfully.");
            return true;
        }

        System.out.println("Wrong password!");
        return false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public Donation makeDonation(int donationID, double amount, String date, String paymentMethod, Organisation organization) {

        if (!loggedIn) {
            System.out.println("Login first!");
            return null;
        }

        Payment payment = new Payment(donationID, amount, paymentMethod);

        payment.processPayment();

        Donation donation = new Donation(donationID,  getId(), amount, date, paymentMethod, payment);

        donation.recordDonation();
        organization.receiveDonation(amount);

        return donation;
    }

    @Override
    public void displayDetails() {

        if (!loggedIn) {
            System.out.println("Login first!");
            return;
        }

        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
    }
}
