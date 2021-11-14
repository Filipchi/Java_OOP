package utp.misiontic2022.c2.p17.reto2;

public class Lavadora extends Electrodomestico {
    // Constantes y Atributos
    private static final Integer CARGA_BASE = 5;
    private Integer carga;

    // Constructores
    public Lavadora() {
        super();
        this.carga = CARGA_BASE;
    }

    public Lavadora(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.carga = CARGA_BASE;
    }

    public Lavadora(Double precioBase, Integer peso, char consumoW, Integer carga) {
        super(precioBase, peso, consumoW);
        this.carga = carga;
    } 

    // Métodos
    public Double calcularPrecio() {
        Integer addCarga = 0;
        addCarga = (this.carga > 30) ? 50 : 0;
        return super.calcularPrecio() + addCarga;
    }
}
