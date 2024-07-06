import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static boolean getYesNo(String prompt) {
        while (true) {
            String response = getString(prompt);
            if (response.equalsIgnoreCase("y")) {
                return true;
            } else if (response.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
    }
}
