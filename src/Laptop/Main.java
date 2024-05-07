package Laptop;

public class Main {

        public static void main(String[] args) {
            LaptopDatabase database = new LaptopDatabase("laptops.db");


            database.insertLaptop(1, "Lenovo", "Intel i5", "8GB");
            database.insertLaptop(2, "Dell", "AMD Ryzen 7", "16GB");
            database.insertLaptop(3, "HP", "Intel i7", "12GB");
            database.insertLaptop(4, "Apple", "Apple M1", "16GB");




            Laptop laptop = database.getLaptop(2);
            if (laptop != null) {
                System.out.println("Laptop encontrado: " + laptop.getMarca() + " " + laptop.getProcesador() + " " + laptop.getRam());
            } else {
                System.out.println("No se encontró el laptop con el ID: 1");
            }


            database.updateLaptop(1, "Dell", null, null);


            database.deleteLaptop(1);
        }
    }


