package main;

public class Animals {
    private String species;
    private String name;
    private int age;

    public Animals(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;

    }
    public void printAnimals(){
        System.out.println(species+": "+name+", "+age+" vuotta");
    }
}
