import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingresa el valor de N: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            suma += i; 
        }

        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        
        leer.close(); 
        
    }
}