package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero mayor: ");
        int numeroMayor = sc.nextInt();
        System.out.println("Introduce el numero menor: ");
        int numeroMenor = sc.nextInt();

        if (numeroMayor > numeroMenor) {
            for (int i = numeroMayor; i >= 1; i--) {
                System.out.println(i + " ");
            }
        }else {
            System.out.println("Orden introducido incorrecto");
        }

       // while (numeroMayor >= numeroMenor) {

        //}
    }
}
