package gen181802.desafio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    //Crear una calculadora que reciba inputs del usuario
    //Guardar los inputs en variables
    //Realizar operaciones aritmeticas con estas variables
    //Desafio adicional, investigar funciones de clase Math e implementar minimo 2
    //Refactorizar las operaciones

    //Metodo para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    //Metodo para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    //Metodo para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    //Metodo para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0; //Si el b es 0, se retorna un 0 y no infinito.
        }
        return a / b;
    }

    //Metodo para calcular la raiz cuadrada de un numero
    public static double raizCuadrada(double a) {
        if (a < 0) {
            System.out.println("No se puede calcular la raiz cuadrada de un negativo");
            return 0; //Se retorna 0 si el numero es negativo
        }
        return Math.sqrt(a);
    }

    //Metodo para calcular la potencia de un numero
    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mostrar opciones de operación
        System.out.println("Seleccione una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Raíz cuadrada");
        System.out.println("6. Potencia (primer número elevado al segundo)");

        System.out.print("Ingrese el número de la operación: ");
        int opcion = scanner.nextInt();

        double num1 = 0,num2 = 0, resultado = 0;
        boolean operacionValida = true; //Variable para verificar si la operacion es valida

        //Si la opcion NO es raiz cuadrada, pedimos ambos numeros
        if (opcion >=1 && opcion <= 4 || opcion == 6) {
            System.out.println("Ingrese el primer número: ");
            num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();

        //Si la opcion es 5 (raiz cuadrada), solo se pide un numero
        } else if (opcion == 5) {
            System.out.println("Ingrese el número: ");
            num1 = scanner.nextDouble();
        } else {
            operacionValida = false; //Si la opcion no es valida, marcamos error.
            System.out.println("Opción inválida. Intente nuevamente");
        }

        //Llamar a la funcion para hacer la operacion elegida
        if (opcion == 1) {
            resultado = sumar(num1, num2);
        } else if (opcion == 2) {
            resultado = restar(num1, num2);
        } else if (opcion == 3) {
            resultado = multiplicar(num1, num2);
        } else if (opcion == 4) {
            resultado = dividir(num1, num2);
        } else if (opcion == 5) {
            resultado = raizCuadrada(num1);
        } else if (opcion == 6) {
            resultado = potencia(num1, num2);
        }

        //mostrar el resultado
        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
        }
    }
