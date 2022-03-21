package dam.ej1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class GestionTarjetaPuntos {
    static HashMap<String, Integer> tablaPuntos;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        tablaPuntos = new HashMap<>();
        String matricula;
        int litros;
        String respuesta;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Indica la matrícula del vehículo que ha repostado:");
            matricula = sc.nextLine();
            System.out.println("Indica la cantidad de litros repostados:");
            litros = Integer.parseInt(sc.nextLine());

            if (!tablaPuntos.containsKey(matricula)) {
                tablaPuntos.put(matricula.toUpperCase(),litros/10);
                System.out.println("NUEVA TARJETA, ACUMULADOS EN ESTE REPOSTAJE: "+tablaPuntos.get(matricula)+" PUNTOS");
            } else {
                tablaPuntos.put(matricula.toUpperCase(),(litros/10)+tablaPuntos.get(matricula));
                System.out.println("ACUMULACIÓN DE PUNTOS, ACUMULADOS EN ESTE REPOSTAJE: "+(litros/10)+" PUNTOS");
            }
            System.out.println("¿Deseas continuar?");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("NO")) {
                continuar = false;
            }
        }
        sc.close();

        mostrarTablaOrd();
    }

    private static void mostrarTablaOrd() {
        TreeMap<String,Integer> tablaPuntosOrd;
        tablaPuntosOrd = new TreeMap<>(tablaPuntos);

        if (tablaPuntosOrd.isEmpty()) {
            System.out.println("La tabla no contiene registros de matrículas");
        } else {
            System.out.println("***Listado de tarjetas***");
            int contTarjMasDiezPts = 0;
            for (String matriculas: tablaPuntosOrd.keySet()) {
                if (tablaPuntosOrd.get(matriculas) >= 10) {
                    contTarjMasDiezPts++;
                }
                System.out.println(matriculas + " - " + tablaPuntosOrd.get(matriculas)+" PUNTOS");
            }
            System.out.println("Cantidad de tarjetas con 10 o más puntos: "+contTarjMasDiezPts);
        }
    }
}