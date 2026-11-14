import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args){

        int suma = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero mayor o igual a 8:"));

        if (n >= 8) {
            for (int i = 8; i <= n; i++) {
                suma += i;
            }
            JOptionPane.showMessageDialog(null, "La suma desde 8 hasta " + n + " es: " + suma);
        } else {
            JOptionPane.showMessageDialog(null, "El número debe ser mayor o igual a 8.");
        }

    }
}
