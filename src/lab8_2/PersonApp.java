package lab8_2;

public class PersonApp {
    public static void main(String[] args) {

        //create objiects
        Person P1 = new Person("Mayurin Srithong", "1997");
        Person P2 = new sheriff("Piyapne Senanus","1984", "Nakornsi thammarat");
        Person P3 = new Pofice("Nattapong Kaewboonma","1980", "Nakhon");

        P1.introduce();
        P2.introduce();
        P3.introduce();


    }
}
