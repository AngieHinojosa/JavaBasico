package gen180303;

public class FileNotFoundException extends Exception {
    //Para crear una exepcion personalizada extendemos de una excepcion existente

    public FileNotFoundException(String mensaje){
        super(mensaje);
    }
}
