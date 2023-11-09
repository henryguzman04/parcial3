package ejercicio3_7;

public class Computador {
    String marca; // Atributo que define la marca del computador
    int cantidadMemoria; /* Atributo que define la cantidad de memoria
del computador */
    // Atributo que define las características del procesador del computador
    String característicasProcesador;
    String sistemaOperativo; /* Atributo que define el sistema operativo
del computador */
    double precio; // Atributo que define el precio del computador
    public Computador(String marca, int cantidadMemoria, String
            característicasProcesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.característicasProcesador = característicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }
}
