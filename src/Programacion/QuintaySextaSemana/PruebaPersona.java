package Programacion.QuintaySextaSemana;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Paco";
        persona1.apellidos = "Gomez";
        persona1.edad = 40;
        persona1.peso = 80.23;
        persona1.estatura = 1.78;

        System.out.println(persona1.nombre + " " + persona1.apellidos + " " + persona1.estatura + " "
                + persona1.edad + " " + persona1.peso + " " + persona1.estatura);

        //Ejercicio 3:
        Persona usuario = new Persona();
        usuario.nombre = "Pedro";
        System.out.println(usuario.nombre);
        usuario.nombre = "Pepa";
        System.out.println(usuario.nombre);
        //usuario.codigo = 2; Nos da error porque es un atributo privado de Persona, y solo es accesible desde
        //esa clase.

        //Ejercicio 5:
        Persona usuario2 = new Persona();
        System.out.println("\nEjercicio 5");
        System.out.println(usuario2.nombre + ", " + usuario2.apellidos + ", " + usuario2.estatura + ", "
                + usuario2.edad + ", " + usuario2.peso + ", " + usuario2.estatura + ", "+ usuario2.codigo);

        //Ejercicio 7:
        Persona usuario3 = new Persona("Paco", "Gomez", 34, 82.45, 1.85, 2);
        System.out.println("\nEjercicio 7\n" + usuario3.nombre +" " + usuario3.apellidos +". Mide: " + usuario3.estatura
                +". Tiene una edad de "+ usuario3.edad);

        //EJERCICIO 9:
        Persona_Ejercicio9 persona1_Ejercicio9 = new Persona_Ejercicio9();
        Persona_Ejercicio9 persona2_Ejercicio9 = new Persona_Ejercicio9();
        persona1_Ejercicio9.setNombre("Paco");
        persona2_Ejercicio9.setEdad(40);
        System.out.println("\nEjercicio 9 \nEl nombre del primer usuario es " + persona1_Ejercicio9.getNombre() +
                ". La edad del segundo usuario es " + persona2_Ejercicio9.getEdad());

        //EJERCICIO 11:
        Persona_Ejercicio9 persona_ejercicio11 = new Persona_Ejercicio9();
        System.out.println("\nEjercicio 11");
        System.out.println("1. IMC: "+persona_ejercicio11.calcularIMC(1.80, 1.70));
        System.out.println("2. El usuario es mayor de edad? " +persona_ejercicio11.esMayorDeEdad(17));
        System.out.print("3. La edad esta comprendida entre 0-150? ");
        persona_ejercicio11.setEdad(151);
        System.out.println(persona_ejercicio11.getEdad());
        persona_ejercicio11.setNombre("Pepe");
        persona_ejercicio11.setApellidos("Gomez");
        persona_ejercicio11.setEdad(78);
        persona_ejercicio11.imprimirDatos();








    }
}
