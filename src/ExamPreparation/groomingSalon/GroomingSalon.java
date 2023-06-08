package ExamPreparation.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private int capacity;
    private List<Pet> pets;

    public GroomingSalon(int capacity, List<Pet> pets) {
        this.capacity = capacity;
        this.pets = new ArrayList<>();
    }

    public void add (Pet pet){
        pets.add(pet);
    }

    public boolean remove (String name){
        return pets.removeIf(pet -> pet.getName().equals(name));
//        for (Pet pet : pets) {
//            if(pet.getName().equals(name)){
//                pets.remove(pet);
//                return true;
//            }
//        }
//        return false;
    }

    public Pet getPet(String name, String owner) {
        return pets.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst()
                .orElse(null);
    }

    public int getCount (List<Pet> petsList){
        return petsList.size();
    }



}
