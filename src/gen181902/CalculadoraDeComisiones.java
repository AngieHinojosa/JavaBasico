package gen181902;

import java.util.Scanner;

/*
** Dentro del proyecto, crea una nueva clase llamada `ComisionApp`
** Implementar Código de la Aplicación de Comisiones:
    - En la clase `ComisionApp`, escribe el código para calcular la comisión basándote en las ventas ingresadas por el usuario.
    - Pide al usuario que ingrese sus ventas.
    - Utiliza estructuras condicionales (**`if`**, **`else if`**, **`else`**) para evaluar las ventas y determinar la comisión según las siguientes condiciones:
        - "30%" para ventas superiores a $100,000.
        - "20%" para ventas entre $50,001 y $90,999.
        - "10%" para ventas entre $10,001 y $40,999.
        - "N/A" (No aplica) para ventas inferiores a $10,000.
**Imprimir Detalles de la Comisión:**
    - Modifica la salida para imprimir las ventas ingresadas y la comisión calculada.
**Manejo de Entrada Inválida:**
    - Agrega validación para manejar el caso en que el usuario ingrese ventas negativas o una entrada no válida.
    - Muestra mensajes indicando que la entrada es inválida en estos casos.
**/

public class CalculadoraDeComisiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el monto de sus ventas: ");

        if (input.hasNextDouble()) {
            double numero = input.nextDouble();
            if (numero < 0) {
                System.out.println("La venta no puede ser negativa");
            } else {
                Double comision;
                String a;
                if (numero > 100000) {
                    comision = (numero * 0.3);
                    a = "30%";
                } else if (numero >= 50001 && numero <= 90999) {
                    comision = (numero * 0.2);
                    a = "20%";
                } else if (numero >= 10001 && numero <= 40999) {
                    comision = (numero * 0.1);
                    a = "10%";
                } else {
                    comision = 0.0;
                    a = "No aplica";
                }

                System.out.println("Ventas ingresadas: " + numero);
                System.out.println("Comision del " + a + " es: " + comision);

            }

        } else {
            System.out.println("El monto de sus ventas es incorrecto");

        }
        input.close();
    }
}