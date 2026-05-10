public class ej12_examen_teorico {

    static int intentosFallidos = 0;

    public static void registrarFallo() {
        intentosFallidos++;
    }
    public static void main(String[] args) {

        System.out.println("--- SISTEMA DE LOGIN ---");

        int limiteIntentos = 5;

        String claveCorrecta = "admin123";
        String claveIntroducida = new String("admin123");

        if (intentosFallidos < limiteIntentos) {

            if (claveCorrecta.equals(claveIntroducida)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
                registrarFallo();
            }
        }

        System.out.println("\n--- TRAMPA 4: PRECEDENCIA DE OPERADORES ---");
        int x = 5;
        int y = ++x + x++;
    }
}