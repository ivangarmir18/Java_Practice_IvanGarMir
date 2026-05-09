class TanqueBasico {
    int nivelAgua = 0;

    public void llenar() {
        this.nivelAgua += 10;
        System.out.println("Tanque Básico: nivel a " + this.nivelAgua);
    }
}

class TanqueInteligente extends TanqueBasico {
    @Override
    public void llenar() {
        this.nivelAgua += 20;
        System.out.println("Tanque Ingeligente: nivel a " + this.nivelAgua + " litros");
    }
}

public class ej7_herencia {

    public static void main(String[] args) {

        System.out.println("PRUEBA 1: COMPORTAMIENTO NORMAL");
        TanqueBasico t1 = new TanqueBasico();
        t1.llenar();

        TanqueInteligente t2 = new TanqueInteligente();
        t2.llenar();

        System.out.println("\nPRUEBA 2: POLIMORFISMO ");

        TanqueBasico t3 = new TanqueInteligente();
        t3.llenar();
    }
}