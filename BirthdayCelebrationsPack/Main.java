package BirthdayCelebrationsPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Citizen> citizens = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();

        String line = read.readLine();
        while (!"End".equals(line)){
            String[] tokens = line.split("\\s+");
            switch (tokens[0]){
                case "Citizen":
                    Citizen citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    citizens.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(tokens[1], tokens[2]);
                    pets.add(pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(tokens[1], tokens[2]);
                    robots.add(robot);
                    break;
            }

            line = read.readLine();
        }

        line = read.readLine();
        for (Citizen citizen : citizens) {
            if (citizen.getBirthDate().substring(citizen.getBirthDate().length() - line.length()).equals(line)){
                System.out.println(citizen.getBirthDate());
            }
        }

        for (Pet pet : pets) {
            if (pet.getBirthDate().substring(pet.getBirthDate().length() - line.length()).equals(line)){
                System.out.println(pet.getBirthDate());
            }
        }

    }

}
