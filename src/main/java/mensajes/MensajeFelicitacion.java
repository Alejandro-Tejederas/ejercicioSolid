package mensajes;

public class MensajeFelicitacion implements Mensaje {
    private String canal, destinatario, titulo, cuerpo;

    public MensajeFelicitacion(String canal, String destinatario, String titulo, String cuerpo) {
        this.canal = canal;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    @Override
    public String generarCuerpo() {
        return "[" + canal.toUpperCase() + "] ¡Enhorabuena! " + titulo + "\n" +
                destinatario + ", " + cuerpo + "\n";
    }
}
