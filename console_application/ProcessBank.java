import java.util.*;

public class ProcessBank {
    public static void processBank(HashMap<Integer,String> hash, ArrayList<CustomerDetails> database){
        Scanner sc = new Scanner(System.in);
        String cond;
        System.out.println("Enter your ATM pin");
        int pin = sc.nextInt();

        if (hash.containsKey(pin)) {
            do {
                System.out.println("Enter the type of transaction: 1-Deposit, 2-Withdrawal, 3-Account Balance");
                int type = sc.nextInt();
                String accNumber = hash.get(pin);

                switch (type) {
                    case 1: 
                        Transaction.deposit(sc, accNumber, database);
                        break;
                    case 2: 
                        Transaction.withdraw(sc, accNumber, database);
                        break;
                    case 3:
                        Transaction.checkBalance(accNumber, database);
                        break;
                    default:
                        System.out.println("Invalid transaction type");
                        break;
                }
                System.out.println("Do you want to continue:(1-Yes/0-No)");
                int choice = sc.nextInt();
                cond = (choice == 1) ? "Yes" : "No";
            } while (cond.equals("Yes"));
        } else {
            System.out.println("Invalid pin number, Try Again!!");
        }
    }
}
