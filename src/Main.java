import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> usuarios = new ArrayList<>();
        List<String> contraseñas = new ArrayList<>();

        Menu menu = new Menu(usuarios, contraseñas);
        menu.mostrar();
    }
}