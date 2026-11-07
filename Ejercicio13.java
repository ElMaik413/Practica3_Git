import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args){

        int producto = 1;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n"));

        for (int i = 1; i <= n; i++){

            producto *= i;

        }

        JOptionPane.showMessageDialog(null, "El producto es: " + producto);

    }
}
