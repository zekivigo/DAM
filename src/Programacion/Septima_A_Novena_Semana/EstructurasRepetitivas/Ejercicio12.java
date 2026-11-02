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
            System.out.print("For: ");
            for (int i = numeroMayor; i >= numeroMenor; i--) {
                System.out.print(i + ", ");
            }
        }else {
            System.out.println("Orden introducido incorrecto");
            return;
        }

        int parawhile = numeroMayor;
        System.out.print("\nWhile: ");
        while (numeroMenor <= parawhile) {
            System.out.print (parawhile + ", ");
            parawhile--;
        }

        int paradowhile = numeroMayor;
        System.out.print("\nDo while: ");
        do {
            System.out.print (paradowhile + ", ");
            paradowhile--;
        } while (paradowhile >= numeroMenor);
  }
}
