package lab8_2;

public class Pofice extends Person {
        private String WorkCountry;

    public Pofice(String name, String dateOfBirth, String workCountry) {
        super(name, dateOfBirth);
        this.WorkCountry = workCountry;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I work at "+this.WorkCountry);
    }

    //getter and setter

    public String getWorkCountry() {
        return WorkCountry;
    }

    public void setWorkCountry(String workCountry) {
        WorkCountry = workCountry;
    }

    //toString

    @Override
    public String toString() {
        return "Pofice{" +
                "WorkCountry='" + WorkCountry + '\'' +
                "} " + super.toString();
    }
}
