package utp.misiontic2022.c2.p17.reto2;

// Inicio de la solución
public class PrecioTotal {
    // Atributos
    private Double totalElectrodomesticos;
    private Double totalLavadoras;
    private Double totalTelevisores;
    private Electrodomestico[] listaElectrodomesticos;

    // Constructor
    PrecioTotal(Electrodomestico[] pElectrodomesticos) {
        this.totalElectrodomesticos = 0.0;
        this.totalLavadoras = 0.0;
        this.totalTelevisores = 0.0;
        this.listaElectrodomesticos = pElectrodomesticos;
    }

    // Metodos
    public void mostrarTotales() {
        // Código
        for (Electrodomestico el : listaElectrodomesticos) {
            if (el instanceof Electrodomestico) {
                totalElectrodomesticos += el.calcularPrecio();
            }

            if (el instanceof Lavadora) {
                totalLavadoras += el.calcularPrecio();
            }

            if (el instanceof Television) {
                totalTelevisores += el.calcularPrecio();
            }
        }

        // Mostramos los resultados
        System.out.println("La suma del precio de los electrodomésticos es de " + totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + totalLavadoras);
        System.out.print("La suma del precio de las televisiones es de " + totalTelevisores);
    }
}