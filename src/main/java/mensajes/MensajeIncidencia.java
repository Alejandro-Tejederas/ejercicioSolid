package mensajes;

public class MensajeIncidencia implements Mensaje {
    private String canal, titulo, cuerpo, alumno, tutoria, gravedad;

    public MensajeIncidencia(String canal, String titulo, String cuerpo, String alumno, String tutoria, String gravedad) {
        this.canal = canal;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.alumno = alumno;
        this.tutoria = tutoria;
        this.gravedad = gravedad;
    }

    @Override
    public String generarCuerpo() {
        return "[" + canal.toUpperCase() + "] Incidencia (" + gravedad + "): " + titulo + "\n" +
                "Alumno/a: " + alumno + "\n" +
                "Tutoría: " + tutoria + "\n" +
                "Detalle: " + cuerpo + "\n";
    }
}