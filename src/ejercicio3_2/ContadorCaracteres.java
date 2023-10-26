package ejercicio3_2;

public class ContadorCaracteres {
    public int contarMayusculas(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contador++;
            }
        }
        return contador;
    }

    // Método que cuenta cuántas veces aparece una letra en un String
    public int contarLetra(String texto, char letra) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.toLowerCase(caracter) == Character.toLowerCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    // Método que elimina espacios en blanco y muestra el resultado
    public void eliminarEspacios(String texto) {
        String resultado = texto.replaceAll("\\s", "");
        System.out.println("Texto sin espacios: " + resultado);
    }

    // Método que invierte un String y muestra el resultado
    public String invertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder(texto);
        return resultado.reverse().toString();
    }
}
