import java.util.Scanner;

public class GestionTaller {

    // Objetos de tipo Talleres (ahora NO son estáticos)
    private Talleres taller1 = new Talleres();
    private Talleres taller2 = new Talleres();

    // Scanner compartido
    private Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        GestionTaller app = new GestionTaller();
        app.ejecutarMenu();
    }

    // Menú principal con IF en lugar de switch
    public void ejecutarMenu() {
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n========= MENÚ DE OPCIONES =========");
            System.out.println("1. Ingresar datos del Taller 1");
            System.out.println("2. Ingresar datos del Taller 2");
            System.out.println("3. Inscribir estudiantes en un taller");
            System.out.println("4. Visualizar información de los talleres");
            System.out.println("5. Mostrar taller con más participantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                Ingresar_datos_taller1();
            } else if (opcion == 2) {
                Ingresar_datos_taller2();
            } else if (opcion == 3) {
                inscribirEstudiantesMenu();
            } else if (opcion == 4) {
                System.out.println("\n--- Información Taller 1 ---");
                taller1.visualizar_informacion();
                System.out.println("\n--- Información Taller 2 ---");
                taller2.visualizar_informacion();
            } else if (opcion == 5) {
                Mostrar_taller_mas_participantes();
            } else if (opcion == 6) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    // Ingresar datos taller 1
    public void Ingresar_datos_taller1() {
        System.out.println("\nIngrese datos del Taller 1:");
        System.out.print("Nombre del taller: ");
        String nombre_taller1 = leer.next();
        taller1.setNombre(nombre_taller1);

        System.out.print("Límite de participantes: ");
        int limite_participantes1 = leer.nextInt();
        taller1.setLimite_participantes(limite_participantes1);
        taller1.setCupos_disponibles(limite_participantes1);
        taller1.setParticipantes_inscritos(0);
    }

    // Ingresar datos taller 2
    public void Ingresar_datos_taller2() {
        System.out.println("\nIngrese datos del Taller 2:");
        System.out.print("Nombre del taller: ");
        String nombre_taller2 = leer.next();
        taller2.setNombre(nombre_taller2);

        System.out.print("Límite de participantes: ");
        int limite_participantes2 = leer.nextInt();
        taller2.setLimite_participantes(limite_participantes2);
        taller2.setCupos_disponibles(limite_participantes2);
        taller2.setParticipantes_inscritos(0);
    }

    // Submenú para inscribir estudiantes
    public void inscribirEstudiantesMenu() {
        System.out.println("\n¿En qué taller desea inscribir?");
        System.out.println("1. Taller 1 (" + taller1.getNombre() + ")");
        System.out.println("2. Taller 2 (" + taller2.getNombre() + ")");
        System.out.print("Seleccione: ");
        int opcion = leer.nextInt();

        if (opcion == 1) {
            taller1.inscribir_estudiantes();
        } else if (opcion == 2) {
            taller2.inscribir_estudiantes(    );
        } else {
            System.out.println("Opción inválida.");
        }
    }

    // Mostrar el taller con más participantes
    public void Mostrar_taller_mas_participantes() {
        if (taller1.getParticipantes_inscritos() > taller2.getParticipantes_inscritos()) {
            System.out.println("El taller con más participantes inscritos es: " +
                    taller1.getNombre() + " con " + taller1.getParticipantes_inscritos() + " participantes.");
        } else if (taller2.getParticipantes_inscritos() > taller1.getParticipantes_inscritos()) {
            System.out.println("El taller con más participantes inscritos es: " +
                    taller2.getNombre() + " con " + taller2.getParticipantes_inscritos() + " participantes.");
        } else {
            System.out.println("Ambos talleres tienen la misma cantidad de participantes: " +
                    taller1.getParticipantes_inscritos());
        }
    }
}
