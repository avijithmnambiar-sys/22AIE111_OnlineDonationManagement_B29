package javaProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Organisation org1 = new Organisation(101, "Helping Hands", "Education and Healthcare");
        Organisation org2 = new Organisation(102, "Food For All", "Provides food to needy people");
        Organisation org3 = new Organisation(103, "Green Earth", "Environmental protection");

        Donor donor1 = new Donor(1, "Navneeth", "nav@example.com", "9876543210", "Kerala", "1234");
        Donor donor2 = new Donor(2, "Sidharth", "sid@example.com","92765431", "Kerala", "abcd");
        Donor donor3 = new Donor(3, "Jayasurya", "jay@example.com","97765432", "Kerala", "pass");
        Donor donor4 = new Donor(3, "Avijith", "avi@example.com","95783755", "Kerala", "vaas");

        Admin admin = new Admin(10, "System Admin", "admin@example.com", "99396248", "Amritapuri", "admin123", "admin", "1234" );

        donor1.register();
        donor2.register();
        donor3.register();
        donor4.register();

        int choice;

        do {
            System.out.println("\n===== ONLINE DONATION MANAGEMENT SYSTEM =====");
            System.out.println("1. Donor 1 Login");
            System.out.println("2. Donor 2 Login");
            System.out.println("3. Donor 3 Login");
            System.out.println("4. Donor 4 Login");
            System.out.println("5. Organization Login");
            System.out.println("6. View Organization Funds");
            System.out.println("7. Admin Login");
            System.out.println("8 Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter password for donor1: ");
                    String pass1 = sc.nextLine();

                    if (donor1.login(pass1)) {
                        donor1.displayDetails();

                        double amount = validateDonation(sc);
                        System.out.println("1. Heling Hands");
                        System.out.println("2. Food for all");
                        System.out.println("3. Grean Earth");
                        System.out.println("Select organisation: ");
                        int n = sc.nextInt();
                        if (n==1)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org1);
                        else if (n==2)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org2);
                        else if (n==3)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org3);
                        else
                        	System.out.println("Invalid option");
                    }
                    break;

                case 2:
                    System.out.print("Enter password for donor2: ");
                    String pass2 = sc.nextLine();

                    if (donor2.login(pass2)) {
                        donor2.displayDetails();

                        double amount = validateDonation(sc);
                        System.out.println("1. Heling Hands");
                        System.out.println("2. Food for all");
                        System.out.println("3. Grean Earth");
                        System.out.println("Select organisation: ");
                        int n = sc.nextInt();
                        if (n==1)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org1);
                        else if (n==2)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org2);
                        else if (n==3)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org3);
                        else
                        	System.out.println("Invalid option");
                    }
                    break;

                case 3:
                    System.out.print("Enter password for donor3: ");
                    String pass3 = sc.nextLine();

                    if (donor3.login(pass3)) {
                        donor3.displayDetails();
                        
                        double amount = validateDonation(sc);
                        System.out.println("1. Heling Hands");
                        System.out.println("2. Food for all");
                        System.out.println("3. Grean Earth");
                        System.out.println("Select organisation: ");
                        int n = sc.nextInt();
                        if (n==1)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org1);
                        else if (n==2)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org2);
                        else if (n==3)
                        	donor1.makeDonation(1001,amount,"12-04-2026","UPI",org3);
                        else
                        	System.out.println("Invalid option");
                    }
                    break;
                
                case 4:
                    System.out.print("Enter password for donor3: ");
                    String pass4 = sc.nextLine();

                    if (donor4.login(pass4)) {
                        donor4.displayDetails();

                        double amount = validateDonation(sc);
                        System.out.println("1. Heling Hands");
                        System.out.println("2. Food for all");
                        System.out.println("3. Grean Earth");
                        System.out.println("Select organisation: ");
                        int n = sc.nextInt();
                        if (n==1)
                        	donor1.makeDonation(1001,amount,"13-04-2026","UPI",org1);
                        else if (n==2)
                        	donor1.makeDonation(1001,amount,"13-04-2026","UPI",org2);
                        else if (n==3)
                        	donor1.makeDonation(1001,amount,"13-04-2026","UPI",org3);
                        else
                        	System.out.println("Invalid option");
                    }
                    break;
                case 5:
                    System.out.println("\nSelect Organization:");
                    System.out.println("1. Helping Hands");
                    System.out.println("2. Food For All");
                    System.out.println("3. Green Earth");
                    System.out.print("Enter choice: ");
                    int orgChoice = sc.nextInt();
                    sc.nextLine();

                    Organisation selectedOrg = null;

                    if (orgChoice == 1)
                        selectedOrg = org1;
                    else if (orgChoice == 2)
                        selectedOrg = org2;
                    else if (orgChoice == 3)
                        selectedOrg = org3;
                    else {
                        System.out.println("Invalid organization choice!");
                        break;
                    }

                    System.out.println("\n1. View Funds");
                    System.out.println("2. Update Usage");
                    System.out.print("Enter choice: ");
                    int orgMenu = sc.nextInt();
                    sc.nextLine();

                    if (orgMenu == 1) {
                        selectedOrg.viewFunds();
                    }
                    else if (orgMenu == 2) {
                        System.out.print("Enter usage details: ");
                        String usage = sc.nextLine();
                        System.out.println("Enter amount used: ");
                        double amt = sc.nextInt();
                        selectedOrg.updateUsage(usage,amt);
                    }
                    else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Organization Funds ---");
                    org1.viewFunds();
                    org2.viewFunds();
                    org3.viewFunds();
                    break;

                case 7:
                    System.out.print("Enter admin password: ");
                    String adminPass = sc.nextLine();

                    if (admin.login(adminPass)) {
                        admin.displayDetails();
                        admin.monitorDonations();
                        admin.manageUsers();

                        Report report = admin.generateReports(501, "13-04-2026", org1.getTotalFunds());

                        if (report != null) {
                            report.exportReport();
                        }
                    }
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}


//Add organization login and usage
