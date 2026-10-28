package Programacion.Prog_Rodriguez_Barros_Ezequiel_Tarea01.Secundario;

public class Libro {
    private String isbn;
    private String titulo;
    private int paginas;
    private Genero genero;
    private int numeroEjemplares;
    private int numeroPrestamos;
    private float precio;

    public Libro(String isbn, String titulo, int numeroEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroEjemplares = numeroEjemplares;
    }

    public Libro(String isbn, String titulo, int numeroEjemplares, float precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroEjemplares = numeroEjemplares;
        this.precio = precio;
    }

    public Libro(String isbn, String titulo, int paginas, Genero genero, int numeroEjemplares, float precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.paginas = paginas;
        this.genero = genero;
        this.numeroEjemplares = numeroEjemplares;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroPrestamos() {
        return numeroPrestamos;
    }

    public void setNumeroPrestamos(int numeroPrestamos) {
        this.numeroPrestamos = numeroPrestamos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void prestarLibro(){
        this.numeroPrestamos = (this.numeroPrestamos < this.numeroEjemplares)
                ? (this.numeroPrestamos + 1) : this.numeroPrestamos;
    }

    public boolean devolverLibro() {
        boolean devolver = this.numeroPrestamos > 0;
        this.numeroPrestamos = devolver ? (this.numeroPrestamos - 1) : this.numeroPrestamos;
        return devolver;
    }

    //Con este metodo tuve que pedirle ayuda a la IA, me atasque y no era capaz de encontrar la solucion
    //con operadores ternarios en de emplear algun if.
    public float comprarLibro(int numCompra) {
        int disponibles = this.numeroEjemplares - this.numeroPrestamos;
        boolean sePuedeComprar = disponibles >= numCompra;
        this.numeroEjemplares = sePuedeComprar ? (this.numeroEjemplares - numCompra) : this.numeroEjemplares;
        return sePuedeComprar ? (numCompra * this.precio) : 0.0f;
    }

    @Override
    public String toString() {
        return "Datos libro: " + isbn +", " + titulo +", " + paginas + ", " + numeroEjemplares;
    }
}
