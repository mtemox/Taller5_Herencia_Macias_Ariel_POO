// Subclase hija de persona
public class Docente extends Persona{

    // Atributos propios de la clase
    public String FacultadPertenece;
    public int HorasAsignadasClase;

    // Metodo constructor
    public Docente (String cedula, String nombre, String direccion, String correo, String telefono, String FacultadPertenece, int HorasAsignadasClase) {
        super(cedula, nombre, direccion, correo, telefono);
        this.FacultadPertenece = FacultadPertenece;
        this.HorasAsignadasClase = HorasAsignadasClase;
    }

    // Metodo constructor
    public Docente (String cedula, String nombre, String direccion, String correo, String FacultadPertenece, int HorasAsignadasClase) {
        super(cedula, nombre, direccion, correo);
        this.FacultadPertenece = FacultadPertenece;
        this.HorasAsignadasClase = HorasAsignadasClase;
    }

    // Metodo override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Facultad a la que pertenece: " + FacultadPertenece);
        System.out.println("Horas asignadas a la clase: " + HorasAsignadasClase);
    }
}
