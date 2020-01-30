package lab7;



public class Dog {
    //Attributes
    private String name;
    private  int age;
    private String hairColor;
    //constructor คือ เมธอดที่มีชื่อเดียวกันกับชื่อคลาส เมื่อมีการสร้างวัตถุ จะเรียกใช้งาน constructor เสมอ
    //1. default constructor
    public  Dog(){}
    //2. constructor ที่สร้างขึ้นมาใหม่
    public Dog(String name,int age,String hairColor){
        this.name =name;
        this.age =age;
        this.hairColor =hairColor;

    }
    // Behavior คือ พฤติกรรมของวัตถุ
    public void barking(){
        System.out.println("Dog barking");
    }
    public  void  sleeping(){
        System.out.println("Dog sleeping");
    }
    public void eating(){
        System.out.println("Dog eating");
    }
    // getter and setter methods ใช้สำหรับการอ่านและปรับปรุงข้อมูลใน attribtes ของคลาส
    //getter ใช้อ่านข้อมูล
    //setter ใช้ปรับปรุงหรือเปลี่ยนแปลงข้อมูล
    public String getName(){
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getage(){
        return this.age;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public void sethairColor (String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "[Name:" + this.name+
                "Age:"+ this.age+
                "Color:"+ this.hairColor + "]\n";
    }
}//class