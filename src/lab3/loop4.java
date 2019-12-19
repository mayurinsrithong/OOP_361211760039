package lab3;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        do {
            System.out.print("Enter integer");
            x = sc.nextInt();

        }while (x!=0);
        System.out.println("Good bye.");

    }
}
