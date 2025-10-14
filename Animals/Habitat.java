package Animals;

import java.util.ArrayList;

public class Habitat {
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> animals;

    Habitat(String name, double latitude, double longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.animals = new ArrayList<Animal>();
    }
    public double getLongitude(){
        return longitude;
    }
    public double getLatitude(){
        return latitude; 
    }
    public String getName(){
        return name;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumOfAnimals(){
        return animals.size();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void testAnimals(){
        System.out.println(name);
        System.out.println(latitude);
        System.out.println(longitude);
        System.out.println(getNumOfAnimals());
        for (Animal animal : animals) {
            animal.performEat();
            animal.performSound();
            animal.performMove();
            /**if (animal instanceof Pet) {     No pet class anymore
                ((Pet)animal).play();
                ((Pet)animal).beFriendly();
                
            }**/
        }
        
    }
}
