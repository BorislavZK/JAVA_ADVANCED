package ExamPreparation.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private int capacity;
    private List<Pet> data = new ArrayList<>();

    public GroomingSalon(int capacity) {
        this.capacity = capacity;

    }

    public void add(Pet pet) {

        if(data.size() < capacity){
        data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(pet -> pet.getName().equals(name));
//        for (Pet pet : pets) {
//            if(pet.getName().equals(name)){
//                pets.remove(pet);
//                return true;
//            }
//        }
//        return false;
    }

    public Pet getPet(String name, String owner) {
        return data.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {

        StringBuilder sb = new StringBuilder("The grooming salon has the following clients:").append(System.lineSeparator());
        for (Pet pet : data) {
            sb.append(pet.getName())
                    .append(" ")
                    .append(pet.getOwner())
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
    
}
