package BorderControlPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        List<Robot> robots = new ArrayList<>();
        List<Citizen> citizens  = new ArrayList<>();

        String line = read.readLine();
        while (!"End".equals(line)){
            String[] tokens = line.split("\\s+");
            if (tokens.length == 3){
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]),tokens[2] );
                citizens.add(citizen);
            }else {
                Robot robot = new Robot(tokens[0], tokens[1]);
                robots.add(robot);
            }

            line = read.readLine();
        }

        String numberFakeId =  read.readLine();

        for (Citizen cit : citizens) {
            String id = cit.getId();
            if (id.substring(id.length() - numberFakeId.length()).equals(numberFakeId)){
                System.out.println(id);
            }
        }
        for (Robot robot : robots) {
            String id = robot.getId();
            if (id.substring(id.length() - numberFakeId.length()).equals(numberFakeId)){
                System.out.println(id);
            }
        }
    }




}
