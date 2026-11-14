import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el ancho: ");
        int ancho = scanner.nextInt();
        
        System.out.print("Ingresa la altura: ");
        int altura = scanner.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            
            for (int j = 1; j <= ancho; j++) {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
        
        scanner.close();
    }
}