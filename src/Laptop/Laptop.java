package Laptop;

 import java.io.Serializable;

    public class Laptop implements Serializable {
        private static final long serialVersionUID = 1L;

        private int id;
        private String marca;
        private String procesador;
        private String ram;

        public Laptop(int id, String marca, String procesador, String ram) {
            this.id = id;
            this.marca = marca;
            this.procesador = procesador;
            this.ram = ram;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getProcesador() {
            return procesador;
        }

        public void setProcesador(String procesador) {
            this.procesador = procesador;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }
    }


