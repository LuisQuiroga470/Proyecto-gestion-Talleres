import java.util.Scanner;

public class GestionTaller {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Instancias de los talleres
        Talleres taller1 = new Talleres();
        Talleres taller2 = new Talleres();

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("========= MENÚ DE OPCIONES =========");
            System.out.println("1. Ingresar datos del Taller 1");
            System.out.println("2. Ingresar datos del Taller 2");
            System.out.println("3. Inscribir estudiantes en un taller");
            System.out.println("4. Visualizar información de los talleres");
            System.out.println("5. Mostrar taller con más participantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            if (opcion == 1) { //INGRESAR DATOS TALLER 1
                System.out.println("Ingrese datos del Taller 1:");
                System.out.print("Nombre: ");
                String nombre = leer.next();
                System.out.print("Límite de participantes: ");
                int limite = leer.nextInt();

                
                taller1.setNombre(nombre);
                taller1.setLimite_participantes(limite);
                taller1.setCupos_disponibles(limite);
                taller1.setParticipantes_inscritos(0);

            } else if (opcion == 2) { //INGRESAR DATOS TALLER 2
                System.out.println("Ingrese datos del Taller 2:");
                System.out.print("Nombre: ");
                String nombre = leer.next();
                System.out.print("Límite de participantes: ");
                int limite = leer.nextInt();

                
                taller2.setNombre(nombre);
                taller2.setLimite_participantes(limite);
                taller2.setCupos_disponibles(limite);
                taller2.setParticipantes_inscritos(0);

            } else if (opcion == 3) { // inscribir estudiantes en un taller
                System.out.println("¿En que taller desea inscribir?");
                System.out.println("1. Taller 1 (" + taller1.getNombre() + ")");
                System.out.println("2. Taller 2 (" + taller2.getNombre() + ")");
                int subopcion = leer.nextInt();

                
                if (subopcion == 1) {
                    taller1.inscribir_estudiantes();
                } else if (subopcion == 2) {
                    taller2.inscribir_estudiantes();
                } else {
                    System.out.println("Opción inválida.");
                }

            } else if (opcion == 4) {
                
                System.out.println("--- Taller 1 ---");
                taller1.visualizar_informacion();
                System.out.println("--- Taller 2 ---");
                taller2.visualizar_informacion();



            } else if (opcion == 5) { //VER CUAL TALLER TIENE MAS PARTICIPANTES
                
                if (taller1.getParticipantes_inscritos() > taller2.getParticipantes_inscritos()) {
                    System.out.println("El taller con más participantes es: " + taller1.getNombre());
                } else if (taller2.getParticipantes_inscritos() > taller1.getParticipantes_inscritos()) {
                    System.out.println("El taller con más participantes es: " + taller2.getNombre());
                } else {
                    System.out.println("Ambos talleres tienen la misma cantidad de participantes");
                }
                           //SALIR
            } else if (opcion == 6) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida.");
            }
        }

        leer.close();
    }
}
