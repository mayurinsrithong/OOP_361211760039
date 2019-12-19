package lab3;

import java.util.Scanner;

public class control2 {
    public static void main(String[] args) {
        //if-else : เลือกทำอย่างใดอย่างหนึ่ง
 //       if (เงื่อนไข)}
//
  //         มื่อคำสัง if เป็นจริง;
  //      }else{
  //      คำสั่งเมื่อ if เป็นเท็จ;
   //     }
        int x = 10;
    if ((x/2)>5){
        System.out.println("x more than 5.");
    }else {
        System.out.println("x less than 5.");
    }
        //Are old cr young? > 50 == young
        Scanner sc = new Scanner(System.in);
    System.out.print("How old are you? :");
    int age = sc.nextInt();
    if (age>50) {
        System.out.print("you are old" +
                "");
    }else {
        System.out.print("you are young.");
    }




    }//main
}
