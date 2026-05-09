public class ej2_billetera {
    String titular;
    double saldo;

    public ej2_billetera(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public ej2_billetera(String titular) {
        this(titular, 0.0);
    }

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
        System.out.printf("Has ingresado %.2f€. Te quedan en la cuenta %.2f€.%n", cantidad, this.saldo);;
    }

    public boolean retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.printf("Has retirado %.2f€. Te quedan en la cuenta %.2f€.%n", cantidad, this.saldo);;
            return true;
        }
        else {
            System.out.println("Operación denegada: Saldo insuficiente.");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("--- INICIANDO SISTEMA BANCARIO ---");

        // Creamos dos objetos Billetera independientes
        ej2_billetera miCartera = new ej2_billetera("Ivan", 50.0);
        ej2_billetera carteraFalsa = new ej2_billetera("Ivan", 50.0);

        // Operaciones reales
        miCartera.ingresar(25.5);

        boolean exitoCompra = miCartera.retirar(100.0);
        if(exitoCompra) {
            System.out.println("Compra de 100€ aprobada. Saldo restante: " + miCartera.saldo);
        } else {
            System.out.println("Compra de 100€ denegada por saldo insuficiente.");
        }

        /* TAREA 5 (Pregunta 12 de tu examen):
           ¿Qué imprimirá esta comparación? ¿true o false? 
           Piénsalo antes de ejecutarlo: ambas carteras tienen el mismo titular y empezaron con 50.0.
        */
        System.out.println("\n¿Son miCartera y carteraFalsa exactamente la misma cartera?: "
                + (miCartera == carteraFalsa));
    }
}