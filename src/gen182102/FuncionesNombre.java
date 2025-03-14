package gen182102;

import java.util.Scanner;

/*
1. **Te corresponde llevar a cabo la creación de las funciones y asegurarte de que realicen lo siguiente:
    - `printNameLength`: Debe imprimir la longitud de un String(nombre).
    - `printNameCharacters`: Debe imprimir cada carácter de un String(nombre).
    - `printFullName`:  Debe imprimir el nombre completo concatenando un nombre y un apellido.
    - `printReverseName`: Debe imprimir el nombre en orden inverso.
2. **Entrada de Usuario:** Verifica el funcionamiento de la clase `Scanner` para pedir al usuario que ingrese su nombre y apellido.
3. **Ejecución y Pruebas:** Ejecuta el programa y verifica que se imprima correctamente la longitud del nombre, los caracteres del nombre y el nombre completo.
4. **Pruebas Adicionales:** Modifica el programa para probar con al menos 5 combinaciones diferentes de nombres y apellidos.
* */

public class FuncionesNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Pedir al usuario que ingrese su apellido
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        // Llamadas a las funciones
        printNameLength(nombre);
        printNameCharacters(nombre);
        printFullName(nombre, apellido);
        printReverseName(nombre);

        scanner.close();
        }

    //Funcion que imprime la longitud del nombre
    public static void printNameLength(String nombre) {
        System.out.println("La longitud del nombre es: " + nombre.length());
    }

    //Funcion que imprime cada caracter del nombre
    public static void printNameCharacters(String nombre) {
        System.out.println("Los caracteres del nombre son: ");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
    }

    //Funcion que imprime el nombre completo concatenando nombre y apellido
    public static void printFullName(String nombre, String apellido) {
        System.out.println("El nombre completo es: " +  nombre + " " + apellido);
    }

    //Funcion que imprime el nombre en orden inverso
    public static void printReverseName(String nombre) {
        String nombreInvertido = "";
        for (int i = nombre.length() - 1; i >= 0; i--) {
            nombreInvertido += nombre.charAt(i);
        }
        System.out.println("El invertido es: " + nombreInvertido);
    }

}
