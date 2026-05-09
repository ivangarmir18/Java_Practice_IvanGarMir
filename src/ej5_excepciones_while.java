public class ej5_excepciones_while {

    public static void main(String[] args) {

        System.out.println("PARTE 1: ESCRIBIENDO EL BUCLE WHILE");
        int litrosTanque = 5;
        while (litrosTanque >= 0){
            System.out.println("Vaciando agua... Quedan " + litrosTanque + " litros.");
            litrosTanque--;
        }

        System.out.println("\nPARTE 2: CAPTURANDO ERRORES (TRY-CATCH)");

        String[] sensores = {"Boya_Fondo", "Boya_Tope"};
        try {
            System.out.println("Leyendo el tercer sensor: " + sensores[2]);
        }
        catch (Exception e) {
            System.out.println("Error de hardware: Sensor no encontrado." );
        }


        System.out.println("Si ves esto, el programa no ha explotado.");

    }
}