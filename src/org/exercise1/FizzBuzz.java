package org.exercise1;

import java.util.Scanner;

public class FizzBuzz {
    static void main() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            for (int i = 1; i <= a; i++) {
                if (i%3==0 && i%5==0) {
                    System.out.println("FizzBuzz");
                } else if(i%3==0) {
                    System.out.println("Fizz");
                } else if (i%5==0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
