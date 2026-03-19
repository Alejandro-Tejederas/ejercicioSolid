package rrhh;

public interface EmpleadoRepository {
    boolean existe(String dni);
    void guardar(Empleado e);
}