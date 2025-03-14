package gen181802;

import java.util.Scanner;

//Las clases se nombran con mayuscula (Main) y debe ser igual al archivo original.
public class Main {

    //Dentro de la clase Main, tengo un metodo main que va a ser el punto de entrada al programa. Siempre tiene que estar presente.
    public static void main(String[] args) {
        System.out.println("Hello, Kitty!");

        //Scanner.next() nos va a permitir recibir un input en consola
        //Instanciar una clase
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");

        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

    }
}