package gen181802;

public class Operadores {

    public static void main(String[] args) {
        /* Operadores aritméticos
            + suma
            - resta
            * multiplicación
            / división
            % resto (permite saber si un número es divisible por otro, si es 0 es divisible, si no es cero no es)
         */

        int a = 10;
        int b = 5;
        final int c = 15; //La palabra reservada final permite crear una constante, siempre va a tener este valor.

        int resultado = 10 + 5; //suma
        System.out.println("El resultado de la suma es " + resultado);

        resultado = resultado - a; //resta
        System.out.println("Ahora que le restamos es " + resultado);

        resultado = resultado * b; //multiplicación
        System.out.println("Ahora que le multiplicamos es " + resultado);

        resultado = c/b;
        System.out.println("Ahora que le dividimos " + c + " entre " + b + " el resultado equivale a " + resultado);

        resultado = 10 % 2;
        System.out.println("El resto de dividir 10 entre 2 es " + resultado);

        /* Operadores de asignacion
            =
            +=
            -=
            *=
            /=
         */

        //Le suma el valor y se lo asigna a la variable
        resultado += 1;
        System.out.println("El resultado ahora es " + resultado);

        /* Operadores unitarios
            ++ : incremento 1
            -- : decremento 1
         */

        resultado++;
        System.out.println("El resultado ahora es " + resultado);

        ++resultado;
        System.out.println("El resultado ahora es " + resultado);

        /* Operadores de comparacion
            Retorna un TRUE o FALSE (Boolean)
            == igual que
            < menor que
            > mayor que
            <= menor o igual
            >= mayor o igual
            != es distinto que
         */

        boolean esVerdadero = resultado == a;
        a = 10;
        b = 15;
        System.out.println(a + " ¿es igual a " + resultado + "? = " + esVerdadero);
        System.out.println(a + " ¿es menor que " + b + "? = " + (a < b));
        System.out.println(a + " ¿es mayor que " + b + "? = " + (a > b));
        System.out.println(a + " ¿es distinto de " + b + "? = " + (a != b));

        /* Operadores Logicos
            Combinar multiples expresiones
            && "doble anpersand y logico" (Necesita que las dos sean verdaderas)
            || "pipe o logico" (necesita que solo una sea verdadera)
            ! "not o negacion"
         */

        boolean expresionUno = (a < b) && (a == a); //¿a es menor que b? y ¿a es igual a a? = v + v = v
        System.out.println("El resultado de la primera expresion es " + expresionUno);

        boolean expresionDos = (a < b) && (a > b); //¿a es menor que b? y ¿a es mayor que b? = v + f = f
        System.out.println("El resultado de la segunda expresion es "  + expresionDos);

        boolean expresionTres = (a > b) || (a != b); //¿a es mayor que b? o ¿a es distinto de b? = f + v = v
        System.out.println("El resultado de la  tercera expresion es " + expresionTres);

        boolean expresionCuatro = !(a == b) || !(b > a); //!¿a es igual que b? o !¿b es mayor que a? = v + f = f
                                                         // el ! antepuesto me invierte el valor
        System.out.println("El resultado de la  cuarta expresion es " + expresionCuatro);
        
    }
}
