package mensajes;

public class App {
    public static void main(String[] args) {
        GeneradorTextoMensajes generador = new GeneradorTextoMensajes();

        // Creamos cada mensaje con su clase correspondiente
        Mensaje aviso = new MensajeAviso("intranet", "Grupo SMR1", "Cambio de aula", "En el aula 2.3.", "2026-02-26");
        Mensaje incidencia = new MensajeIncidencia("correo", "Retraso", "3 retrasos.", "12345678A", "DAM1", "ALTA");

        System.out.println(generador.generar(aviso));
        System.out.println(generador.generar(incidencia));
    }
}

