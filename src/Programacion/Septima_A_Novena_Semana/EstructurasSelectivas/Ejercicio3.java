package Programacion.Septima_A_Novena_Semana.EstructurasSelectivas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero "
                    +numero + " es un numero positivo");
        } else if ( numero < 0) {
            System.out.println("El numero "
                    +numero + " es un numero negativo");
        } else { //Ejercicio 6.
            System.out.println("El numero "
                    +numero + " no es negativo ni positivo.");
    }
}}
