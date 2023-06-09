import java.util.List;
import java.util.Scanner;

public class Register {
    private List<String> usuarios;
    private List<String> contraseñas;
    private Scanner scanner;

    public Register(List<String> usuarios, List<String> contraseñas) {
        this.usuarios = usuarios;
        this.contraseñas = contraseñas;
        scanner = new Scanner(System.in);
    }

    public void registrar() {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        // Verificar si el nombre de usuario ya existe
        if (usuarios.contains(nombreUsuario)) {
            System.out.println("El nombre de usuario ya existe. Por favor, elija otro.");
            return;
        }

        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();

        usuarios.add(nombreUsuario);
        contraseñas.add(contraseña);

        System.out.println("¡Usuario registrado exitosamente!");
    }
}