package ejercicio3_7;
import java.util.*;
public class Tienda2 {
    String nombre;
    String propietario;

    int identificadorTributario;
    Vector computadores; /* Atributo que define un vector de
computadores */

    public Tienda2(String nombre, String propietario, int
            identificadorTributario) {
        this.nombre = nombre;
        this.propietario = this.propietario;
        this.identificadorTributario = identificadorTributario;
        computadores = new Vector(); // Se crea el vector de computadores
    }
    public boolean tiendaLlena() {
/* Un vector no tiene un tamaño predefinido, nunca está lleno,
devuelve siempre false */
        return false;
    }

    public boolean tiendaVacío() {
        return computadores.size() == 0; /* El método size determinar el
tamaño del vector */
    }

    public void añadir(Computador computador) {
        computadores.add(computador); /* El método add agrega un
elemento al vector */
    }
    public boolean eliminar(String marcaComputador) {
        int pos = buscar(marcaComputador); /* Busca el computador y
devuelve su posición */
        if (pos < 0 ) { /* Si la posición es menor que cero, no encontró el
computador */
            return false;
        }
// Elimina el elemento que se encuentra en la posición pos
        computadores.removeElementAt(pos);
        return true;
    }

    public int buscar(String marcaComputador) {
        Computador computador;
// Se busca el computador en el vector
        for (int i = 0; i < computadores.size(); i ++) { /* Se recorre el
vector de computadores */
            computador = (Computador) computadores.elementAt(i);
            if (computador.marca.equals(marcaComputador))
                return i; /* Devuelve la posición donde se encontró el
computador */
        }
        return -1; // Si no encontró el computador, retorna -1
    }
    public void imprimir() {
        for (int i = 0; i < computadores.size(); i ++) {
            System.out.println("Computador" + i);
            Computador computador = (Computador) computadores.elementAt(i);
            System.out.println("Marca = " + computador.marca);
            System.out.println("Cantidad de memoria = " + computador.cantidadMemoria);
            System.out.println("Características del procesador = " +computador.característicasProcesador);
            System.out.println("Sistema operativo = " + computador.sistemaOperativo);
            System.out.println("Precio =  "+ computador.precio);
        }
    }


}
