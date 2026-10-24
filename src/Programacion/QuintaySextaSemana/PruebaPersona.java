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

        //Ejercicio 3":
        Persona usuario = new Persona();
        usuario.nombre = "Pedro";
        System.out.println(usuario.nombre);
        usuario.nombre = "Pepa";
        System.out.println(usuario.nombre);
        //usuario.codigo = 2; Nos da error porque es un atributo privado de Persona, y solo es accesible desde
        //esa clase.



    }
}
