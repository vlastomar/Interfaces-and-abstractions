package Ferrari.Pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String driverName = read.readLine();
        Car car = new Ferrari(driverName);
        System.out.println(car.toString());

    }
}
