package br.com.renatoviana.section06._0603;

import br.com.renatoviana.section05._0505.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person person = new Person("Robert", "Martin");

        System.out.printf("His name is %s %s %n", person.getFirstName(), person.getLastName());

        person.setFirstName("Uncle Bob");
        System.out.printf("His name is %s %n", person.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.printf("The max value is %d %n", maxInt);

    }
}
