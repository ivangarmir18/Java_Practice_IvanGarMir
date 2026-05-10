public class ej9_static {
    String direccionIP;
    static int conexionesActivas = 0;

    public ej9_static(String ip) {
        this.direccionIP = ip;
        ej9_static.conexionesActivas ++;
    }

    public static void mostrarEstadoServidor() {
        System.out.println("Conexiones actuales: " + ej9_static.conexionesActivas);
    }

    public static void main(String[] args) {
        System.out.println("--- MONITOR DE SERVIDOR ---");

        ej9_static.mostrarEstadoServidor();

        System.out.println("\nIniciando conexiones entrantes...");

        ej9_static c1 = new ej9_static("192.168.1.10");
        ej9_static c2 = new ej9_static("192.168.1.11");
        ej9_static c3 = new ej9_static("192.168.1.12");

        ej9_static.mostrarEstadoServidor();
    }
}