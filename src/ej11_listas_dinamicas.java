import java.util.ArrayList; // Herramienta nativa de Java
public class ej11_listas_dinamicas {

    public static void main(String[] args) {
        System.out.println("--- GESTOR DE SENSORES DINÁMICO ---");
        ArrayList<String> listaSensores = new ArrayList<>();

        listaSensores.add("Sensor_Temperatura");
        listaSensores.add("Sensor_Presion");
        listaSensores.add("Sensor_Humedad");

        System.out.println("Cantidad de sensores instalados: " + listaSensores.size());

        for (int i = 0; i < listaSensores.size(); i++) {
            System.out.println(listaSensores.get(i));
        }

        System.out.println("\n--- SIMULANDO ROTURA DE HARDWARE ---");
        listaSensores.remove(1);
        System.out.println("Cantidad de sensores instalados: " + listaSensores.size());

    }
}