import java.util.*;

public class Transaction {
    public static void deposit(Scanner sc, String accNumber, ArrayList<CustomerDetails> database) {
        System.out.println("Enter your amount to deposit");
        int depositAmount = sc.nextInt();
        for (CustomerDetails stu : database) {
            if (stu.accNo.equals(accNumber)) {
                stu.amount += depositAmount;
                System.out.println("Amount is deposited successfully!!");
            }
        }
    }

    public static void withdraw(Scanner sc, String accNumber, ArrayList<CustomerDetails> database) {
        System.out.println("Enter your amount to withdrawal");
        int withdrawAmount = sc.nextInt();
        for (CustomerDetails stu : database) {
            if (stu.accNo.equals(accNumber)) {
                if (stu.amount < withdrawAmount) {
                    System.out.println("Insufficient Balance Please Try Again!!");
                } else {
                    System.out.println("Amount is withdrawn successfully Please collect!");
                    stu.amount -= withdrawAmount;
                }
            }
        }
    }

    public static void checkBalance(String accNumber, ArrayList<CustomerDetails> database) {
        for (CustomerDetails stu : database) {
            if (stu.accNo.equals(accNumber)) {
                System.out.println("The available balance amount is " + stu.amount);
            }
        }
    }
}
