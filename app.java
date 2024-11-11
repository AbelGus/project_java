import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un mensaje: ");
        String mensaje = scanner.nextLine();
        System.out.println("El mensaje ingresado es: " + mensaje);
        scanner.close();
    }
}
