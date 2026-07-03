/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperature;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("choose fromthe 2 choices ");
        System.out.println("1.celsius to fahrenheit");
        System.out.println("2.fahrenheit to celsius");
        int choice = input.nextInt();
        System.out.print("enter temperature value ");
        double temperature = input.nextDouble();
        if (choice == 1)
            System.out.println(celsiustofahrenheit(temperature));
        else if (choice == 2)
            System.out.println(fahrenheittocelsius(temperature));
        else
            System.out.println("invalid choice");
        input.close();
    }
    public static double celsiustofahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double fahrenheittocelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}

