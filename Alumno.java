public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        if (nombre.length() < 3) {
            System.out.println("El nombre introducido es demasiado corto");
        }
         numeroMatricula = numeroMatriculaAlumno;
        
        if (numeroMatricula.length() <4) {
            System.out.println("El n�mero de matr�cula es demasiado corto");
        }
        edad = edadAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " anos");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int letrasNombre;
        int letrasMatricula;
        if (nombre.length() < 3) {
            letrasNombre = nombre.length();
        } else {
            letrasNombre = 3;
        }
        if (numeroMatricula.length() < 4) {
            letrasMatricula = numeroMatricula.length();
        } else {
            letrasMatricula = 4;
        }
        return nombre.substring(0, letrasNombre) + numeroMatricula.substring(0, letrasMatricula);
    }
    
}
