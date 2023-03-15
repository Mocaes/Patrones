package patrones.factorymethod;

public class Main {
    public static void main(String[] args) {
        AsignaturaFactory asignaturaFactory = new AsignaturaFactoryImpl();

        Asignatura matematicas = asignaturaFactory.crearAsignatura(1);
        System.out.println("Nombre de la asignatura: "+matematicas.getNombre()+
                " "+ matematicas.getCodigo()+ matematicas.getProfesor());

        Asignatura fisica = asignaturaFactory.crearAsignatura(2);
        System.out.println("Nombre de la asignatura: "+fisica.getNombre()+" "+
                fisica.getCodigo()+ fisica.getProfesor());

        Asignatura historia = asignaturaFactory.crearAsignatura(3);
        System.out.println("Nombre de la asignatura: "+historia.getNombre()+" "+
                historia.getCodigo()+ historia.getProfesor());

        Asignatura lengua = asignaturaFactory.crearAsignatura(4);
        System.out.println("Nombre de la asignatura: "+lengua.getNombre()+" "+
                lengua.getCodigo()+ lengua.getProfesor());
    }
}
