package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

public class Ejercicio10 {
    public static void main(String[] args) {

        System.out.print("While: ");
        int numero1 = 100;
        while(numero1 >= 1) {
            System.out.print(numero1 + " ");
            numero1--;
        }

        System.out.print("\nFor: ");
        for(int contador = 100; contador >= 1 ; contador--) {
            System.out.print(contador + " ");
        }

        System.out.print("\nDoWhile: ");
        int numero2 = 100;
        do {
            System.out.print(numero2 + " ");
            numero2--;
        } while(numero2 >= 1);
}}
