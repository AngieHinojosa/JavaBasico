package gen182102;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MetodosJava {

    //Metodo que trabaja con los metodos de la clase Math
    public static void llamadoMetodoMath() {
        double numero = 16;
        System.out.println("El número con el que vamos a trabajar es: " + numero);

        //Llamamos a la clase Math y accedemos a su metodo random
        System.out.println("Un numero al azar entre 0 y 1 es " + Math.random());

        //Llamamos a la clase Math y al metodo pow
        System.out.println("15 elevado a 2 es " + Math.pow(16,2));

        //Llamamos a la clase Math y al metodo max (me permite conocer el maximo entre dos valores)
        System.out.println("Entre estos dos valores, el maximo es " + Math.max(numero, 20.0));

        //Llamamos a la clase Math y al metodo min
        System.out.println("Entre estos dos valores, el minimo es " + Math.min(5.0, numero));
    }

    //Metodo que llame a metodos para los String
    public static void llamadoMetodosString(String nombre1, String nombre2) {
        System.out.println("Hola, bienvenidos al programa " + nombre1 + " y " + nombre2);

        //Llamamos al metodo .equals() para comparar entre Strings, porque estamos comparando dos objetos
        System.out.println("Los nombres " +  nombre1 + " y " + nombre2 + " son iguales?, la respuesta es " + (nombre1.equals(nombre2)));
        System.out.println("Los nombres " +  nombre1 + " y " + nombre2 + " son iguales?, la respuesta es " + (nombre1.equalsIgnoreCase(nombre2)));

        //Llamamos al metodo .length() para conocer la longitud de un String
        System.out.println("Los nombres " + nombre1 + " y " + nombre2 + " suman una cantidad de " + (nombre1.length() + nombre2.length()) + " caracteres");

        //Llamamos al metodo .toUpperCase() para convertir el String a MAYUSCULA
        System.out.println("El primer nombre en mayuscula sería " + nombre1.toUpperCase());
        //Llamamos al metodo.toLowerCase() para convertir el String en miniscula
        System.out.println("El segundo nombre el minuscula sería " + nombre2.toLowerCase());
    }

    //Metodo que llame a metodos para trabajar con fechas
    public static void llamadoMetodosFechas () {
        //Clase para almacenar fecha, inicializamos con fecha actual .now()
        LocalDate fechaDeHoy = LocalDate.now();
        System.out.println("La fecha de hoy es " + fechaDeHoy);

        //Llamado al metodo .getYear() para obtener el año de una fecha
        System.out.println("El año actual es " + fechaDeHoy.getYear());

        //Llamado al metodo .getMonth() para obtener el mes de la fecha
        System.out.println("El mes actual es " + fechaDeHoy.getMonth());

        //Llamado al metodo .getDat() para obtener el dia de la fecha
        System.out.println("El dia de hoy es " + fechaDeHoy.getDayOfWeek());

        //Llamado al metodo .format () y al metodo ofPattern() de la clase DateTimeFormatter para formatear la fecha actual
        System.out.println("Formato de la fecha: (dd/MM/yyyy) " + fechaDeHoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public static void main(String[] args) {
        llamadoMetodoMath();
        llamadoMetodosString("Maria", "MARIA");
        llamadoMetodosFechas();



    }
}
