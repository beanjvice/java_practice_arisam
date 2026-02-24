package assignment2_arisam;

import java.io.*;
import java.util.Scanner;

public class Assignment2_arisam{

    public static void main(String[] args){
        double a,b,c,alpha,beta;

        Scanner scan = new Scanner(System.in);

        System.out.println("This program calculates the two inner angles of a given right-angle triangle. \n\n");

        System.out.print("Enter side a = ");
        a = scan.nextDouble();
        System.out.print("Enter side b = ");
        b = scan.nextDouble();

        c = Math.sqrt(a*a + b*b);
        alpha = Math.atan(b/a) * 180/Math.PI;
        beta = 90.0 - alpha;

        System.out.println("\n\nSide a = " + a);
        System.out.println("\n\nSide b = " + b);
        System.out.println("Hypotenuse" + " c = " + c);
        System.out.println("\n Inner Angle Alpha = " + alpha);
        System.out.println("\nInner Angle Beta = " + beta);
    }

}