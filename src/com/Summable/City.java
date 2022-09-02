package com.Summable;

public class City implements Summable{
    private int population;
    private String name;
    City(String name, int population) {
        this.population = population;
        this.name = name;
    }

    @Override
    public int add(Summable other) {
        // метод логикасын жазыныз
         return other.getValue()+this.population;
    }

    @Override
    public int getValue() {
        // метод логикасын жазыныз
        return population;
    }

    @Override
    public String toString() {
        return name + " population is: " + population;
    }
}
