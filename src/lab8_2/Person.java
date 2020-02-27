package lab8_2;

public class Person {
    private String name;
    private String bornYear;

    public Person(String name, String bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }
    public void introduce(){
        System.out.println("My name is: "+this.name);
        System.out.println("I was born in:"+this.bornYear);
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return bornYear;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.bornYear = dateOfBirth;
    }

    //toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + bornYear + '\'' +
                '}';
    }
}
