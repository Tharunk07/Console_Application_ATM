import java.util.*;

public class AccountUser {
    static ArrayList<CustomerDetails> database = new ArrayList<>();
    public static void accountUser() {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(2434, "123456789");
        hash.put(1005, "987654321");
        database.add(new CustomerDetails("tharun", 0, "123456789"));
        database.add(new CustomerDetails("Ram", 0, "987654321"));
        database.add(new CustomerDetails("arun", 0, "789456123"));
        ProcessBank.processBank(hash, database);
    }
}
