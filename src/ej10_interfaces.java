interface AlarmaHardware {
    void activarSonido();
    void enviarNotificacion(String mensaje);
}

class TanqueQuimico implements AlarmaHardware{
    int presion = 100;

    public void activarSonido() {
        System.out.println("¡PIII PIII PIII! Fuga de químico.");
    }
    public void enviarNotificacion(String mensaje) {
        System.out.println("SMS al supervisor: " + mensaje);
    }
}

public class ej10_interfaces {

    public static void main(String[] args) {

        System.out.println("--- SISTEMA DE SEGURIDAD ---");
        TanqueQuimico miTanque = new TanqueQuimico();

        miTanque.presion += 50;

        if (miTanque.presion > 120) {

            miTanque.activarSonido();
            miTanque.enviarNotificacion("El tanque supera la presión máxima. Presión actual: " + miTanque.presion);

        }
    }
}