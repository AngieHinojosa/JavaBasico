package gen181902;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir numero al usuario
        System.out.println("Introduce el número: ");
        int numero = teclado.nextInt();

        //Condiciones para saber si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

        String mensaje = (numero % 2 == 0) ? "Ese numero es par" : "Ese numero es impar";
        System.out.println(mensaje);


        teclado.close();

    }
}
