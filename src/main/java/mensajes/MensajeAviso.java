package mensajes;

public class MensajeAviso implements Mensaje {
    private String canal, destinatario, titulo, cuerpo, fecha;

    public MensajeAviso(String canal, String destinatario, String titulo, String cuerpo, String fecha) {
        this.canal = canal;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    @Override
    public String generarCuerpo() {
        return "[" + canal.toUpperCase() + "] Aviso: " + titulo + "\n" +
                "Hola " + destinatario + ",\n" + cuerpo + "\n" +
                "Fecha: " + fecha + "\n";
    }
}