package lab4;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter sn number 1");
        double x=sc.nextInt();
        System.out.print("Enter sn number 2");
        double y=sc.nextInt();
        double z= plus (x,y);
        System.out.println(x+"+"+y+"="+z);
        double a= minus (x,y);
        System.out.println(x+"-"+y+"="+z);
        double b= times (x,y);
        System.out.println(x+"*"+y+"="+z);
        double c= devided (x,y);
        System.out.println(x+"/"+y+"="+z);



    }

    private static double devided(double x, double y) {
        return x/y;
    }

    private static double times(double x, double y) {
        return x*y;
    }

    private static double minus(double x, double y) {
        return x-y;
    }

    private static double plus(double x, double y) {
        return x+y;
    }
}
