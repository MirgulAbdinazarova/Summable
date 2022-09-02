package com.Summable;

public class Main {
    public static void main(String[] args) {
        // бул жерден эки шаардын калкын
        // консолго кошуп чыгарыныз
        City city=new City("New York",8804190);
        City city1=new City("Bishkek",1071261);
        System.out.println(city);
        System.out.println("--------------");
        System.out.println(city1);
        System.out.println("--------------");

        System.out.println("Sum of populations="+city.add(city1));


    }
}
