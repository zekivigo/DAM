package Programacion.Septima_A_Novena_Semana.EstructurasSelectivas;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia:");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el year:");
        int year = sc.nextInt();
        dia++;

        if(dia > 30) { dia = 1; mes++;
            if(mes > 12) { mes = 1; year++;
            }
            System.out.println("El dia siguiente es " +dia
                + " " + mes + " " + year);}
    }
}
