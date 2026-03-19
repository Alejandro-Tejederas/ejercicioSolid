package biblioteca;

public class LibroReferencia extends Libro {
    private String ubicacionSala;

    public LibroReferencia(String titulo, String autor, String ubicacionSala) {
        super(titulo, autor);
        this.ubicacionSala = ubicacionSala;
    }

    @Override
    public String getDetalles() {
        return super.getDetalles() + " | SOLO CONSULTA en Sala: " + ubicacionSala;
    }
}