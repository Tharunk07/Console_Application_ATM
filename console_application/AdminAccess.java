import java.util.ArrayList;

public class AdminAccess {
    public static void adminAccess() {
        ArrayList<CustomerDetails> database = new ArrayList<>();
        database.add(new CustomerDetails("tharun", 1000, "123456789"));
        database.add(new CustomerDetails("Ram", 1000, "987654321"));
        database.add(new CustomerDetails("arun", 1000, "789456123"));
        System.out.println("Admin Access - Customer Details:");
        // AccountUser ac = new AccountUser();
        // ArrayList<CustomerDetails> database = ac.database;
        for (CustomerDetails stu : database) {
            System.out.println("Name: " + stu.name + ", Account Number: " + stu.accNo + ", Balance: " + stu.amount);
        }
        int totalBalance = 0;
        for (CustomerDetails stu : database) {
            totalBalance += stu.amount;
        }
        System.out.println("Total Bank Balance: " + totalBalance);
    }
}
