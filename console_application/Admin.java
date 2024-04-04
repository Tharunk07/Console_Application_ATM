import java.util.*;

public class Admin {
    public static void admin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter admin username:");
        String username = sc.next();
        System.out.println("Enter admin password:");
        String password = sc.next();

        if (username.equals("admin") && password.equals("tharun12345")) {
            AdminAccess.adminAccess();
        } else {
            System.out.println("Invalid admin credentials");
        }
        sc.close();
    }
}
