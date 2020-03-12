package lab8_2;

public class PersonApp {
    public static void main(String[] args) {

        //create objiects
        Preson P1 = new Preson("chadarat", "1997");
        Preson P2 = new Sheriff("Srihamak","1994", "thungsong");
        Preson P3 = new Police("warayu","1994", "Nakhon");

        P1.introduce();
        P2.introduce();
        P3.introduce();


    }
}
