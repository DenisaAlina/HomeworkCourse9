package com.fasttrack.exercise2_3;


public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Popescu", "Andrei");
        person.setBirthday(1989, 01, 01);
        System.out.println(person.fullName());
        System.out.println(person.age());
        Programmer programmer = new Programmer("Ghent", "Denisa");
        programmer.setBirthday(1995, 01, 8);
        System.out.println(programmer.fullName());
        System.out.println(programmer.age());
        DatabaseAdmin databaseAdmin = new DatabaseAdmin("Petrescu", "Mihai");
        databaseAdmin.setBirthday(1985, 02, 21);
        System.out.println(databaseAdmin.fullName());
        System.out.println(databaseAdmin.age());

    }
}
