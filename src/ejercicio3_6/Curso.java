package ejercicio3_6;
import java.util.ArrayList;
public class Curso {
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para añadir un estudiante al curso
    public void añadirEstudiante(Estudiante estudiante) {
        // Verificar si el código del estudiante ya existe
        for (Estudiante e : estudiantes) {
            if (e.getCodigo() == estudiante.getCodigo()) {
                System.out.println("Error: El código del estudiante ya existe.");
                return;
            }
        }
        estudiantes.add(estudiante);
    }

    // Método para buscar un estudiante por código
    public Estudiante buscarEstudiante(int codigo) {
        for (Estudiante e : estudiantes) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null; // Si no se encuentra el estudiante
    }

    // Método para eliminar un estudiante por código
    public void eliminarEstudiante(int codigo) {
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante != null) {
            estudiante.mostrarInformacion();
            // Aquí solicitar la confirmación de eliminación
            estudiantes.remove(estudiante);
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
    }

    // Método para calcular el promedio del curso
    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.getNotaFinal();
        }
        return sumaNotas / estudiantes.size();
    }

    // Método para obtener la cantidad de estudiantes que aprobaron el curso
    public int obtenerCantidadEstudiantesAprobados() {
        int cantidadAprobados = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNotaFinal() >= 3.0) {
                cantidadAprobados++;
            }
        }
        return cantidadAprobados;
    }

    // Método para obtener el porcentaje de estudiantes que aprobaron el curso
    public double obtenerPorcentajeEstudiantesAprobados() {
        int cantidadEstudiantes = estudiantes.size();
        int cantidadAprobados = obtenerCantidadEstudiantesAprobados();
        return ((double) cantidadAprobados / cantidadEstudiantes) * 100;
    }

}
