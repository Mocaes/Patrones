package patrones.factorymethod;

public class Matematicas implements Asignatura {
    public String getNombre() {
        return "Matemáticas";
    }
    public int getCodigo() {
        return 1;
    }
    public String getProfesor() {
        return " Impartido por Dios (Juan Brenes)";
    }
    public double getNota() {
        return 4.99;
    }
}
