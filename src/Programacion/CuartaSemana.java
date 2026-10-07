package Programacion;

import java.util.Scanner;

public class CuartaSemana {
    public static void main(String[] args) {

        //EJERCICIO 1

        // 1. Valor máximo no modificable: 5000.
        final short VALORMAXIMO = 5000;
        //short es el primitivo de menor tamanho para 5000.

        // 2. Si el nuevo empleado tiene carnet de conducir o no.
        boolean carnetConducir = true;
        //boolean es el primitivo para condiciones de verdadero o falso.

        // 3. Un mes del año en formato numerico y como cadena.
        byte mes1 = 2;
        String mes2 = "febrero";
        //El mismo mes representado en numero y texto.

        //4. El nombre y apellidos de una persona.
        String nombre = "ezequiel";
        String apellido = "rodriguez";
        //Una cadena de texto para cada valor.

        // 5. Sexo: con dos valores posibles 'V' o 'M'.
        enum sexo {
            MASCULINO, FEMININO
        }
        sexo M = sexo.MASCULINO;
        sexo F = sexo.FEMININO;
        //Creo una lista enumerada y almaceno cada uno de los 2 valores en 1 variable con la nomenclatura marcada.

        // 6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
        long tiempotTranscurrido = System.currentTimeMillis();
        // Almaceno el valor que nos da la clase currentTimeMillis.

        // 7. Saldo de una cuenta bancaria.
        long cuentaBancaria = 178067L;
        //descarte double y float porque dan problemas con los redondeos.

        // 8. Distancia en kms desde la Tierra a Júpiter.
        long distanciaJupiter = 778000000L;


        /*

        EJERCICIO 2. Indica si los siguientes identificadores de variables en Java serían válidos.

        NO VALIDOS CON ERROR DEL SISTEMA
        double y char. No son validos porque son palabras reservadas del lenguaje.
        5hora. En Java ni una clase ni una variable puede comenzar por un numero.
        /horaactual. Una variable no puede comenzar por este caracter especial.


        NO RECOMENDABLES SIN ERROR DEL SISTEMA
        $hora y _hora es una nomenclatura no recomendable, aunque no habria ningun error del sistema.

        VALIDOS
        MiHora. Seria una nomenclatura valida

        /////////////////////////////////////////////////////////////////////////////////////////////

        EJERCICIO 3. teniendo en cuenta que var1, var2 y var3 son variables de tipo boolean y
        están inicializadas a los siguientes valores: var1=true, var2=true y var3=false y que las variables X, Y y Z
        son variables enteras con valores: X=5, Y=-8 y Z=10,
        indica si las siguientes operaciones se evaluan a true o false:

        var1 || var2 && var3. ----------------------- TRUE.
        (var1 || var3) && (var2 && !var1). ---------- FALSE
        (var2 || !var1 || !var3) && var1. ----------- TRUE.
        (X > 3 || Y > 3) && Z < -3. ----------------- FALSE.
        (X+Z == 15) && (Y != 2). -------------------- TRUE.
        */

        //EJERCICIO 4.  Crea un proyecto en Netbeans denominado PROG02_Ejerc4 que dada la edad de una persona,
        // muestre un mensaje indicando si es mayor de edad. NO se puede utilizar el operador condicional if.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad:");
        int edad = sc.nextInt();
        String comparacion = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";

        //EJERCICIO 5. Crea un proyecto en Netbeans denominado PROG02_Ejerc5 que dado un número de segundos,
        //muestre en pantalla cuántos segundos, minutos, horas y días contiene. Ejemplo, dado 95030 segundos,
        //debe mostrar 1 días, 2 horas, 23 minutos, 50 segundos.
        int totalSegundos = 95030;
        int dias = totalSegundos / 86400;
        int restoDias = totalSegundos % 86400;
        int horas = restoDias / 3600;
        int restoHoras = restoDias % 3600;
        int minutos = restoHoras / 60;
        int segundos = restoHoras % 60;

        /*
        EJERCICIO 6. Crea un proyecto en Netbeans denominado PROG02_Ejerc6 que cree un tipo enumerado
        para las siguientes razas de perro: Mastín, Terrier, Bulldog, Pekines, Caniche y Galgo.
        El programa debe realizar las siguientes operaciones:

        -Crea una variable denominada var1 del tipo enumerador. Asígnale un valor.
        -Crea una variable denominada var2 del tipo enumerador. Asígnale un valor.
        -Muestra por pantalla el valor obtenido de comparar ambas variables.
        */
        enum razas {
            MASTIN, TERRRIER, BULLDOG, PEKINES, CANICHE, GALGO
        }
        razas var1 = razas.TERRRIER;
        razas var2 = razas.BULLDOG;


        //EJERCICIO 7, 8, 9 y 10 RESUELTOS EN EL MAIN.


        System.out.println("EJERCICICIO 1.\n"+ VALORMAXIMO + "\nTiene carnet de conducir? " +carnetConducir
                +"\n"+mes2+ " es el mes " +mes1 + " de 12." +"\n"+ nombre + " es el nombre " + apellido + " el apellido."
                +"\nGenero: " + M  +" o "+ F + "\nMilisegundos desde 1/1/1970: " + tiempotTranscurrido + "\nEl saldo de la cuenta es:"
                + cuentaBancaria + "\nLa distancia entre la tierra y Jupiter es de " +distanciaJupiter + " km");

        System.out.println("EJERCICIO 4: " + comparacion);

        System.out.printf("EJERCICIO 5: 86400 segundos equivalen a %d dias, %d horas, %d minutos, %d segundos \n",
                dias, horas, minutos, segundos);

        System.out.println("EJERCICIO 6: El primer valor almacena a " + var1.toString() + " y el segundo almacena a " + var2.toString());
        System.out.println("El tipo enumerado tiene una extension de: " + razas.values().length);

        System.out.println("EJERCICIO 7.");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce C1:");
        int C1 = sc2.nextInt();
        System.out.println("Introduce C2:");
        int C2 = sc2.nextInt();
        if (C1 == 0) {
            System.out.println("No puede dividirse entre 0");
        }else {
            double resultado = C2/C1;
            System.out.printf("El resultado es: %.4f\n", resultado);
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce el nº de alumnos en Programacion:");
        int alum1 = sc3.nextInt();
        System.out.println("Introduce el nº de alumnos en entornos de Desarrollo:");
        int alum2 = sc3.nextInt();
        System.out.println("Introduce el nº de alumnos en Base de datos:");
        int alum3 = sc3.nextInt();

        double todosAlumnos =  alum1 + alum2 + alum3;
        double programacion = alum1 / todosAlumnos * 100;
        double entornosDesarrollo = alum2 / todosAlumnos * 100;
        double baseDatos = alum3 / todosAlumnos * 100;

        System.out.println("EJERCICIO 8. \nEl alumnado de programacion representa el: " + programacion
                + "%\n" + "El alumnado de Entornos de Desarrollo representa el: "
                + entornosDesarrollo + "%\n" + "El alumnado de Base de Datos representa el: "
                + baseDatos + "%");

        System.out.println("EJERCICIO 9. \nIntroduce un año:");
        Scanner sc4 = new Scanner(System.in);
        int year = sc4.nextInt();
        boolean seraBisiesto = (year % 4 == 0 && year % 100 != 0);
        System.out.println("¿Ese año es bisiesto? " + seraBisiesto);

        CuartaSemana_Ejercicio10.ejercicio10();
        }
    }


