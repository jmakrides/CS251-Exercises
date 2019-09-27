import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        User user = getLoginDetails();

        verifyUser(user);
    }

    private static void verifyUser(User user) {
        String correctUsername = "brian";
        String correctPassword = "spam";
        if(user.getUsername().equals(correctUsername) && user.getPassword().equals(correctPassword)) {
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
