package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotBookApp {
    public static void main(String[] args){

        List<Notebook> myList = new ArrayList<Notebook>();
        System.out.println(myList); //null
        myList = addNoteBook(myList);

        System.out.println(myList);

        myList = addNoteBook(myList);
        System.out.println(myList);
    }//main

    private static List<Notebook> addNoteBook(List<Notebook> myList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter CPU: ");
        String cpu = sc.nextLine();
        System.out.print("Enter GPU: ");
        String gpu = sc.nextLine();
        System.out.print("Enter RAM: ");
        String ram = sc.nextLine();
        System.out.print("Enter Display:");
        String display = sc.nextLine();
        System.out.print("Enter HDD:");
        String hdd = sc.nextLine();
        System.out.print("Enter OS: ");
        String os = sc.nextLine();
        System.out.println("Enter Price: ");
        double price = sc.nextDouble();

        //create object
        Notebook np = new Notebook(brand, model, cpu, gpu, ram, display, hdd, os, price);
        //add object into List
        myList.add(np);

        return myList;
    }
}//class