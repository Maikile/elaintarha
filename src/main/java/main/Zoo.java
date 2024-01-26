package main;
import java.util.ArrayList;


public class Zoo {
    private String species;
    private String name;
    private String zooName;
    private int age;
    private ArrayList<Animals> animals = new ArrayList<>();


    public Zoo(String zooName, String species, String name, int age){
        this.zooName = zooName;
        this.species = species;
        this.name = name;
        this.age = age;
        animals.add(new Animals(species, name, age));

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
    public void run(){
        System.out.println(name+" juoksee kovaa vauhtia!");
    }
}
