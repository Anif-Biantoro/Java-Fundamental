package com.juaracoding;

import java.util.ArrayList;

public class CollectionJava {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        // create
        System.out.println("--- create ---");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());

        // read/get all data
        System.out.println("--- get all data ---");
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println("--- get all data cara 2 ---");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // read/get 1 data
        System.out.println("--- get 1 data ---");
        System.out.println(cars.get(2));

        // update
        System.out.println("--- update ---");
        cars.set(2,"Volks Wagen");
        System.out.println(cars.get(2));

        // delete
        System.out.println("--- delete ---");
        cars.remove(3);
        for(String car : cars){
            System.out.println(car);
        }

        // menu crud switch case, looping, collection java


    }

}
