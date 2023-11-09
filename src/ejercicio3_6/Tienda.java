package ejercicio3_6;
import java.util.*;
public class Tienda {
    String nombre;
    String propietario;
    int identificadorTributario;
    Computador[] computadores;
    static int númeroComputadores;
int tamaño;
    public Tienda(String nombre, String propietario, int identificadorTributario, int tamaño) {
        if (tamaño < 1) { // Si el tamaño es menor que 1, es insuficiente
            System.out.println("Cantidad de computadores insuficientes.");
        } else {
            this.nombre = nombre;
            this.propietario = this.propietario;
            this.identificadorTributario = identificadorTributario;
            computadores = new Computador[tamaño];
            númeroComputadores = 0;
        }
    }
    public boolean tiendaLlena() {
        return númeroComputadores == computadores.length;
    }

    public boolean tiendaVacía() {
        return númeroComputadores == 0;
    }
    public void añadir(Computador computador) {

        if (tiendaLlena()) {
            System.out.println("La tienda está llena. No se puede añadir elemento . ");
        } else {
            computadores[númeroComputadores] = computador;
            númeroComputadores++;
        }
    }
    public boolean eliminar(String marcaComputador) {

        int pos = buscar(marcaComputador);
        if (pos < 0 ) {
            return false;
        }

        for (int i = pos; i < númeroComputadores; i ++) {
            computadores[i] = computadores[i+1];
        }
        númeroComputadores--;
        return true;
    }
    public int buscar(String marcaComputador) {
        for (int i = 0; i < númeroComputadores; i ++) { /* Recorre el
array de computadores */
            if (computadores[i].marca.equals(marcaComputador))
// Si se encuentra el computador buscado
                return i; /* Retorna la posición del computador buscado
en el array */
        }
        return -1; // Si no encontró el computador en el array
    }

    public void imprimir() {
        for (int i = 0; i < númeroComputadores; i ++) {
            System.out.println("Computador" + i);
            System.out.println("Marca = " + computadores[i].marca);
            System.out.println("Cantidad de memoria = " + computadores[i].cantidadMemoria);
            System.out.println("Características del procesador = " + computadores[i].característicasProcesador);
            System.out.println("Sistema operativo = " + computadores[i].sistemaOperativo);
            System.out.println("Precio = " + computadores[i].precio);
        }


        System.out.println("--------------------------------------------------------------------------------------");




    }




}
