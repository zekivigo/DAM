package Programacion.Prog_Rodriguez_Barros_Ezequiel_Tarea01.Secundario;

public class Libro {
    private String isbn;
    private String titulo;
    private int paginas;
    private String genero;
    private int numeroEjemplares;
    private int numprestamos;
    private double precio;

    public Libro(String isbn, String titulo, int numeroEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroEjemplares = numeroEjemplares;
    }

    public Libro(String isbn, String titulo, int numeroEjemplares, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroEjemplares = numeroEjemplares;
        this.precio = precio;
    }

    public Libro(String isbn, String titulo, int paginas, String genero, int numeroEjemplares, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.paginas = paginas;
        this.genero = genero;
        this.numeroEjemplares = numeroEjemplares;
        this.precio = precio;
    }
}
