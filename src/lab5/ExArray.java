package lab5;

public class ExArray {

    //Array คือ ตัวแปรชนิดหนึ่ง ที่สามมารถเก็บข้อมูลได้หลายข้อมูลในตัวแปร 1 ตัว โดยใช้เลข index
    //ในการระบุถึงตำแหน่งแต่ละตัวเลขข้อมูล เลข index นี้จะเริ่มต้นที่ 0 เสมอ
    public static void main(String[] args) {

        int x[]= new int[5];
        //ตัวแปร x สามารถเก็บข้อมูลจำนวนเต็มได้ 5 จำนวน

        System.out.print(x[0]); //แสดงข้อมูลใน x ตำแหน่งที่ 0
        x[3] = 100;
        x[1] = x[0] + x[3];
        x[4] = x[1] * 3;

        System.out.print(x[0]);
        System.out.print(x[1]);
        System.out.print(x[2]);
        System.out.print(x[3]);
        System.out.print(x[4]);

        //error
        //System.out.print(x[5]);
        //System.out.print(x[-1]); //indexOutofBound Exception
        //




    }
}