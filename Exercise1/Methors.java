package Exercise1;

import java.util.Scanner;

public class Methors {
    public static String getFizzBuzz(int itrations) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= itrations; i++) {
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

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Enter a number: ");
                    int a = sc.nextInt();

                    System.out.println(getFizzBuzz(a));
                    break;
                } catch (Exception ex) {
                     System.out.println(ex);
                    sc.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
