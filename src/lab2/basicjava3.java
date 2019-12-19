package lab2;

import java.util.Scanner;

public class basicjava3 {
    public static  void  main (String[]args){
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter an number : ");
        int num = SC.nextInt();
        System.out.println("The number is"+num );

        System.out.print("Enter floating number ");
        double d= SC.nextDouble();
        System.out.println("The floating is "+d);
    }
}