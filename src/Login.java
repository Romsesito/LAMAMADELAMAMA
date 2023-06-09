import java.util.List;
import java.util.Scanner;

public class Login {
    private List<String> usuarios;
    private List<String> contraseñas;
    private Scanner scanner;

    public Login(List<String> usuarios, List<String> contraseñas) {
        this.usuarios = usuarios;
        this.contraseñas = contraseñas;
        scanner = new Scanner(System.in);
    }

    public void iniciarSesion() {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();

        // Verificar si el nombre de usuario y la contraseña coinciden
        int indiceUsuario = usuarios.indexOf(nombreUsuario);
        if (indiceUsuario != -1 && contraseñas.get(indiceUsuario).equals(contraseña)) {
            System.out.println("¡Inicio de sesión exitoso! ¡Felicidades!");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Vuelva a intentarlo.");
        }
    }
}
