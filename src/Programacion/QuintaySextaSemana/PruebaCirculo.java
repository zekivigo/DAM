package Programacion.QuintaySextaSemana;

public class PruebaCirculo {
    public static void main(String[] args) {
        //EJERCICIO 2:
        Circulo circulo = new Circulo();
        circulo.radio = 6;
        System.out.println("Ejercicio 2 \nRadio: " +circulo.radio + ". Pi: " + circulo.PI);

        //EJERCICIO 4:
        Circulo_Ejercicio4 circulo2 = new Circulo_Ejercicio4();
        //circulo2.radio;
        //circulo2.PI;
        //Inaccesibles desde fuera de la clase.

        //EJERCICIO 5:
        Circulo circulo3 = new Circulo();
        System.out.println("\nEjercicio 5\n" + circulo3.radio);

        //EJERCICIO 8:
        Circulo circulo4 = new Circulo(4);
        System.out.println("\nEjercicio 8\n" + "Radio: " + circulo4.radio + ". Pi: " + circulo4.PI);

        //Ejercicio 10:
        Circulo_Ejercicio4 circulo_Ejercicio10 = new Circulo_Ejercicio4();
        System.out.println("\nEjercicio 10");
        circulo_Ejercicio10.setRadio(-1.5);
        System.out.println(circulo_Ejercicio10.getRadio());

        //EJERCICIO 12:
        Circulo_Ejercicio4 circulo_Ejercicio12 = new Circulo_Ejercicio4();
        System.out.println("\nEjercicio 12");
        circulo_Ejercicio12.setRadio(4.0);
        circulo_Ejercicio12.imprimirDatos();
        circulo_Ejercicio12.aumentarRadio(4.00);
        circulo_Ejercicio12.imprimirDatos();

}}
