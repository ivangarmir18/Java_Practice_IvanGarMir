public class ej6_deposito {
    int nivelAgua;
    int capacidadMaxima;

    // Constructor
    public ej6_deposito(int capacidadMaxima) {
        this.nivelAgua = 0;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void abrirGrifo(int litros) throws Exception {
        if (this.nivelAgua + litros > capacidadMaxima) {
            throw new Exception("¡Alarma! Desbordamiento de agua inminente.");
        }
        else {
            this.nivelAgua += litros;
        }
    }


    public static void main(String[] args) {

        System.out.println("--- INICIANDO SIMULACIÓN DE DEPÓSITO ---");

        ej6_deposito miTanque = new ej6_deposito(50);
        try {
            miTanque.abrirGrifo(60);
        }
        catch (Exception e){
            System.out.print("El sensor de la boya ha detenido el grifo: " + e.getMessage());
        }
        System.out.println("Nivel de agua final: " + miTanque.nivelAgua + " litros.");
    }
}