package lab3;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int total =0;
        for (int i =0; i< 5; i++){
            System.out.print("enter a integer:");
            total+= sc.nextInt();
            System.out.println("the total value is:"+total);
            System.out.println("the average value is:"+(total/5));
        }
    }
}
