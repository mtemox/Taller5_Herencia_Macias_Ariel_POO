
public class Estudiante extends Persona{

    // Atributos propios de la clase
    public String carrera;
    public String nivel;

    // Metodo constructor
    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel) {
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera = carrera;
        this.nivel = nivel;
    }

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Carrera: "+ carrera);
        System.out.println("Nivel: "+ nivel);
    }

    // Metodo para calcular la edad del estudiante
        public void calcularEdad (int anioNacimiento) {
            int edad;
            edad = 2025 - anioNacimiento;
            System.out.println("\nCALCULAR EDAD");
            System.out.println("La edad del estudiante es: " + edad);
        }
}
