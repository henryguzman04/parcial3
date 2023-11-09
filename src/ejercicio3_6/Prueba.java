package ejercicio3_6;
import java.util.*;
public class Prueba {
    public static void main(String[] args) {


        Tienda tienda = new Tienda("Tienda Cuántica", "Pepito Pérez", 123456,5);
        Computador computador1 = new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        Computador computador2 = new Computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        Computador computador3 = new Computador("Mac", 100, "Intel iCore 7", "Mac", 2500000);
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        Scanner sc = new Scanner(System.in);
        System.out.println("primeramente ponga la marca de una computadora.......\n Acer.....Toshiba.....Mac.....");
        String marca = sc.next();
        System.out.println("El computador a buscar: " + marca + "se encuentra en la posición " + tienda.buscar(marca));
        tienda.imprimir();


        System.out.println("--------------------------------------------------------------------------------------");

        Curso curso = new Curso();
        Scanner scanner = new Scanner(System.in);

        // Añadir estudiantes al curso
        curso.añadirEstudiante(new Estudiante("Nombre1", "Apellido1", 1, 2, 3.5));
        curso.añadirEstudiante(new Estudiante("Nombre2", "Apellido2", 2, 3, 4.0));
        curso.añadirEstudiante(new Estudiante("Nombre3", "Apellido3", 3, 1, 2.8));

        // Solicitar código para buscar y eliminar estudiante
        System.out.print("Ingrese el código del estudiante a buscar y eliminar: ");
        int codigoBuscar = scanner.nextInt();

        Estudiante estudiante = curso.buscarEstudiante(codigoBuscar);
        if (estudiante != null) {
            estudiante.mostrarInformacion();
            System.out.print("¿Está seguro que desea eliminar este estudiante? (Sí/No): ");
            String confirmacion = scanner.next();
            if (confirmacion.equalsIgnoreCase("Sí")) {
                curso.eliminarEstudiante(codigoBuscar);
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        // Calcular promedio y mostrar resultados
        double promedio = curso.calcularPromedio();
        int cantidadAprobados = curso.obtenerCantidadEstudiantesAprobados();
        double porcentajeAprobados = curso.obtenerPorcentajeEstudiantesAprobados();

        System.out.println("Promedio del curso: " + promedio);
        System.out.println("Cantidad de estudiantes aprobados: " + cantidadAprobados);
        System.out.println("Porcentaje de estudiantes aprobados: " + porcentajeAprobados + "%");




    }

}
