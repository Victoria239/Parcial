package Enum;

public enum TipoBalon {
    FUTBOL("Fútbol", "Redondo", "Cuero", "Blanco con Negro") {
        @Override
        public String metodoAbstracto() {
            return "Metodo abstracto para el balón de fútbol";
        }
    },
    BALONCESTO("Baloncesto", "Redondo", "Caucho", "Naranja") {
        @Override
        public String metodoAbstracto() {
            return "Metodo abstracto para el balón de baloncesto";
        }
    },
    VOLEIBOL("Voleibol", "Redondo", "Cuero sintético", "En su mayoría Blanco") {
        @Override
        public String metodoAbstracto() {
            return "Metodo abstracto para el balón de voleibol";
        }
    },
    RUGBY("Rugby", "Ovalado", "Cuero", "Café") {
        @Override
        public String metodoAbstracto() {
            return "Metodo abstracto para el balón de rugby";
        }
    };

    private String nombre;
    private String forma;
    private String material;
    private String color;


    private TipoBalon(String nombre, String forma, String material, String color) {
        this.nombre = nombre;
        this.forma = forma;
        this.material = material;
        this.color = color;
    }


    public String getNombre() {
        return nombre;
    }

    public String getForma() {
        return forma;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }


    public static void metodoEstatico() {
        System.out.println("Este es un método estático de TipoBalon");
    }


    public abstract String metodoAbstracto();

}
