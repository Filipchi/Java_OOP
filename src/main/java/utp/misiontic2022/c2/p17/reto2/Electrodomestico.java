package utp.misiontic2022.c2.p17.reto2;

public class Electrodomestico {
    // Constantes y Atributos
    private static final Integer PESO_BASE = 5;
    private static final char CONSUMO_W = 'F';
    private static final Double PRECIO_BASE = 100.0;
    private Integer peso;
    private char consumoW;
    private Double precioBase;

    // Constructores
    public Electrodomestico() {
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W;
        this.precioBase = PRECIO_BASE;
    }

    public Electrodomestico(Double precioBase, Integer peso) {
        // Código
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W;
    }

    public Electrodomestico(Double precioBase, Integer peso, char consumoW) {
        // Código
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarconsumoW(consumoW);
    }

    // Metodos
    public void comprobarconsumoW(char consumoW) {
        if (Character.compare(consumoW, 'A') == 0 || 
            Character.compare(consumoW, 'B') == 0 ||
            Character.compare(consumoW, 'C') == 0 ||
            Character.compare(consumoW, 'D') == 0 || 
            Character.compare(consumoW, 'E') == 0 ||
            Character.compare(consumoW, 'F') == 0) {
            this.consumoW = consumoW;
        } else {
            this.consumoW = CONSUMO_W;
        }
    }

    public Double calcularPrecio() {
        Double addConsumo = 0.0;
        Double addPeso = 0.0;

        addConsumo = (Character.compare(this.consumoW, 'A') == 0) ? 100.0 :
                     (Character.compare(this.consumoW, 'B') == 0) ? 80.0 :
                     (Character.compare(this.consumoW, 'C') == 0) ? 60.0 :
                     (Character.compare(this.consumoW, 'D') == 0) ? 50.0 :
                     (Character.compare(this.consumoW, 'E') == 0) ? 30.0 : 10.0;

        addPeso = (this.peso >= 0 && this.peso < 19) ? 10.0 :
                  (this.peso >= 19 && this.peso < 49) ? 50.0 :
                  (this.peso >= 49 && this.peso < 80) ? 80.0 : 100.0;

        return precioBase + addConsumo + addPeso;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
}
