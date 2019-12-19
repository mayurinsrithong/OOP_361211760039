package lab3;

import java.util.Scanner;

public class control3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("How old are?");
        int age =sc.nextInt();
        if (age>50) {
            System.out.println("you are old.");
        }else if (age>20) {
            System.out.println("you are teenager.");
        }else {
            System.out.println("you are young");
        }

    }
}
