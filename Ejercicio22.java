import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void main(String[] args) {
        int P = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los metros"));
        int S = Integer.parseInt(JOptionPane.showInputDialog("Cuánto sube el pequeño caracol??"));
        int R = Integer.parseInt(JOptionPane.showInputDialog("Cuánto harás bajar al pequeño caracol?? :(("));

        if (S <= R) {
            JOptionPane.showMessageDialog(null, "Debe subir más de lo que baja >:c");
        } else {
            int dias = 0;
            int distanciaActual = 0;

            while (distanciaActual < P) {
                dias++;
                distanciaActual += S;
                
                if (distanciaActual >= P) {
                    break;
                }
                
                distanciaActual -= R;
            }

            JOptionPane.showMessageDialog(null, "El pobre caracol saldrá en: " + dias + " Días");
        }
    }
}