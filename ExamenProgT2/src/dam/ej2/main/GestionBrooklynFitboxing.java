package dam.ej2.main;
import java.util.ArrayList;
import java.util.Scanner;

import dam.ej2.model.Socio;
import dam.ej2.model.SocioBono;
import dam.ej2.model.SocioMensual;

public class GestionBrooklynFitboxing {

    static ArrayList<Socio> conjuntoSocios;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        conjuntoSocios = new ArrayList<>();

        int opcionMenu;
        boolean continuar = true;

        System.out.println("** Gestión de socios del Brooklyn Fit-boxing **");

        while (continuar) {
            opcionMenu = solicitarOpcion();

            if (opcionMenu==1) {
                nuevoSocio();
            } else if (opcionMenu==2) {
                mostrarSocios();
            } else if (opcionMenu==3) {
                recargarBono();
            } else if (opcionMenu==4) {
                cambiarPlanSocio();
            } else {
                System.out.println("Has salido de la aplicación");
                continuar = false;
            }
        }
        sc.close();
    }

    private static void cambiarPlanSocio() {
        String dni = validarDni();
        String tipoBonoMens;

        for (int i = 0; i < conjuntoSocios.size(); i++) {
            if (conjuntoSocios.get(i) instanceof SocioMensual) {
                if (dni.equalsIgnoreCase(((SocioMensual)conjuntoSocios.get(i)).getDni())) {
                    tipoBonoMens = validarTipoBonoMens();
                    ((SocioMensual)conjuntoSocios.get(i)).setPlan(tipoBonoMens);
                    System.out.println("Bono cambiado a tipo: "+tipoBonoMens);
                    i = conjuntoSocios.size();
                } else {
                    System.out.println("El DNI no se encuentra en la lista");
                }
            } else {
                System.out.println("El socio no es de tipo mensual");
            }
        }
    }

    private static void recargarBono() {
        String dni = validarDni();
        int numSes;

        for (int i = 0; i < conjuntoSocios.size(); i++) {
            if (conjuntoSocios.get(i) instanceof SocioBono) {
                if (dni.equalsIgnoreCase(((SocioBono)conjuntoSocios.get(i)).getDni())) {
                    numSes = validarSesiones();
                    ((SocioBono)conjuntoSocios.get(i)).recargarBono(numSes);
                    System.out.println("Bono recargado con "+numSes+" sesiones");
                    i = conjuntoSocios.size();
                } else {
                    System.out.println("El DNI no se encuentra en la lista");
                }
            } else {
                System.out.println("El socio no es de tipo bono");
            }
        }
    }

    private static void mostrarSocios() {
        if (conjuntoSocios.isEmpty()) {
            System.out.println("No hay socios que mostrar");
        } else {
            for (Socio socio : conjuntoSocios) {
                System.out.println(socio);
            }
        }
    }

    private static void nuevoSocio() {
        String dni = validarDni();

        Socio socio = comprobarDni(dni);

        if (socio != null) {
            System.out.println("EL DNI corresponde a un socio que ya está dado de alta.");
        } else {
            String numTel = validarNumTel();

            String email = validarTexto("Introduce el email del socio:");

            String tipoSocio = validarTipoSocio();

            if (tipoSocio.equalsIgnoreCase("B")) {
                int numSes = validarSesiones();
                SocioBono socBo = new SocioBono(dni, numTel, email, numSes);
                conjuntoSocios.add(socBo);
                System.out.println("\n¡Socio registrado!");
            } else {
                String tipoBonoMens = validarTipoBonoMens();
                String numCuenta = validarTexto("Introduce el número de cuenta del socio:");
                SocioMensual socMens = new SocioMensual(dni,numTel,email,tipoBonoMens,numCuenta);
                conjuntoSocios.add(socMens);
                System.out.println("\n¡Socio registrado!");
            }
        }
    }

    private static Socio comprobarDni(String dni) {
        Socio socio = null;
        for (int i = 0; i < conjuntoSocios.size(); i++) {
            if (conjuntoSocios.get(i).getDni().equalsIgnoreCase(dni)) {
                socio = conjuntoSocios.get(i);
                i = conjuntoSocios.size();
            }
        }
        return socio;
    }

    private static int validarSesiones() {
        boolean valNoOk = true;
        int numero = 0;

        while (valNoOk) {
            try {
                System.out.println("Introduce el número de sesiones que quiere cargar:");
                numero = Integer.parseInt(sc.nextLine());

                if (numero==1 || numero==5 || numero==10 || numero==20) {
                    valNoOk = false;
                } else {
                    System.out.println("El número introducido no coincide con las posibles opciones (1, 5, 10 ó 20)");
                }

            } catch (NumberFormatException e) {
                System.out.println("El valor introducido debe ser un número entero positivo");
            }
        }
        return numero;
    }

    private static String validarTipoBonoMens() {
        String bonoMens = "";

        boolean continuar = true;

        while (continuar) {
            System.out.println("Indica el plan al que se acoge:" +
                    "\n2SS - 2 sesiones/semana" +
                    "\n3SS - 3 sesiones/semana" +
                    "\nSI - sesiones ilimitadas");
            bonoMens = sc.nextLine().trim();

            if (bonoMens.isEmpty()) {
                System.out.println("Debe introducir un valor; no puede estar vacío");
            } else if (bonoMens.equalsIgnoreCase("2SS") || bonoMens.equalsIgnoreCase("3SS") 
                    || bonoMens.equalsIgnoreCase("SI")){
                continuar = false;
            }  else {
                System.out.println("La entrada introducida, no es ni B ni M");
            }
        }
        return bonoMens;
    }

    private static String validarTipoSocio() {
        String tipo = "";

        boolean continuar = true;

        while (continuar) {
            System.out.println("Indica si el socio se va a acoger a bono o a mensualidad (B/M)");
            tipo = sc.nextLine().trim();

            if (tipo.isEmpty()) {
                System.out.println("Debe introducir un valor; no puede estar vacío");
            } else if (tipo.equalsIgnoreCase("B") || tipo.equalsIgnoreCase("M")){
                continuar = false;
            } else {
                System.out.println("La entrada introducida, no es ni B ni M");
            }
        }
        return tipo;
    }

    private static String validarTexto(String mensaje) {
        String nombre = "";

        boolean continuar = true;

        while (continuar) {
            System.out.println(mensaje);
            nombre = sc.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("Debe introducir un valor; no puede estar vacío");
            } else {
                continuar = false;
            }
        }
        return nombre;
    }

    private static String validarNumTel() {
        String numTel = "";

        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce el número de teléfono del socio:");
            numTel = sc.nextLine().trim();

            if (numTel.isEmpty()) {
                System.out.println("Debe introducir un valor; no puede estar vacío");
            } else if (numTel.length()<=12){
                continuar = false;
            }
        }
        return numTel;
    }

    private static String validarDni() {
        String dni = "";

        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce el DNI del socio:");
            dni = sc.nextLine().trim();

            if (dni.isEmpty()) {
                System.out.println("Debe introducir un valor; no puede estar vacío");
            } else if (dni.length() == 9){
                continuar = false;
            }
        }
        return dni;
    }

    private static int solicitarOpcion() {
        boolean valNoOk = true;
        int opcion = 0;

        while (valNoOk) {
            try {
                System.out.println("\nIndica la opción que deseas realizar"
                        +"\n1. Añadir un socio"
                        +"\n2. Mostrar listado de socios"
                        +"\n3. Recargar un bono"
                        +"\n4. Cambiar el plan de un socio"
                        +"\n5. Salir de la aplicación");
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion>=1 && opcion<=5) {
                    valNoOk = false;
                } else {
                    System.out.println("El número introducido no coincide con las posibles opciones");
                }

            } catch (NumberFormatException e) {
                System.out.println("El valor introducido debe ser un número entre el 1 y el 4 prueba de nuevo:");
            }
        }
        return opcion;
    }
}