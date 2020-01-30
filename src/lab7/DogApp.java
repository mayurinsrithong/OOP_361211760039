package lab7;

public class DogApp {

    public static void main(String[] args) {
        //create object สร้างวัตถุ
        //1.ใช้ default constructor คือสร้าง object ว่างๆยังไม่มีข้อมูลอะไร
        Dog dog1 = new Dog();

        dog1.setName("Dang");
        dog1.setAge(3);
        dog1.sethairColor("Brow");

        System.out.println(dog1.getName());
        System.out.println(dog1.getage());
        System.out.println(dog1.getHairColor());

        //2. ใช้ constructor ที่มีการับพารามิเตอร์
        //เป็นการสร้างวัตถุ พร้อมกับกำหนดข้อมูลให้กับวัตถุ
        Dog dog2 = new Dog("Dum",5, "Black");

        System.out.println(dog2.getName());
        System.out.println(dog2.getage());
        System.out.println(dog2.getHairColor());


        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

    }
}
