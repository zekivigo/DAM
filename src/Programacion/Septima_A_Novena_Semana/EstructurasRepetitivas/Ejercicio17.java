package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("multiplos de 8 hasta el numero: ");
        int numero = sc.nextInt();

        int multiplo = 8;

        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            // RECUERDA; en el "for" creamos i y le damos el valor inicial de 1.
            System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}