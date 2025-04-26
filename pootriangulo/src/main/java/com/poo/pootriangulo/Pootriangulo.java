package com.poo.pootriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Pootriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC;
        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        
        sc.close();
        
    }
}
