package lab2;

import java.util.Scanner;

public class basicjava2 {

    public static void  main (String[]args) {
        //input data from keyboard

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = SC.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter Your tel");
        String tel = SC.nextLine();
        System.out.println("Your tel is "+ tel);

        System.out.println("Enter your email");
        String email=SC.nextLine();
        System .out.println("Your email is "+email);

    }//main

}//class