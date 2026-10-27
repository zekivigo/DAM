package Programacion.QuintaySextaSemana;

public class Persona {
    public String nombre;
    public String apellidos;
    public int edad;
    public double peso;
    public double estatura;
    public int codigo;

    //Ejercicio 5:
    public Persona() {
        this.nombre = "Sin especificar";
        this.apellidos = "Sin especificar";
        this.edad = 0;
        this.peso = 0.0;
        this.estatura = 0.0;
        this.codigo = 0;
    }

    public Persona(String nombre, String apellidos, int edad,  double peso, double estatura, int codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.codigo = codigo;
    }
}

class Persona_Ejercicio9 {
    private String nombre;
    private String apellidos;
    private int edad;
    private double peso;
    private double estatura;
    private int codigo;

    public Persona_Ejercicio9() {
        this.nombre = "Sin especificar";
        this.apellidos = "Sin especificar";
        this.edad = 0;
        this.peso = 0.0;
        this.estatura = 0.0;
        this.codigo = 0;
    }

    public Persona_Ejercicio9(String nombre, String apellidos, int edad,  double peso, double estatura, int codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(esCorrectaEdad(edad)) {
            this.edad = edad;
        }else  {
            System.out.println("La edad esta fuera de rango");
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double calcularIMC(double altura, double peso) {
        return peso / altura;
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esCorrectaEdad(int edad) {
        return edad >= 0 && edad <= 150;
    }

    public void imprimirDatos() {
        System.out.println("4. Nombre: " + this.nombre + " " + this.apellidos
                +  ", Edad: " + this.edad);
    }


}