package Programacion.QuintaySextaSemana;

public class PruebaCirculo {
    public static void main(String[] args) {
        //EJERCICIO 2:
        Circulo circulo = new Circulo();
        circulo.radio = 6;
        System.out.println("Ejercicio 2 \nRadio: " +circulo.radio + ". Pi: " + circulo.Pi);

        //EJERCICIO 4:
        Circulo_Ejercicio4 circulo2 = new Circulo_Ejercicio4();
        //circulo2.radio;
        //circulo2.PI;
        //Inaccesibles desde fuera de la clase.

        //EJERCICIO 5:
        Circulo circulo3 = new Circulo();
        System.out.println("\nEjercicio 5\n" + circulo3.radio);

}}
