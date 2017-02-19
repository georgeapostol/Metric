package com.example;

/**
 * Created by LostSouls on 2/16/17.
 */
import java.util.Scanner;

public class Metric {
    public static void main(String[] args) {
        int kg = 200;
        int m = 28;
        int cm = 47;
        int kmh = 27;
        int L = 92;
        int km = 168;

        double lbs = kg * 2.2;
        double ft = m * 3.28;
        double in = cm / 2.54;
        double fts = kmh * .91;
        double gal = L * .264;
        double mi = km * .62;

        System.out.println(kg + "kg is " + lbs + " in pounds");
        System.out.println(m + "m is " + ft + " in feet");
        System.out.println(cm + "cm is " + in+ " in inches");
        System.out.println(kmh + "km/h is " + fts + " in feet per second");
        System.out.println(L + "L is " + gal + " in gallons");
        System.out.println(km + "km is " + mi + " in miles");



    }
}
//    Scanner input = new Scanner(System.in);
//        String kg;
//        System.out.println("Enter the kg amount: ");
//        kg = input.next();
//
//        Integer kgtopoind = int kg * 2.2;
//        System.out.println(kg + "kg is "+ );
//        double cmToin = .39;
