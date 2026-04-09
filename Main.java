import java.util.Scanner;
/**
 * @author Christian E. Anderson
 * @version 1.0
 * @since 2024-06-01
 * 
 * This program demonstrates how to use the Scanner class to read user input from the console. It prompts the user to enter something, reads the input, and then prints it back to the console. Finally, it closes the scanner to prevent resource leaks. 
 * 
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        scanner.close();
    }
}