package Laptop;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

    public class LaptopDatabase {
        private Map<Integer, Laptop> laptops;
        private String filename;

        public LaptopDatabase(String filename) {
            this.filename = filename;
            this.laptops = loadDatabase();
        }

        @SuppressWarnings("unchecked")
        private Map<Integer, Laptop> loadDatabase() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
                return (Map<Integer, Laptop>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                return new HashMap<>();
            }
        }

        private void saveDatabase() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
                oos.writeObject(laptops);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void insertLaptop(int id, String marca, String procesador, String ram) {
            laptops.put(id, new Laptop(id, marca, procesador, ram));
            saveDatabase();
        }

        public Laptop getLaptop(int id) {
            return laptops.get(id);
        }

        public void updateLaptop(int id, String marca, String procesador, String ram) {
            if (laptops.containsKey(id)) {
                Laptop laptop = laptops.get(id);
                laptop.setMarca(marca);
                laptop.setProcesador(procesador);
                laptop.setRam(ram);
                saveDatabase();
            } else {
                System.out.println("No se encontró el portátil con el ID: " + id);
            }
        }

        public void deleteLaptop(int id) {
            laptops.remove(id);
            saveDatabase();
        }
    }


