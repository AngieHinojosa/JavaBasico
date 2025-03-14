package gen182402;
/*1. **Dados un arreglo de números y un arreglo de Strings, te corresponde llevar a cabo lo siguiente:
    a. En el arreglo de números:
        - Obtener el máximo y el mínimo
        - Contar elementos pares e impares dentro del arreglo
        - Ordenar el arreglo en orden ascendente
        - Buscar duplicados dentro del arreglo
    b. En el arreglo de String:
        - Contar las vocales de cada texto
        - Ordenar alfabéticamente
        - Encontrar el texto más largo
        - Concatenar todos los textos sin usar +
 2. **Ejecución y Pruebas:** Ejecuta el programa y verifica lo solicitado mediante impresiones en consola.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArreglosEstaticosEjercicio {
    public static void main(String[] args) {
        //Arreglo de enteros
        int[] numeros = {10, 5, 20, 15, 25, 10, 30, 15, 5, 40};

        // Inicializar el máximo y mínimo con el primer elemento del arreglo
        int max = numeros[0];
        int min = numeros[0];

        // Recorrer el arreglo para encontrar el máximo y mínimo usando Math
        for (int num : numeros) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

        // Contar pares e impares
        int pares = 0, impares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        //Buscar duplicados
        System.out.print("Números duplicados: ");

        // Recorremos el arreglo con dos bucles for
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.print(numeros[i] + " ");
                }
            }
        }

        //Arreglo de String
        String[] mascotas = {"Perro", "Cabra", "Caballo", "Pez", "Gato", "Loro", "Araña", "Capibara", "Hamster", "Vaca", "Cocodrilo"};

        //Cantidad de vocales
        for (String palabra : mascotas) {
            int numeroDeVocalesDeMascotas = 0;
            for (int i = 0; i < palabra.length(); i++) {
                char vocal = palabra.charAt(i);
                if (("aeiou".indexOf(vocal) != -1)) {
                    numeroDeVocalesDeMascotas++;
                }
            }
            System.out.println("El numero de vocales de la palabra " + palabra + " es " + numeroDeVocalesDeMascotas);
        }

        //Ordenar alfabeticamente
        Arrays.sort(mascotas);
        System.out.println(Arrays.toString(mascotas));

        //Encontrar el texto más largo
        String[] textoMasLargo = {""};
        for (String palabra : mascotas) {
            if (textoMasLargo[0].length() < palabra.length()) {
                textoMasLargo[0] = palabra;
            }
        }
        System.out.println("El texto mas largo es " + textoMasLargo[0]);

        //Concatenar todos los textos sin usar +
        StringBuilder textoConcatenado = new StringBuilder();
        for (String palabra : mascotas) {
            textoConcatenado.append(palabra);
        }
        System.out.println("Texto concatenado: " + textoConcatenado);


    }

}