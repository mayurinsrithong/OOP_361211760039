package lab2;

import java.util.Scanner;

public class Exercise_lab2 {


    public static void main (String[]args){
        //step 1: input
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter your weight:");
        double w=SC.nextDouble();
        System.out.print("Enter your height (meter");
        double h=SC.nextDouble();
        //Step 2:Calculate
        double bmi = w / (h*h);
        //step 3 print result
        System.out.println("Your BMI:"+bmi);
    }

}
