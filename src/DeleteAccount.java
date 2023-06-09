import java.util.List;
import java.util.Scanner;

public class DeleteAccount {
    private List<String> usuarios;
    private List<String> contraseñas;
    private Scanner scanner;

    public DeleteAccount(List<String> usuarios, List<String> contraseñas) {
        this.usuarios = usuarios;
        this.contraseñas = contraseñas;
        scanner = new Scanner(System.in);
    }

    public void eliminarCuenta() {
        System.out.println("Lista de cuentas registradas:");

        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i));
        }

        System.out.print("Seleccione el número de cuenta que desea eliminar: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= usuarios.size()) {
            usuarios.remove(opcion - 1);
            contraseñas.remove(opcion - 1);
            System.out.println("La cuenta ha sido eliminada exitosamente.");
        } else {
            System.out.println("Opción inválida. No se ha realizado ninguna eliminación.");
        }
    }
}
