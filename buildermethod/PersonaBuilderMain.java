package patrones.buildermethod;

public class PersonaBuilderMain {

    public static void main(String[] args) {
        // Crear un objeto Persona con nombre, edad y dirección
        Persona persona1 = new Persona.PersonaBuilder()
                .setNombre("Juan")
                .setEdad(30)
                .setDireccion("Calle Mayor, 123")
                .setEmpresa("Accenture")
                .setSueldo(666.66)
                .build();
        System.out.println(persona1.getNombre()+ " " +persona1.getEdad()+" "+persona1.getDireccion()+ " , "
                +persona1.getPuesto()+" en "+ persona1.getEmpresa()+". Cobra "+ persona1.getSueldo()+"€");
        // Crear un objeto Persona con nombre y email
        Persona persona2 = new Persona.PersonaBuilder()
                .setNombre("María")
                .setEmail("maria@example.com")
                .setEmpresa("Digitech")
                .setSueldo(100000)
                .setPuesto("Sopa tester")
                .build();
        System.out.println(persona2.getNombre()+ " " +persona2.getEdad()+" "+persona2.getDireccion()+" "+
                persona2.getEmail()+ " , " +persona2.getPuesto()+" en "+ persona2.getEmpresa()+". Cobra "+ persona2.getSueldo()+"€");
        // Crear un objeto Persona con todos los atributos
        Persona persona3 = new Persona.PersonaBuilder()
                .setNombre("Pedro")
                .setEdad(25)
                .setDireccion("Plaza del Sol, 1")
                .setEmail("pedro@example.com")
                .setPuesto("Programador")
                .setEmpresa("Axarnet")
                .setSueldo(6)
                .build();
        System.out.println(persona3.getNombre()+ " " +persona3.getEdad()+" "+persona3.getDireccion()+" "+
                persona3.getEmail()+" , "+ persona3.getDireccion()+ " , "
                +persona3.getPuesto()+" en "+ persona3.getEmpresa()+". Cobra "+ persona3.getSueldo()+"€ y un bocata chope");
    }

}