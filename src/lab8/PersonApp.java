package lab8;

public class PersonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("1809900784143","chadarat","361211760019",
                "Infromation Technology");
        Person p1 = new Person("1809900784143","Srihamak");

        System.out.println(std1.getName());
        System.out.println(p1.getName());
    }
}
