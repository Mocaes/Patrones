package patrones.factorymethod;

public class Fisica implements Asignatura {
    public String getNombre() {
        return "Física";
    }

    public int getCodigo() {
        return 2;
    }
    public String getProfesor() {
        return " Impartido por Super Albertrón";
    }
    public double getNota() {
        return 5.6;
    }
}
