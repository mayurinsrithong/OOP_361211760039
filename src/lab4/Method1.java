package lab4;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("hello From Main Method");
        A();
        System.out.println("hello From Main Method 2");
        A();
        A();
        B("mild");
        String myName = C("mayurin","Srithong");
        System.out.println(myName);
        System.out.println(C("mayurin","Srithong"));


    }
    //method type 1: no parameter, no return value
    public static void A() {
        System.out.println("hello From A Method.");
    }

    public static void B (String msg) {
            System.out.println("hello A Method." + msg);
        }
    public static String C(String fName,String Lname){
        System.out.println("hello From C Method.");
        String myName = fName + "" + Lname;
        return myName;
    }







}
