package lab11;

public class Q4_lab11 {
    public static <T extends Comparable<T>> boolean comparator(T username, T password) {
        T storedUsername = (T) "Admin";
        T storedPassword = (T) "admin123";

        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    public static void main(String[] args) {
        boolean result = comparator("Admin", "admin123");
        if (result) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
            System.exit(0);
        }
    }
}
