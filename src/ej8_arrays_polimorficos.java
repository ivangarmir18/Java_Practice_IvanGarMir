public class ej8_arrays_polimorficos {

    public static void main(String[] args) {

        System.out.println("--- GESTIÓN DE PLANTA POTABILIZADORA ---");

        TanqueBasico[] planta = new TanqueBasico[3];

        planta[0] = new TanqueBasico();
        planta[1] = new TanqueInteligente();
        planta[2] = new TanqueInteligente();

        for (int i = 0; i < planta.length; i++){
            planta[i].llenar();
        }

    }
}