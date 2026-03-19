package matricula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MatriculaService {
    private final List<Matricula> matriculas = new ArrayList<>();

    private final CalculadoraCuota calculadora = new CalculadoraCuota();
    private final NotificadorMatricula notificador = new NotificadorMatricula();

    public Matricula crearMatricula(String dni, String curso, double precioBase, boolean bonificacion) {
        ValidadorDni.validar(dni);

        double precioFinal = calculadora.calcular(precioBase, bonificacion);

        Matricula m = new Matricula(dni, curso, LocalDate.now(), precioFinal);
        matriculas.add(m);

        notificador.avisar(dni, curso, precioFinal);

        return m;
    }

    public String exportarResumen() {
        StringBuilder sb = new StringBuilder("RESUMEN MATRÍCULAS\n");
        for (Matricula m : matriculas) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
}