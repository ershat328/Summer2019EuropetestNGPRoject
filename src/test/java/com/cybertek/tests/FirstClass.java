package com.cybertek.tests;

import com.github.javafaker.Faker;

public class FirstClass {


    public static void main(String[] args) {


        Faker Faker= new Faker ();

        System.out.println(Faker.name().fullName());
        System.out.println(Faker.address().country());
        System.out.println(Faker.backToTheFuture().character());



    }


}

