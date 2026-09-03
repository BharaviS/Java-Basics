package org.exercise1;

import java.util.Scanner;

public class FizzBuzzMethods {
    public static String getFizzBuzz(int iterations) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= iterations; i++) {
            String items;

            if (i%3==0 && i%5==0) {
               items = "FizzBuzz";
            } else if(i%3==0) {
                items = "Fizz";
            } else if (i%5==0) {
                items = "Buzz";
            } else {
                items = String.valueOf(i);
            }

            result.append(items).append("\n");
        }

        return result.toString();
    }

    static void main() {
        try(Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Enter a number: ");
                    int a = sc.nextInt();

                    System.out.println(getFizzBuzz(a));
                    break;
                } catch (Exception ex) {
                     System.out.println("Error: " + ex.getMessage());
                     sc.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
