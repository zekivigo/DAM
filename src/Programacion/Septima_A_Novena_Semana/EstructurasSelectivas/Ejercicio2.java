package Programacion.Septima_A_Novena_Semana.EstructurasSelectivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero A: ");
        int numeroA = sc.nextInt();
        System.out.println("Ingrese el numero B: ");
        int numeroB = sc.nextInt();

        if (numeroA < numeroB) {
            System.out.println("El numero "
                    +numeroA + " es menor que el numero " +
                    numeroB);
        } else {
            System.out.println("El numero " + numeroB
                    + " es menor que el numero "
                    + numeroA);
        }}
}

