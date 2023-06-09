import java.util.List;

public class FinancialReport {
    public static void generarReporte(List<String> clientes, List<String> proveedores, List<String> transacciones) {
        System.out.println("----- Ingresos y Egresos del Hospital -----");
        System.out.println("----- Clientes -----");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("----- Proveedores -----");
        for (String proveedor : proveedores) {
            System.out.println(proveedor);
        }

        System.out.println("----- Transacciones -----");
        for (String transaccion : transacciones) {
            System.out.println(transaccion);
        }
    }
}
