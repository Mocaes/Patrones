package patrones.factorymethod;

public class Lengua implements Asignatura {
    public String getNombre() {
        return "Lengua Española";
    }
    public int getCodigo() {
        return 4;
    }
    public String getProfesor() {
        return " Impartido por Arturo Pérez Reverte";
    }
    public double getNota() {
        return 9.99;
    }
}
