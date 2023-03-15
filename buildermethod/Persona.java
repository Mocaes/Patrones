package patrones.buildermethod;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String email;
    private String puesto;
    private String empresa;
    private double sueldo;

    // Constructor privado para usar el patrón Builder
    private Persona(String nombre, int edad, String direccion, String email,String empresa, String puesto, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.puesto= puesto;
        this.empresa = empresa;
        this.sueldo = sueldo;
    }

    // Métodos getter para acceder a los atributos de la clase
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }

    public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    public String getEmpresa() {
        return empresa;
    }
    public double getSueldo() {
        return sueldo;
    }

    // Clase Builder interna para construir objetos Persona
    public static class PersonaBuilder {
        private String nombre;
        private int edad;
        private String direccion;
        private String email;
        private String puesto;
        private String empresa;
        private double sueldo;

        public PersonaBuilder setPuesto(String puesto) {
            this.puesto = puesto;
            return this;
        }
        // Métodos setter para establecer los atributos opcionales
        public PersonaBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public PersonaBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }
        public PersonaBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        public PersonaBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public PersonaBuilder setEmpresa(String empresa) {
            this.empresa = empresa;
            return this;
        }
        public PersonaBuilder setSueldo(double sueldo) {
            this.sueldo = sueldo;
            return this;
        }

        // Método build para crear el objeto Persona con los atributos opcionales
        public Persona build() {
            return new Persona(nombre, edad, direccion, email,empresa, puesto, sueldo);
        }
    }
}
