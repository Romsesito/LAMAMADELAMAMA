import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerSupplier {
    private Scanner scanner;
    private List<String> clientes;
    private List<String> proveedores;

    public CustomerSupplier() {
        scanner = new Scanner(System.in);
        clientes = new ArrayList<>();
        proveedores = new ArrayList<>();
    }

    public void gestionarClientesProveedores() {
        int opcion;
        do {
            System.out.println("----- Gestión de Clientes y Proveedores -----");
            System.out.println("1. Agregar un Cliente");
            System.out.println("2. Agregar un Proveedor");
            System.out.println("3. Volver al menú anterior");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea después de la lectura del número

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarProveedor();
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

    private void agregarCliente() {
        System.out.println("----- Agregar un Cliente -----");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la descripción del producto: ");
        String descripcionProducto = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de la lectura del número

        String cliente = "Nombre: " + nombreCliente + ", Producto: " + descripcionProducto + ", Precio: $" + precioProducto;
        clientes.add(cliente);
        System.out.println("Cliente agregado con éxito.");
    }

    private void agregarProveedor() {
        System.out.println("----- Agregar un Proveedor -----");
        System.out.print("Ingrese el nombre del proveedor: ");
        String nombreProveedor = scanner.nextLine();
        System.out.print("Ingrese la descripción del producto: ");
        String descripcionProducto = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de la lectura del número

        String proveedor = "Nombre: " + nombreProveedor + ", Producto: " + descripcionProducto + ", Precio: $" + precioProducto;
        proveedores.add(proveedor);
        System.out.println("Proveedor agregado con éxito.");
    }

    public List<String> getClientes() {
        return clientes;
    }

    public List<String> getProveedores() {
        return proveedores;
    }
}
