import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public Curso() {
        this.nombre = "Sin nombre";
        this.alumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumno == null)
            return false;
        if (existeAlumno(alumno.getNumeroMatricula()))
            return false;
        alumnos.add(alumno);
        return true;
    }

    public boolean eliminarAlumno(int numeroMatricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroMatricula() == numeroMatricula) {
                alumnos.remove(alumno);
                return true;
            }
        }
        return false;
    }

    public boolean existeAlumno(int numeroMatricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroMatricula() == numeroMatricula)
                return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public int getTotalAlumnos() {
        return alumnos.size();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String texto = "---\n";
        texto = texto + "Curso: " + nombre + "\n";
        texto = texto + "Total de alumnos: " + alumnos.size() + "\n";
        texto = texto + "---\n";
        for (Alumno alumno : alumnos) {
            texto = texto + " - " + alumno.toString() + "\n";
        }
        texto = texto + "---\n";
        return texto;
    }

}
