package utp.misiontic2022.c2.p17.reto2;

public class Television extends Electrodomestico {
    // Constantes y Atributos
    private static final Integer PULGADAS_BASE = 20;
    
    private Integer pulgadas;
    private boolean sintetizadorTDT;

    // Constructores
    public Television() {
        super();
        this.pulgadas = PULGADAS_BASE;
        this.sintetizadorTDT = false;
    }

    public Television(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.sintetizadorTDT = false;
    }

    public Television(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintetizadorTDT) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.sintetizadorTDT = sintetizadorTDT;
    }

    // Métodos 
    public Double calcularPrecio() {
        Double addTDT = 0.0;
        Double addPulgadas = 0.0;

        addTDT = (this.sintetizadorTDT) ? 50.0 : 0.0;
        addPulgadas = (this.pulgadas > 40) ? (0.3 * getPrecioBase()) : 0;
        
        return super.calcularPrecio() + addTDT + addPulgadas;
    }
}
    // Fin de la solución
