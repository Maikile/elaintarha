package main;


public class Zoo {
    private String species;
    private String name;
    private String zooName;
    private int age;


    public Zoo(String zooName, String species, String name, int age){
        this.zooName = zooName;
        this.species = species;
        this.name = name;
        this.age = age;

    }
    
    public String getZooName(){
        return this.zooName;
    }
    public String getSpecies(){
        return this.species;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}