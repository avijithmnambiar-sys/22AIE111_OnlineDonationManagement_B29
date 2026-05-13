package javaProject;

public class Admin extends Donor {

    private String username;

    public Admin(int adminID, String name, String email, String phone, String address, String password, String username, String adminPassword) {

        super(adminID, name, email, phone, address, password);
        this.username = username;
    }

    public void monitorDonations() {
        if (isLoggedIn())
            System.out.println("Monitoring donations...");
        else
            System.out.println("Login first!");
    }

    public void manageUsers() {
        if (isLoggedIn())
            System.out.println("Managing users...");
        else
            System.out.println("Login first!");
    }

    public Report generateReports(int id, String date, double amount) {

        if (!isLoggedIn()) {
            System.out.println("Login first!");
            return null;
        }

        Report report = new Report(id, date, amount);

        report.generateReport();
        return report;
    }

    @Override
    public void displayDetails() {

        if (!isLoggedIn()) {
            System.out.println("Login first!");
            return;
        }

        System.out.println("Admin: " + getName());
        System.out.println("Username: " + username);
    }
}
