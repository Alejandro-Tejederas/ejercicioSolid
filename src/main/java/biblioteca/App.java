package biblioteca;

public class App {
    public static void main(String[] args) {
        // Un libro que se puede llevar a casa
        LibroPrestable libro1 = new LibroPrestable("Cien años de soledad", "Gabriel García Márquez");
        libro1.prestar("12345678Z", 15);

        // Un diccionario que solo se queda en la sala
        LibroReferencia libro2 = new LibroReferencia("Diccionario RAE", "Varios", "Planta 1, Estantería A");

        System.out.println(libro1.getDetalles());
        System.out.println(libro2.getDetalles());
    }
}