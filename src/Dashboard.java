import java.util.Scanner;
import java.util.List;

public class Dashboard {
    private Scanner scanner;
    private List<String> clientes;
    private List<String> proveedores;
    private List<String> transacciones;

    public Dashboard(List<String> clientes, List<String> proveedores, List<String> transacciones) {
        scanner = new Scanner(System.in);
        this.clientes = clientes;
        this.proveedores = proveedores;
        this.transacciones = transacciones;
    }

    public Dashboard() {

    }

    public void mostrar() {
        int opcion;
        do {
            System.out.println("----- Panel de Control -----");
            System.out.println("1. Realizar transacción");
            System.out.println("2. Generar informe financiero");
            System.out.println("3. Gestionar clientes y proveedores");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Transaction transaction = new Transaction();
                    transaction.realizarTransaccion();
                    break;
                case 2:
                    FinancialReport financialReport = new FinancialReport();
                    financialReport.generarReporte(clientes, proveedores, transacciones);
                    break;
                case 3:
                    CustomerSupplier customerSupplier = new CustomerSupplier();
                    customerSupplier.gestionarClientesProveedores();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}