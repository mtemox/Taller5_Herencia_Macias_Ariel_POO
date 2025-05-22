public class DocenteEnLinea extends Docente{

    // Atributos propios de la clase
    public String tipoContrato;

    // Metodo constructor
    public DocenteEnLinea(String cedula, String nombre, String direccion, String correo, String FacultadPertenece, int HorasAsignadasClase, String tipoContrato) {
        super(cedula, nombre, direccion, correo, FacultadPertenece, HorasAsignadasClase);
        this.tipoContrato = tipoContrato;
    }

    // Metodo Herdado


    @Override
    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Tipo de contrato: " + tipoContrato);
    }
}
