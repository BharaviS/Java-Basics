package Exercise1;

import java.util.Scanner;;

public class HelloWorld {

    public static void main(String[] args) {
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
        }
    }
}
