package mschimmer.dev;

import com.github.javafaker.Faker;

/**
 * Created by markus on 05.02.17.
 */
public class Sandbox {

    public static void main(String[] args){

        System.out.println("Hello World");

        Faker faker = new Faker();

        String name = faker.name().fullName();

        System.out.println(name);

    }
}