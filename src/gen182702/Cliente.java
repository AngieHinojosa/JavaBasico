package gen182702;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class Cliente {

        //Atributos privados
        private String nombreCompleto;
        private String rut;
        private LocalDate fechaNacimiento;
        private int id;
        private List<CuentaBancaria> cuentas = new ArrayList<>();

        //Relación entre esta clase y la clase cuentaBancaria


        //Constructores son métodos que me permiten inicializar la instacia con datos
        //Constructor vacío
        public Cliente() {
        }

        //Constructor lleno o con todos los atributos
        public Cliente(String nombreCompleto, String rut, LocalDate fechaNacimiento, int id) {
            this.nombreCompleto = nombreCompleto;
            this.rut = rut;
            this.fechaNacimiento = fechaNacimiento;
            this.id = id;
        }


        public Cliente(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        //Métodos Getter y Setter o Accesadores y Mutadores
        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<CuentaBancaria> getCuentas() {
            return cuentas;
        }

        public void setCuentas(List<CuentaBancaria> cuentas) {
            this.cuentas = cuentas;
        }

        //Método ToString
        @Override
        public String toString() {
            return "Cliente{" +
                    "nombreCompleto='" + nombreCompleto + '\'' +
                    ", rut='" + rut + '\'' +
                    ", fechaNacimiento=" + fechaNacimiento +
                    ", id=" + id +
                    '}';
        }
    }
