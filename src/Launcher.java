public class Launcher {
    public static void main(String[] args) {
        Curso curso = new Curso("POO");
        Alumno alumno1 = new Alumno("Juan", "Perez", 12345, "Informatica", 6.5, 2023);
        Alumno alumno2 = new Alumno("Valentina", "Rojas", 112233, "Informatica", 6.2, 2021);
        Alumno alumno3 = new Alumno("Marcelo", "Vera", 218231307, "Informatica", 5.2, 2024);
        Alumno alumno4 = new Alumno("Sofia", "Gomez", 98765, "Informatica", 7.0, 2022);
        Alumno alumno5 = new Alumno("Diego", "Vergaras", 9999, "Informatica", 3.9, 2025);

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);
        curso.agregarAlumno(alumno4);
        curso.agregarAlumno(alumno5);

        System.out.println("\nLista principal de alumnos: \n");
        System.out.println(curso.toString());

        System.out.println("\nEliminar alumno1 de la lista \n");
        curso.eliminarAlumno(alumno1.getNumeroMatricula());

        System.out.println("\nLista de alumnos luego de eliminar alumno1: \n");
        System.out.println(curso.toString());

        System.out.println("\nComprobar si alumno4 pertenece al curso:");
        System.out.println(curso.existeAlumno(alumno4.getNumeroMatricula()));

        System.out.println("\nComprobar si alumno1 pertenece al curso:");
        System.out.println(curso.existeAlumno(alumno1.getNumeroMatricula()));

        System.out.println("\nModificar promedio de alumno5:");
        alumno5.setPromedio(4.0);
        System.out.println(alumno5.toString());
    }
}
