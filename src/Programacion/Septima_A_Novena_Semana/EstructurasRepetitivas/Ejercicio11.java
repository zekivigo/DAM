package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Todos los numeros hasta llegar a 1: ");
        int escaner = sc.nextInt();

        int paradowhile = escaner;
        System.out.print("\ndo while: ");
        do {
            System.out.print(paradowhile + ", ");
            paradowhile--;
        } while (paradowhile >= 1);

        int parado = escaner;
        System.out.print("\nfor: ");
        for (int i = parado; i >= 1; i--) {
            System.out.print( i + ", ");
        }

        int parawhile = escaner;
        System.out.print("\nWhile: ");
        while (parawhile >=1) {
            System.out.print(parawhile + ", ");
            parawhile--;
        }
    }
}
