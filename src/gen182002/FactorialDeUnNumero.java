package gen182002;

import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedir numero al usuario
        System.out.println("Ingresa tu numero: ");
        int numero = sc.nextInt();

        //El long evita desbordamientos en numero muy grandes
        Integer factorial = 1;

        //Calculo de factorial usando for como bucle
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        //Mensaje para el usuario
        System.out.println("El factorial de " + numero + " es: " + factorial);

        sc.close();
    }
}
