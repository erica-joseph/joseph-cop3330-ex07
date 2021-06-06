import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        DecimalFormat d2f = new DecimalFormat("#.####");
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int len = sc.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int wid = sc.nextInt();
        int area = len * wid;
        System.out.println("The area is");
        System.out.println(area + " square feet.");
        double conversion = area*0.09290304;
        System.out.println(d2f.format(conversion) + " square meters");
    }
}