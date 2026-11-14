import javax.swing.JOptionPane;

public class Ejercicio30 {
    public static void main(String[] args) {
        String xentrada = JOptionPane.showInputDialog("Ingresa X:");
        double x = Double.parseDouble(xentrada);

        String nentrada = JOptionPane.showInputDialog("Ingresa n:");
        int n = Integer.parseInt(nentrada);

        double potencia = 1.0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                potencia = potencia * x;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                potencia = potencia * x;
            }
            potencia = 1.0 / potencia;
        } else {
            potencia = 1.0;
        }

        JOptionPane.showMessageDialog(null, "El resultado de " + x + "^" + n + " es: " + potencia);
    }
}