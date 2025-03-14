package gen181902;

import java.util.Locale;
import java.util.Scanner;

public class ControlDeFlujo {
    //El control de flujo hace referencia a las condiciones que permiten controlar el flujo de las decisiones del programa

    public static void main(String[] args) {
        /* Evaluan condiciones
            If equivale un ''Si''
            Else equivale a ''Si no''
            Else if equivale a ''O si ...''
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa tu edad");
        Integer edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Tienes tu carnet en mano?");
        String respuestaCarnet = teclado.nextLine();

        //Verificar si la edad de la persona cumple con ciertos requisitos para poder entrar
        //Planteo mi condicion inicial

        if (respuestaCarnet.equalsIgnoreCase("si")) {
            if (edad > 18) {
                System.out.println("Perfecto, " + nombre + " puedes pasar, diviertete!");
            } else if (edad == 18) {
                System.out.println("Estas en la edad justa " + nombre + " puedes pasar, pero te portas bien");
            } else {
                //Este bloque de codigo se va a ejecutar en caso de que todo lo demas resulte falso.
                System.out.println("Lo sentimos " + nombre + " todavía no");
            }
        } else {
            System.out.println("Lo siento " + nombre + " ,no puedes pasar, vuelve con tu carnet");
        }

        // En ocasiones vamos a tener muchos posibles escenarios segun algun valor
        System.out.println("¿Qué día de la semana es? responde con un número");
        Integer diaSemana = teclado.nextInt();
        teclado.nextLine();

        if (diaSemana == 1) {
            System.out.println("Hoy es lunes");
        } else if (diaSemana == 2) {
            System.out.println("Hoy es martes");
        } else if (diaSemana == 3) {
            System.out.println("Hoy es miercoles");
        } else if (diaSemana == 4) {
            System.out.println("Hoy es jueves");
        } else if (diaSemana == 5) {
            System.out.println("Hoy es viernes");
        } else if (diaSemana == 6) {
            System.out.println("Hoy es sabado");
        } else {
            System.out.println("Hoy es domingo");
        }

        //Una alternativa puede ser el switch-case
        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
            default: //Me sirve para los posibles errores, si ponen algun numero invalido
                System.out.println("Ese día de la semana no existe");
        }

        System.out.println("Ingrese el nombre del estudiante");
        String nombreEstudiante = teclado.nextLine();

        switch (nombreEstudiante.toLowerCase()) {  //.tolowercase es para convertir todo a minuscula
            case "Gabriel":
                System.out.println("Es de la cohorte 18");
                break;
            case "Belen":
                System.out.println("Es de la cohorte 14");
                break;
            default:
                System.out.println("Ingrese un nombre válido");





        }
    }
}