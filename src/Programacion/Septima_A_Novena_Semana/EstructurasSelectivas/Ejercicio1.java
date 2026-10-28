package Programacion.Septima_A_Novena_Semana.EstructurasSelectivas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero par: ");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
        System.out.println("El numero "
                +numero + " es un numero par");
    } else {
        System.out.println("El numero "
                +numero + " es un numero impar");
    }}
}
