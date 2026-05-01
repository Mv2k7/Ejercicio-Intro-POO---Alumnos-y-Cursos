public class Alumno {
    private String nombre;
    private String apellido;
    private int numeroMatricula;
    private String carrera;
    private double promedio;
    private int Ingreso;

    public Alumno(String nombre, String apellido, int numeroMatricula, String carrera, double promedio, int Ingreso) {
        this.nombre             = nombre;
        this.apellido           = apellido;
        this.numeroMatricula    = numeroMatricula;
        this.carrera            = carrera;
        this.promedio           = (promedio >= 1.0 && promedio <= 7.0) ? promedio : 1.0;
        this.Ingreso            = Ingreso;
        // Con Parametros
    }
    public Alumno() {
        this.nombre             = "Sin nombre";
        this.apellido           = "Sin apellido";
        this.numeroMatricula    = 0;
        this.carrera            = "Sin Carrera";
        this.promedio           = 0.0;
        this.Ingreso            = 2024;
        // Sin Parametros
    }
    // Getters
    public String getNombre()       {return nombre;}
    public String getApellido()     {return apellido;}
    public int getNumeroMatricula() {return numeroMatricula;}
    public String getCarrera()      {return carrera;}
    public double getPromedio()     {return promedio;}
    public int getIngreso()         {return Ingreso;}
    // Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    // No pongo el de matrícula ya que este no debe cambiar luego de ser creado
    public void setCarrera(String carrera) {this.carrera = carrera;}
    public void setPromedio(double promedio) {
        if (promedio >= 1.0 && promedio <= 7.0)
            this.promedio = promedio;
    }
    public void setIngreso(int fecha) {this.Ingreso = fecha;}

    @Override
    public String toString() {
        return "Alumno{" +
                "matricula=" + numeroMatricula +
                ", nombre='" + nombre + " " + apellido + "'" +
                ", carrera='" + carrera + "'" +
                ", promedio=" + promedio +
                ", ingreso=" + Ingreso + "}";
    }
}
