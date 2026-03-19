package matricula;

public class NotificadorMatricula {
    public void avisar(String dni, String curso, double precio) {
        System.out.println("[AVISO] Matriculado " + dni + " en " + curso + " por " + precio + "€");
    }
}