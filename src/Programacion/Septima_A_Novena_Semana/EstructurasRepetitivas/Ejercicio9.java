package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Todos los numeros hasta el que tu introduzcas: ");
        int numero = sc.nextInt();

        System.out.print("for: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print( i + ", ");
        }

        System.out.print("\nWhile: ");
        int numero2 = 1;
        while (numero2 <= numero) {
            System.out.print(numero2 + ", ");
            numero2++;
        }

        System.out.print("\ndo while: ");
        int numero3 = 1;
        do {
            System.out.print(numero3 + ", ");
            numero3++;
        } while (numero3 <= numero);


    }
}
