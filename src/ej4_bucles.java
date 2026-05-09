/*
 =====================================================================
 RETO 4: BUCLES (FOR y DO-WHILE) Y LÍMITES DE MEMORIA
 =====================================================================
 Objetivo: Entender cómo iterar sobre un array sin salirnos de sus 
 límites (evitando la temida ArrayIndexOutOfBoundsException) y ver la 
 diferencia de comportamiento en los bucles condicionales.
 */

public class ej4_bucles {

    public static void main(String[] args) {

        System.out.println("--- PARTE 1: EL BUCLE FOR ---");
        String[] contraseñas = {"1234", "admin", "qwerty", "1111"};
        for (int i = 0; i < contraseñas.length; i++){
            System.out.println("Contraseña detectada: " + contraseñas[i]);
        }

        System.out.println("\n--- PARTE 2: LA TRAMPA DEL DO-WHILE ---");

        int bateria = 0;
        do {
            System.out.println("Cargando sistema de emergencia...");
            bateria++;

        } while (bateria < 0);

        System.out.println("Batería final: " + bateria);
    }
}