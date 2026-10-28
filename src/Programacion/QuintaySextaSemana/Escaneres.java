package Programacion.QuintaySextaSemana;

import java.util.Scanner;

public class Escaneres {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese el numero A: ");
        double A = sc1.nextDouble();
        System.out.println("Ingrese el numero B: ");
        double B = sc1.nextDouble();
        double resultado = A + B;

        System.out.println("El resultado es: " + resultado);
    }
}
