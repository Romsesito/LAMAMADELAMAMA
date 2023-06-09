import java.util.List;
import java.util.Scanner;

public class Login {
    private List<String> usuarios;
    private List<String> contraseñas;
    private List<String> transacciones;
    private Scanner scanner;

    public Login(List<String> usuarios, List<String> contraseñas, List<String> transacciones) {
        this.usuarios = usuarios;
        this.contraseñas = contraseñas;
        this.transacciones = transacciones;
        this.scanner = new Scanner(System.in);
    }

    public Login(List<String> usuarios, List<String> contraseñas) {
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

            // Redirigir al usuario a la clase Dashboard
            Dashboard dashboard = new Dashboard(usuarios, contraseñas, transacciones);
            dashboard.mostrar();
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Vuelva a intentarlo.");
        }
    }
}
