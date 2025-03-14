package gen182102;

import java.util.Map;
import java.util.Scanner;

public class Funciones {
    //Modificadores de acceso
    //Extends sirve para extender una clase a otra subclase

    //Privado encapsular para la clase actual
    private static String nombre;

    //Public permite el acceso desde cualquier otro package o clase
    public static String primerApellido;

    //Protected permite el acceso desde el mismo package o clases hijas
    protected static String segundoApellido;

    //Declaro la funcion/metodo "saludo"
    public static void saludo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu primer apellido");
        primerApellido = sc.nextLine();
        System.out.println("Ingresa tu segundo apellido");
        segundoApellido = sc.nextLine();
        System.out.println("Hola " + nombre + " " + primerApellido + " " + segundoApellido);
    }

    //Funciones de instancia, "sin el static", que no son estaticas requieren de instanciar la clase
    public int suma(int a, int b) {
        return a + b;
    }

    //Funciones que son estaticas le pertenecen a la clase, por tanto, no necesitan de una instancia para llamarla
    public static int resta(int a, int b) {
        return a - b;
    }

    //Sobrecarga de metodos consiste en agregarle mas argumentos o tipos de datos de retorno
    //Redeclarar un metodo volviendo a indicar sus argumentos o tipo de retorno, con distintos tipos de dato
    public double suma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        //Llamado al metodo saludo
        saludo();

        //llamado a una funcion de instancia
        //Creo primero la instancia
        Funciones miFuncion = new Funciones();
        int resultado = miFuncion.suma(10, 10);
        System.out.println("Esta es la instancia que se creó " + miFuncion);
        System.out.println("Es el resultado de la suma " + resultado);
        System.out.println("Este es el resultado de la suma con decimales "+ miFuncion.suma(10.50, 5.50));

        //Llamado a la funcion estatica
        System.out.println("El resultado de la función estática de resta es " + Funciones.resta(10, 5));

        //Esto es un ejemplo de funcion estatica porque pertenece a la clase Math
        Math.random();

        Scanner miOtroScanner = new Scanner(System.in);
        //La funcion nextline() viene a ser un ejemplo de funcion de instancia
        String nombre = miOtroScanner.nextLine();

        //modificador de acceso/ si es de instancia o no / tipo de retorno
        //       Public                static                    void






    }



}
