package gen182002;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        //Bucle While
        // Contador de despegue

        int contador = 10;
        System.out.println("Contador de despegue");

        while (contador > 0) {
            contador--;      //Si quiero que reste de a mas, le pongo -= 3
            //Se le debe mencionar que va a pasar con la variable porque va a infinito
            System.out.println(contador);
        }
        System.out.println("Despegue!");

        //Bucle Do White
        //Permite que aunque la condicion sea falsa, se ejecute por lo menos una vez
        //Juego de adivinanzas, un numero del 1 al 10
        // Integer.parseInt() = Esto sirve para cambiar cadena de texto a numero entero

        Scanner sc = new Scanner(System.in);
        Integer numeroMisterioso = (int) (Math.random() * 10) + 1;
        Integer numeroElegido;
        Integer contadorDeIntentos = 0;

        //Lo que indiquemos en el bloque do va a suceder por lo menos una vez
        do {
            System.out.println("Ingresa un número del 1 al 10");
            numeroElegido = Integer.parseInt(sc.nextLine());
            contadorDeIntentos++;

            if (numeroElegido > numeroMisterioso) {
                System.out.println("Muy alto");
            } else if (numeroElegido < numeroMisterioso) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("Adivinaste, felicidades!");
            }
            System.out.println("Llevas " + contadorDeIntentos + " intentos");

        } while (numeroMisterioso != numeroElegido);

        /*
        //Do while para crear el menu de la calculadora
        // \n escape mas salto de linea
        Integer opcion = -1;

        do  {
            //Lo que está en estle bloque se ejecuta antes de realizar la evaluación por lo menos una vez.
            System.out.println("Indica la opcion \n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");
            System.out.println("Ingresa una opcion");
            opcion = sc.nextInt();
            if (opcion < 0 || opcion > 4) {
                System.out.println("Opcion invalida, intenta de nuevo");
            }
        } while (opcion < 0 || opcion > 4);


        //Bucle FOR
        //"Para"(1 igual a 0; mientras 1 sea menor o igual a 100; sumale +1 a 1)
        // variable ; condicion ; condicion para la variable
        // for (int 1 = 0; 1 <= 100; 1 ++) {
            System.out.println(1);
        }*/

        //Programa de despegue en bucle for
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Despegue!");

        //Programa para obtener tabla de multiplicar de un numero
        System.out.println("Ingresa un numero para conocer su tabla de multiplicar");
        Integer numero = sc.nextInt();

        for (int i = 1; 1 <= 10; i++) {
            System.out.println(numero + " x " + 1 + " = " + (numero * 1));
        }

    }
}
