import java.util.Scanner;
import java.util.List;

public class Menu {
    private Scanner scanner;
    private List<String> usuarios;
    private List<String> contraseñas;

    public Menu(List<String> usuarios, List<String> contraseñas) {
        scanner = new Scanner(System.in);
        this.usuarios = usuarios;
        this.contraseñas = contraseñas;
    }

    public void mostrar() {
        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Registrar");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Eliminar cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Register register = new Register(usuarios, contraseñas);
                    register.registrar();
                    break;
                case 2:
                    Login login = new Login(usuarios, contraseñas);
                    login.iniciarSesion();
                    break;
                case 3:
                    DeleteAccount deleteAccount = new DeleteAccount(usuarios, contraseñas);
                    deleteAccount.eliminarCuenta();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}