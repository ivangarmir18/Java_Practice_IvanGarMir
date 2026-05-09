public class ej3_control {

    public static void main(String[] args) {

        System.out.println("PARTE 1: ARRAYS");

        String[] nombres = {"Ana", "Luis", "Marta"};
        System.out.println(nombres[0]);

        System.out.println("\nPARTE 2: EL SWITCH TRAMPOSO");
        int z = 3;
        int x = 0;

        switch (z) {
            case 1:
                x++;
                break;
            case 2:
                x--;
                break;
            case 3:
                x++;
            case 4:
                x--;
            default:
                x++;
        }

        System.out.println("El valor final de la variable 'x' es: " + x);
    }
}