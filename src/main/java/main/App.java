package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Zoo zoo = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi: ");
        String zooName = sc.nextLine();
        ArrayList<Zoo> animals = new ArrayList<>();

        boolean exit = false;
        while(!exit){
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()){
                String stringInput = sc.nextLine();
                int i = Integer.parseInt(stringInput);

                switch(i){
                    case 1:
                    System.out.println("Mikä laji?");
                    String species = sc.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String name = sc.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    String stringAge = sc.nextLine();
                    int age = Integer.parseInt(stringAge);
                    zoo = new Zoo(zooName, species, name, age);
                    animals.add(zoo);
                    break;

                    case 2:
                    System.out.println(zoo.getZooName()+" pitää sisällään seuraavat eläimet:");
                    for (Zoo animal : animals) {
                        System.out.println(animal.getSpecies()+": "+animal.getName()+", "+animal.getAge()+" vuotta");
                    }
                    
                    break;

                    case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    String stringj = sc.nextLine();
                    int j = Integer.parseInt(stringj);
                    for (Zoo animal : animals) {
                        for(int x = 1; x<=j; x++){
                            System.out.println(animal.getName()+" juoksee kovaa vauhtia!");}
                    }

                    break;

                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;

                    default:
                    System.out.println("Syöte oli väärä");
                    break;
                }
                

            }

         }
        sc.close(); 
    }
    
}
