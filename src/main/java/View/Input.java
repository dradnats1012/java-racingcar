package View;

import java.util.Scanner;

public class Input {

    public String getNames() {

        Scanner nameScan = new Scanner(System.in);
        String name = nameScan.next();

        return name;
    }

    public int getArrival() {

        Scanner arrivalScan = new Scanner(System.in);
        int arrival = arrivalScan.nextInt();

        return arrival;
    }

}
