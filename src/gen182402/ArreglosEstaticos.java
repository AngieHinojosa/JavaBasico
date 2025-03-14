package gen182402;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosEstaticos {
    //Los arrays en Java tienen una longitud fija por naturaleza, esto quiere decir que no puedo aumentar su longitud.

    public static void main(String[] args) {
       //Declaramos un arreglo de numeros
       int [] numerosDeUnoAlDiez = {1,2,3,4,5,6,7,8,9,10};

       //Si intentamos imprimir un arreglo fijo me imprime una referencia a donde esta en memoria
        System.out.println("Mis numeros del uno al diez son: " + numerosDeUnoAlDiez);

        //Para imprimir el contenido de un arreglo fijo, llamamos a la clase Arrays y tu metodo .toString
        System.out.println("Los numeros del uno al diez son: " + Arrays.toString(numerosDeUnoAlDiez));

        //Para acceder a un indice en particular dentro del arreglo puede referirme a él por su posicion
        System.out.println("El elemento del indice 5 es " + numerosDeUnoAlDiez[5]);

        int [] numerosVacios = new int[5];
        System.out.println("Mi arreglo de numeros vacios, tiene los siguientes elementos " + Arrays.toString(numerosVacios));

        //Cambiar un valor de un indice, debo llamar a la posicion y asignarle un valor con el operador
        numerosVacios[0] = 1;
        numerosVacios[1] = 2;

        System.out.println("Ahora mi arreglo tiene estos elementos " + Arrays.toString(numerosVacios));

        //Al tratar de acceder a una posicion que no existe en el arreglo nos va a lanzar una excepcion
        //System.out.println("El elemento en la posicion 5 es " + numerosVacios[5]);

        //¿Como puedo recorrer un arreglo?
        //Principalmente con bucles
        //Al iterar sobre un arreglo usamos su propiedad length (longitud)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numerosVacios.length; i++) {
            System.out.println("Ingresa un valor para el elemento en la posicion " + i);
            numerosVacios[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("El elemento en la posicion " + i + " ahora es "  + numerosVacios[i]);
        }

        /* Calcular la suma de los números en el arregllo numerosVacios
        int suma = 0;
        for (int i = 0; i < numerosVacios.length; i++) {
            System.out.println("En este momento la suma va en " + suma);
            suma += numerosVacios[1];
        }
        System.out.println("La suma total es " + suma);
        */

        //Llamo nuevamente al arreglo, con los elementos ingresados en el bucle
        System.out.println("El arreglo tiene los siguientes valores " + Arrays.toString(numerosVacios));

        //ForEach: Tipo de bucle para trabajar con estructura de datos
        for (int elemento: numerosVacios) {
            System.out.println("El elemento en este momento tiene un valor de " + elemento);
        }

        //Sintaxis ForEach= for + (variable con la que voy a refereirme a cada elemento : nombre del arreglo)
        int suma = 0;
        for (int numero : numerosVacios) {
            suma += numero;
        }
        System.out.println("La suma total es " + suma);
    }

}
