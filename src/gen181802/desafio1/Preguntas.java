package gen181802.desafio1;

import java.util.Scanner;

public class Preguntas {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúal es tu nombre?");
        String nombre = teclado.nextLine();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("¿Cuántos años tienes?");
        String edad = teclado2.nextLine();

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("¿En qué comuna vives?");
        String comuna = teclado3.nextLine();

        System.out.println("Hola " + nombre + " veo que tienes " + edad + " años y vives en la comuna de " + comuna);
    }
}
