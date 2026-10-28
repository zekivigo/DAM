package Programacion.QuintaySextaSemana;

public class Circulo {
    public final double PI = 3.1415;
    public double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
}

class Circulo_Ejercicio4 {
    private final double PI = 3.1415;
    private double radio;

    public Circulo_Ejercicio4() {}

    public Circulo_Ejercicio4(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
        this.radio = radio;
    }else{
        System.out.println("El radio no puede ser menor que 0");
    }}

    public double calcularArea() {
        return PI * (radio * radio);
    }

    public double carcularLongitud() {
        return 2 * (PI * radio);
    }

    public void aumentarRadio(double aumento) {
        this.radio = this.radio + (this.radio * aumento);
    }

    public void imprimirDatos(){
        System.out.println("El radio es: " + radio);
        System.out.println("Pi es: " + PI);
        System.out.println("El area es: " + calcularArea());
        System.out.println("La longitud es: " + carcularLongitud());
    }


}


