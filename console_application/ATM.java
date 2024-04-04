import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select User Type: 1-Account User, 2-Admin");
            int userType = sc.nextInt();
            switch (userType) {
                case 1:
                    AccountUser.accountUser();
                    break;
                case 2:
                    Admin.admin();
                    break;
                default:
                    System.out.println("Invalid option!!");
            }
            sc.close();
        }
        
    }
}
