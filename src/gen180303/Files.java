package gen180303;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    //A traves de esta clase podemos interactuar con nuestro sistema de archivos

    public static void main(String[] args) {
        crearCarpeta("nuevaCarpeta");
        crearCarpeta("archivo.txt");
        escribirEnArchivo("src/gen180303/archivo.txt", "Hola mundo");
        leerArchivo("src/gen180303/archivo.txt");
        eliminarArchivo("src/gen180303/");

    }

    public static void crearCarpeta(String nombreCarpeta) {
        String ruta = "src/gen180303/"; //indicamos la ruta donde va a crear la carpeta
        File carpeta = new File(ruta + nombreCarpeta);

        if (!carpeta.exists()) {
            carpeta.mkdirs();
            System.out.println("La carpeta ha sido creada en la ruta: " + carpeta.getPath());
        } else {
            System.out.println("La carpeta ya existe");
        }
    }

    //Metodo para crear un archivo
    public static void crearArchivo(String nombreArchivo) {
        String ruta = "src/gen180303/";
        File archivo = new File(ruta + nombreArchivo);

        //El bloque try catch me permite probar un bloque de codigo y capturar la excepcion si es que surge algun error
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("El archivo ha sido creado en la ruta: " + archivo.getPath());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo" + e.getMessage());
            e.printStackTrace();
        }
    }

    //Metodo para escribir en un archivo
    public static void escribirEnArchivo(String ruta, String contenido) {
        try (FileWriter writer = new FileWriter(ruta)) {
            writer.write(contenido);
            System.out.println("Contenido agregado");
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Este bloque ejecuta si o si");
        }

    }

    //Metodo para lectura de archivos
    public static void leerArchivo(String ruta) {
        try (FileReader reader = new FileReader(ruta)) {
            int posicionCaracter;
            while ((posicionCaracter = reader.read()) != -1)
            {
                System.out.println((char)posicionCaracter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void eliminarArchivo(String ruta) {
        File nuevoArchivo = new File(ruta + "archivoParaBorrar.txt");

            if (nuevoArchivo.delete()) {
                System.out.println("El archivo " + nuevoArchivo + " ha sido borrado");
            } else {
                System.out.println("El nombre del archivo es invalido");
            }

            // } catch (IOException e) {

            //System.out.println(e.getMessage());
            //   e.printStackTrace();

        }


    }
