package patrones.factorymethod;

public class Historia implements Asignatura {
    public String getNombre() {
        return "Historia";
    }
    public int getCodigo() {
        return 3;
    }
    public String getProfesor() {
        return " Impartido por Vladimir Putin";
    }
    public double getNota() {
        return 6.9;
    }
}
