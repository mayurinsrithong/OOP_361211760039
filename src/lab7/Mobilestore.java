package lab7;

public class Mobilestore {

    public static void main(String[] args){
        Mobile Mobile1 = new Mobile();

        Mobile1.setmobileID("1001");
        Mobile1.setbrand("Wiko");
        Mobile1.setgeneration("Sunny 4 Plus");
        Mobile1.setprice(2090);
        Mobile1.setsystem("Android 9 Go");

        System.out.println(Mobile1.getmobileID());
        System.out.println(Mobile1.getbrand());
        System.out.println(Mobile1.getgeneration());
        System.out.println(Mobile1.getprice());
        System.out.println(Mobile1.getsystem());

        Mobile mobile2 = new Mobile( "2002","Apple","iPhone 11 Pro",
                35900, "iOS13");

        System.out.println(mobile2.getmobileID());
        System.out.println(mobile2.getbrand());
        System.out.println(mobile2.getgeneration());
        System.out.println(mobile2.getprice());
        System.out.println(mobile2.getsystem());

        Mobile mobile3 = new Mobile( "3003","Samsung","Galaxy E7",
                11500, "Android 4.4");

        System.out.println(mobile3.getmobileID());
        System.out.println(mobile3.getbrand());
        System.out.println(mobile3.getgeneration());
        System.out.println(mobile3.getprice());
        System.out.println(mobile3.getsystem());

    }
}
