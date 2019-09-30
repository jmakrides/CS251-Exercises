import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        User user = getLoginDetails();

        verifyUser(user, "brian", "spam");
    }

    private static void verifyUser(User user, String username, String password) {
        if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
            System.out.println("Welcome " + user.getUsername());
        }
        else {
            System.out.println("Invalid login details");
        }
    }

    private static User getLoginDetails() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Please enter your username");
        user.setUsername(scanner.nextLine());
        System.out.println("Please enter your password");
        user.setPassword(scanner.nextLine());
        return user;
    }
}
