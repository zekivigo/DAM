package Programacion.Septima_A_Novena_Semana.EstructurasSelectivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
        System.out.println("SI es bisiesto: " + year);
        } else {
            System.out.println("NO es bisiesto: " + year);
        }
}}
