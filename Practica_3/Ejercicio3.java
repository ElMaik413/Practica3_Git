import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int numero = leer.nextInt();
        
        int suma = 0;
        
        int temporal = numero;
        
        while (temporal > 0) {
            int digito = temporal % 10;
            suma += digito;
            temporal /= 10;
        }
        
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
        
        leer.close();
    }
}