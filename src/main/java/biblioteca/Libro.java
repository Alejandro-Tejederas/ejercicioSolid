package biblioteca;

public class Libro {
    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getDetalles() {
        return "Libro: " + titulo + " - Autor: " + autor;
    }
}