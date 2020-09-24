package FoodShortagePack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Citizen> citizenMap = new LinkedHashMap<>();
        Map<String, Rebel> rebelMap = new LinkedHashMap<>();

        int number = Integer.parseInt(read.readLine());
        for (int i = 0; i < number ; i++) {
            String[] tokens = read.readLine().split("\\s+");
            if (tokens.length == 4){
                if (!rebelMap.containsKey(tokens[0])){
                    Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                    citizenMap.putIfAbsent(tokens[0], citizen);
                }

            }else if (tokens.length == 3){
                if (!citizenMap.containsKey(tokens[0])){
                    Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    rebelMap.putIfAbsent(tokens[0], rebel);
                }


            }

        }

        String line = read.readLine();
        int resultCitizen = 0;
        int resultRebel = 0;
        while (!"End".equals(line)){
            if (citizenMap.containsKey(line)){
                citizenMap.get(line).buyFood();
                resultCitizen += citizenMap.get(line).getFood();
            }else if (rebelMap.containsKey(line)){
                rebelMap.get(line).buyFood();
                resultRebel += rebelMap.get(line).getFood();
            }

            line = read.readLine();
        }

        System.out.println(resultCitizen + resultRebel);
    }
}
