package Programacion.Prog_Rodriguez_Barros_Ezequiel_Tarea01.Principal;

import Programacion.Prog_Rodriguez_Barros_Ezequiel_Tarea01.Secundario.Genero;
import Programacion.Prog_Rodriguez_Barros_Ezequiel_Tarea01.Secundario.Libro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456789A", "Libro de ejemplo", 5, 18.99f);
        libro1.setPaginas(702);
        libro1.setGenero(Genero.literatura);

        Libro libro2 = new Libro("2345123B", "Libro de ejemplo 2",670,
                Genero.gastronomia, 3, 22.89f);

        System.out.println("Libro2 tiene " + libro2.getNumeroEjemplares() + " ejemplares"
                +" y " + libro2.getNumeroPrestamos() + " prestamos");

        libro2.prestarLibro();

        System.out.println("Libro2 tiene " + libro2.getNumeroEjemplares() + " ejemplares"
                +" y " + libro2.getNumeroPrestamos() + " prestamos");

        System.out.println("El precio de la compra de 2 libros es: " + libro2.comprarLibro(2));

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Introduce el titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Introduce el numero de ejemplares: ");
        int ejemplares = sc.nextInt();

        Libro libro3 = new Libro(isbn, titulo, ejemplares);
        System.out.println(libro3.toString());

        String mensaje = libro2.devolverLibro()
                ? "Devolucion completada con exito" : "No hay libros para devolver";

        System.out.println(mensaje);
    }
}
