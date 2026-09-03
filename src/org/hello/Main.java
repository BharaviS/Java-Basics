package org.hello;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(name);
    }
}