public class EstudianteVirtual extends Estudiante {

    // Atributos propios de la clase
    public String plataforma;
    public String tutoresVirtuales;

    // Metodo constructor
    public EstudianteVirtual (String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, String plataforma, String tutoresVirtuales) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.plataforma = plataforma;
        this.tutoresVirtuales = tutoresVirtuales;
    }

    @Override
    public void mostrarInformacionPersonal () {
        super.mostrarInformacionPersonal();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Tutores Virtuales: " + tutoresVirtuales);
    }

    // Metodo heredado de Estudiante
    public void calcularEdad (int anioNacimiento) {
        super.calcularEdad(anioNacimiento);
    }
}
