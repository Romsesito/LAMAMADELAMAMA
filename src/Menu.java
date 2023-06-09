import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
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
                    Register register = new Register();
                    register.registrar();
                    break;
                case 2:
                    Login login = new Login();
                    login.iniciarSesion();
                    break;
                case 3:
                    DeleteAccount deleteAccount = new DeleteAccount();
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
