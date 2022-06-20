package org.example;
import java.util.Random;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        while (patient.getState() == 1) {
            System.out.println("Take Medicine (0 = NO, 1 = YES): ");
            String valueScan = in.next();
            if (valueScan.equalsIgnoreCase("1")) {
                int min = 0;
                int max = 8;
                patient.TakeMedicine(random.nextInt(max - min + 1) + min);
            } else if (valueScan.equalsIgnoreCase("0")) {
                System.out.println("NOT TAKING MEDICINE!");
                patient.TakeMedicine(0);
            } else {
                System.out.println("INVALID");
                patient.DoDie();
                break;
            }
        }
        in.close();
        patient.DoDie();
    }
}
