import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingresa un número (ej. 2, 4, 8, 16...):");
        int n = Integer.parseInt(entrada);
        
        int resultado = (int) (Math.log(n) / Math.log(2));
        
        JOptionPane.showMessageDialog(null, "El logaritmo base 2 de " + n + " es: " + resultado);
    }
}