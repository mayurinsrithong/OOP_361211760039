package lab2;

public class basicjava1 {
    public static void main(String[] args) {
        //variables
        //integer - จำนวนเต็ม

        int x;
        x=10;
        System.out.println(x);
        int y =-100;
        System.out.println(y);
        int Z = x+y; // z=?
        System.out.println(Z);

        //floating - จำนวนจริง ตัวเลขที่ทศนิยม
        // float , double
        float n = 10.10f;
        System.out.println(n);
        double d =50.50 ;
        System.out.println(d);
        System.out.println(n*d);
        //characher ตัวอักษร 1 อักษร เท่านั้น
        char C = '#';
        System.out.println(C);

        //string ข้อความ คือ ตัวอักษรที่เรียงกันตั้งแต่ 2 ตัวขึ้นไป
        //string เป็นคลาสใน JAVA ดั้งนั้นการประกาศตัวแปรคือการสร้าง object ของคลาส
        String s = "NUDCHANAD SENSOM";
        System.out.println(s);
        int count = s.length();
        System.out.println(count);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());

        //concatination string การต่อ sting
        String myAddress = "@ SAIYAI";
        String msg = s +" "+ myAddress; // msg = ?

        System.out.println(msg);
        System.out.println(s.concat(" "+myAddress));

        //Boolean ข้อมูลที่เป็นประเภท จริง (true) และ เท็จ (false)
        boolean b =true;
        boolean r =false;
        System.out.println(b+" "+r);


    }//main


}//class