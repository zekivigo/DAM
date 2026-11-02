package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Edad del alumno 1: ");
        int edad1 = sc.nextInt();
        System.out.println("Edad del alumno 2: ");
        int edad2 = sc.nextInt();
        System.out.println("Edad del alumno 3: ");
        int edad3 = sc.nextInt();
        System.out.println("Edad del alumno 4: ");
        int edad4 = sc.nextInt();
        System.out.println("Edad del alumno 5: ");
        int edad5 = sc.nextInt();

        System.out.println("altura del alumno 1: ");
        double altura1 = sc.nextDouble();
        System.out.println("altura del alumno 2: ");
        double altura2 = sc.nextDouble();
        System.out.println("altura del alumno 3: ");
        double altura3 = sc.nextDouble();
        System.out.println("altura del alumno 4: ");
        double altura4 = sc.nextDouble();
        System.out.println("altura del alumno 5: ");
        double altura5 = sc.nextDouble();

        int[] edades = {edad1, edad2, edad3, edad4, edad5};
        double[] alturas = {altura1, altura2, altura3, altura4};
        double edadMedia = (double) (edad1 + edad2 + edad3 + edad4 + edad5) / 5;
        double alturaMedia = (altura1 + altura2 + altura3 + altura4 + altura5) / 5;

        int contador = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                contador++;
            }
        }

        int contador2 = 0;
        for (double altura : alturas) {
            if (altura >= 1.75) {
                contador2++;
            }
        }

        System.out.println("La edad media es:  " + edadMedia);
        System.out.println("La altura media es:  " + alturaMedia);
        System.out.println("Alumnos mayores de edad: " +contador);
        System.out.println("Alumnos con altura mayor a 1.75: " +contador2);
    }
}
