public class Ejercicio7 {
    public static void main(String[] args){

        long suma = 0;
        double producto = 1;

        for (int i = 20; i <= 400; i += 2){

            suma += i;
            producto *= i;
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);

    }
    
}
