package gen180303;

public class Excepciones {
    //La clase padre de las excepciones en Throwable
    //Excepciones verificadas (checked): Son las que en tiempo de compilacion, se nos obliga a manejar.
    //Excepsiones no veriricadas (unchecked): Son excepciones que no requiere manejo por parte del desarrollador.

    static Throwable miExcepcion = new Exception();

    static Throwable miExcepcionPersonalizada = new FileNotFoundException("Esta es una excepcion personalizada");

    public static void main(String[] args) {
        //printStackTrace() es un metodo que va a mostrar en consola todo lo que causo la excepcion
        //miExcepcion.printStackTrace();
        miExcepcionPersonalizada.printStackTrace();
    }

    //Podemos llamar a nuestras propias excepciones





}