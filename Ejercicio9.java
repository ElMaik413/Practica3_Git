import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;

        System.out.println("Escribe letras una por una:");

        do {
            String entrada = teclado.next();
            letra = entrada.toLowerCase().charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La primera vocal leída es: " + letra);
                break;
            }
            
        } while (true); 
        
        teclado.close(); 
    }
}