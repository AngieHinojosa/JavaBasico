package genc182602;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Definimos la clase como molde o plano que describe a la persona
public class Persona {

    //Atributos o caracteristicas
    String nombre;
    //int edad;
    LocalDate fechaNacimiento;
    String genero;
    Double altura;
    Double peso;
    boolean tieneAlgunaDiscapacidad;
    //Constante en JAVA
    String rut;
    //Podemos indicar un atributo como lista, set o map
    List<Persona> listaCompaneros = new ArrayList<Persona>();

    //Aciones o metodos
    public void desplazarse(int velocidadMovimiento, String direccion) {
        System.out.println(this.nombre + " se movió " + velocidadMovimiento + " metros hacia la "  + direccion);
    }

    public void saludar() {
        System.out.println("Hola, soy " + this.nombre);
    }

    //Podemos recibir como argumento una instancia de la clase
    public void conversar (Persona interlocutor) {
        //A traves de la palabra reservada this. accedo a atributos o metodos de la instancia actual
        this.saludar();
        //A traves del argumento de tipo persona accedo a sus metodos del interlocutor
        interlocutor.saludar();
        System.out.println("¿Por casualidad naciste el: " + interlocutor.fechaNacimiento + "?");
    }

    //Anotacion @Override permite sobreescribir un metodo de una clase padre
    //Mediante la sobreescritura y la sobrecarga de metodos, demostramos polimorfismo.
    @Override
    public String toString() {
        return "Persona{" +
                "genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tieneAlgunaDiscapacidad=" + tieneAlgunaDiscapacidad +
                ", rut='" + rut + '\'' +
                ", listaCompaneros=" + listaCompaneros +
                '}';
    }
}
