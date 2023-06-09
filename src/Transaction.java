import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    private Scanner scanner;
    private List<String> ingresos;
    private List<String> egresos;

    public Transaction() {
        scanner = new Scanner(System.in);
        ingresos = new ArrayList<>();
        egresos = new ArrayList<>();
    }

    public void realizarTransaccion() {
        int opcion;
        do {
            System.out.println("----- Transacciones -----");
            System.out.println("1. Añadir Ingresos");
            System.out.println("2. Añadir Egresos");
            System.out.println("3. Volver al menú anterior");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea después de la lectura del número

            switch (opcion) {
                case 1:
                    agregarIngresos();
                    break;
                case 2:
                    agregarEgresos();
                    break;
                case 3:
                    System.out.println("Volviendo al menú anterior...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }

    private void agregarIngresos() {
        System.out.println("----- Añadir Ingresos -----");
        char opcion;
        do {
            System.out.print("Ingrese el nombre del ingreso: ");
            String nombreIngreso = scanner.nextLine();
            System.out.print("Ingrese el precio del ingreso: ");
            String precioIngreso = scanner.nextLine();
            String ingreso = nombreIngreso + " - $" + precioIngreso;
            ingresos.add(ingreso);
            System.out.println("Ingreso añadido con éxito.");

            System.out.print("¿Desea agregar otro ingreso? (S/N): ");
            opcion = scanner.nextLine().charAt(0);
        } while (Character.toUpperCase(opcion) == 'S');
    }

    private void agregarEgresos() {
        System.out.println("----- Añadir Egresos -----");
        char opcion;
        do {
            System.out.print("Ingrese el nombre del egreso: ");
            String nombreEgreso = scanner.nextLine();
            System.out.print("Ingrese el precio del egreso: ");
            String precioEgreso = scanner.nextLine();
            String egreso = nombreEgreso + " - $" + precioEgreso;
            egresos.add(egreso);
            System.out.println("Egreso añadido con éxito.");

            System.out.print("¿Desea agregar otro egreso? (S/N): ");
            opcion = scanner.nextLine().charAt(0);
        } while (Character.toUpperCase(opcion) == 'S');
    }

    public List<String> getIngresos() {
        return ingresos;
    }

    public List<String> getEgresos() {
        return egresos;
    }
}