/*
 =====================================================================
 RETO 0: LA ESTRUCTURA BÁSICA Y VARIABLES EN JAVA
 =====================================================================
 En Java, absolutamente todo tiene que vivir dentro de una "clase".
 Además, para que el programa arranque, necesita un "motor" principal.
 Ese motor es el método: public static void main(String[] args)
 */

public class ej0_inicio {

    public static void main(String[] args) {
        System.out.println("Hola, este es mi primer programa en Java");
        int miEdad = 19;
        String miNombre = "Iván";
        System.out.println("Me llamo " + miNombre + " y tengo " + miEdad + " años.");

    }
}