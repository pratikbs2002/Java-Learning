/* Exception mainly categorized into two Parts:
 *       1. Built-in Exceptions 
 *                    > Checked Exception
 *                    > Unchecked Exception 
 *       2. User-Defined Exceptions
 */

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers to divide: ");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Throwable e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }

        // null pointer
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Error: You are accessing null pointer");
        }

        // NumberFormatException
        try {
            String temp = "abc";
            int tempNumber = Integer.parseInt(temp);

        } catch (NumberFormatException e) {
            System.out.println("Error: Number format exception");
        }

        // ArrayIndexOutOfBoundsException

        try {
            int a[] = new int[5];
            a[10] = 50;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds exception");

        }
    }
}
