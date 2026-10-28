package Programacion.Septima_A_Novena_Semana.EstructurasSelectivas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero A: ");
        int numeroA = sc.nextInt();
        System.out.println("Ingrese el numero B: ");
        int numeroB = sc.nextInt();
        System.out.println("Ingrese el numero C: ");
        int numeroC = sc.nextInt();

        if (numeroA == numeroB && numeroA == numeroC) {
            System.out.println("Todos los numeros son iguales");
        } else if (numeroA > numeroB && numeroA > numeroC) {
            System.out.println("A es el mayor");
        } else if (numeroA > numeroB && numeroA == numeroC) {
            System.out.println("A y C son los mayores");
        } else if (numeroB > numeroA && numeroC < numeroB) {
            System.out.println("B es el mayor");
        } else if (numeroB > numeroC && numeroB == numeroA) {
            System.out.println("B y A son los mayores");
        } else if (numeroC > numeroA && numeroC > numeroB) {
            System.out.println("C es el mayor");
        } else if (numeroC > numeroA && numeroC == numeroB) {
            System.out.println("C y B son los mayores");
        }


    }
}
