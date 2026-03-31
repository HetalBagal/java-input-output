import java.util.Scanner;

public class inputoutput {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter the value of a: ");
            int a = scanner.nextInt();

            System.out.print("Enter the value of b: ");
            int b = scanner.nextInt();

            // Calculate sum
            int sum = a + b;

            // Display result
            System.out.println("The sum of the numbers is: " + sum);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            // Close scanner to prevent resource leak
            scanner.close();
        }
    }
}
