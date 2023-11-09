package ejercicio3_6;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int codigo;
    private int numeroSemestre;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, String apellidos, int codigo, int numeroSemestre, double notaFinal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.numeroSemestre = numeroSemestre;
        this.notaFinal = notaFinal;
    }

//get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + numeroSemestre);
        System.out.println("Nota Final: " + notaFinal);
    }

}
