package main;

public class Main {

    public static void main(String[] args) {
        // Since same package yung person class, no need to import
        // Class Instantiation: ClassName identifier = new ClassName();
        // Create 2 different persons using only 1 class
        Person p = new Person();
        p.firstName = "Angelo";
        p.lastName = "Dacasin";
        p.sex = 'M';
        p.age = 25;

        Person p1 = new Person ();
        p1.firstName = "David";
        p1.lastName = "Sdpt";
        p1.sex = 'M';
        p1.age = 19;

        System.out.println(p.firstName);
        System.out.println(p.lastName);
        System.out.println(p.sex);
        System.out.println(p.age);

        System.out.println();

        System.out.println(p1.firstName);
        System.out.println(p1.lastName);
        System.out.println(p1.sex);
        System.out.println(p1.age);
    }
}