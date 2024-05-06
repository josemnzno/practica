package com.example.practica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("Menu de Tablas de Multiplicar:");
            System.out.println("1. Mostrar una tabla.");
            System.out.println("2. Mostrar tablas del 2 al 5.");
            System.out.println("3. Salir.");
            System.out.print("Ingrese su opcion: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    showMultiplicationTable(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }

    public static void showMultiplicationTable(Scanner scanner) {
        System.out.print("Ingrese el número para mostrar su tabla de multiplicar: ");
        int number = scanner.nextInt();

        System.out.println("Tabla de Multiplicar del " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }


}
