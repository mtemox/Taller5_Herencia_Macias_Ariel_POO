// Subclase de Estudiante
public class EstudiantePresencial extends Estudiante{

    // Atributos propios de la clase
    public int horasPresenciales;
    public String horario;

    // Metodo constructor
    public EstudiantePresencial (String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int horasPresenciales, String horario) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.horasPresenciales = horasPresenciales;
        this.horario = horario;
    }

    // Metodo MostrarInformacionPersonal;

    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Número de horas presenciales: " + horasPresenciales);
        System.out.println("Horario: " + horario);
    }

    // Metodo heradado de Estudiante
    public void calcularEdad (int anioNacimeinto) {
        super.calcularEdad(anioNacimeinto);
    }
}
