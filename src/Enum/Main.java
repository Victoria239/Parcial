package Enum;

public class Main {
    public static void main(String[] args) {

        for (TipoBalon tipo : TipoBalon.values()) {
            System.out.println("Tipo de balón: " + tipo.getNombre());
            System.out.println("Forma: " + tipo.getForma());
            System.out.println("Material: " + tipo.getMaterial());
            System.out.println("Color: " + tipo.getColor());
            // Llamar al método abstracto para cada tipo de balón
            System.out.println(tipo.metodoAbstracto());
            System.out.println();
        }

        TipoBalon.metodoEstatico();
    }
}
