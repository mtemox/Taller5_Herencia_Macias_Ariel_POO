public class Main {
    public static void main(String[] args) {

        // Creo el objeto de la Clase Estudiante
        Estudiante e1 = new Estudiante("1756266142","Ariel", "Los Cóndores", "ariel.macias@epn.edu.ec","0986988671", "Desarrollo de Software", "Tercer Semestre");
        System.out.println("\n----------Estudiante----------");
        e1.mostrarInformacionPersonal();

        // Creo el objeto de la Clase Docente
        Docente d1 = new Docente("175626643", "Juan", "Quitumbe", "juan@enpn.edu.ec", "0986988673", "Desarrollo de Software", 200);
        System.out.println("\n----------Docente----------");
        d1.mostrarInformacionPersonal();

        // Creo el objeto de la SubClase EstudiantePresencial
        EstudiantePresencial ep1 = new EstudiantePresencial("1756266142", "Ariel", "Los Cóndores", "ariel.macias@epn.edu.ec", "0986988671", "Desarrollo de Software", "Tercer Semestre", 20, "Normal");
        System.out.println("\n----------Estudiante Presencial----------");
        ep1.mostrarInformacionPersonal();

        // Creo el objeto de la SubClase EstudianteVirtua
        EstudianteVirtual ev1 = new EstudianteVirtual("1756266418", "Pedro", "Quitumbe", "pedro@epn.edu.ec", "0986988654", "Electromecánica", "Cuarto Semestre", "Teams", "Ing. Pablo Pérez");
        System.out.println("\n----------Estudiante Virtual----------");
        ev1.mostrarInformacionPersonal();

        // Creo el objeto de la SubClase DocenteEnLinea
        DocenteEnLinea dl1 = new DocenteEnLinea("175626643", "Fernando", "Quitumbe", "fernando@enpn.edu.ec", "Sistemas", 210, "Fijo");
        System.out.println("\n----------Docente en Línea----------");
        dl1.mostrarInformacionPersonal();

        // Llamo al metodo de Estudiante para calcular la edad
        ep1.calcularEdad(2005);

    }
}

