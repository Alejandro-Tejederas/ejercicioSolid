package biblioteca;

import java.time.LocalDate;

public class LibroPrestable extends Libro {
    private String dniUsuario;
    private LocalDate fechaDevolucion;

    public LibroPrestable(String titulo, String autor) {
        super(titulo, autor);
    }

    public void prestar(String dni, int dias) {
        this.dniUsuario = dni;
        this.fechaDevolucion = LocalDate.now().plusDays(dias);
    }

    @Override
    public String getDetalles() {
        return super.getDetalles() + (dniUsuario != null ? " | Prestado a: " + dniUsuario + " hasta " + fechaDevolucion : " | Disponible");
    }
}
