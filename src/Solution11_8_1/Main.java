package Solution11_8_1;

import java.util.*;

/*
Написать класс домашних животных с полями animalBreed, name, weight,
реализовать сортировку по значению weight.

В отдельном классе реализовать сортировку по длине клички.
 */
public class Main {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();

        petList.add(new Pet("Cat", "Barsik", 2.7));
        petList.add(new Pet("Dog", "Bobik", 5.8));
        petList.add(new Pet("Parrot", "Kesha", 0.5));
        petList.add(new Pet("Dog", "Bob", 2.2));
        petList.add(new Pet("Pig", "Hrew", 9.4));
        petList.add(new Pet("Spider", "William", 0.06));
        petList.add(new Pet("Mouse", "Lu", 0.1));

        System.out.println(petList);

        System.out.println("\nСортировка по длине клички:");
        Collections.sort(petList, new ComparatorNameLength());
        System.out.println(petList);

        Set<Pet> petSet = new TreeSet<>(petList);
        System.out.println("\nСортировка по весу:");
        System.out.println(petSet);


    }

}

class Pet implements Comparable<Pet> {
    private final String animalBreed;
    private final String name;
    private double weight;

    public Pet(String animalBreed, String name, double weight) {
        if(animalBreed == null || name == null || weight < 0)
            throw new IllegalArgumentException();

        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return animalBreed.equals(pet.animalBreed) && name.equals(pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "animalBreed='" + animalBreed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Pet o) {
        return (int) (this.weight - o.weight);
    }
}


class ComparatorNameLength implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        return o2.getName().length() - o1.getName().length();

//        if (o1.getName() == o2.getName()) {
//            return 0;
//        }
//        if (o1.getName().equals(o2.getName())) {
//            return 1;
//        } else {
//            return -1;
//        }
    }
}