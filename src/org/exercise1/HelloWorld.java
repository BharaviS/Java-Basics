package org.exercise1;

import java.util.Scanner;

public class HelloWorld {

    static void main() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hello World!");

            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            for (int i = 1; i <= a; i++) {
                if (i%5==0) {
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
