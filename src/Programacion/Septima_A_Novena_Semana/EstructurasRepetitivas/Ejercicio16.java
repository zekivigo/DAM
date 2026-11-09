package Programacion.Septima_A_Novena_Semana.EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo del Factorial de : ");
        int numero = sc.nextInt();

        long factorial = 1;
        int i = 1;
        if(numero != 0) {
            while (i <= numero){
                factorial *= i;
                i++;
            }

        }
        System.out.println(factorial);
    }
}
