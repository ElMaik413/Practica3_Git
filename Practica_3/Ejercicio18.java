import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args){

        int nP = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        int maximo = nP, minimo = nP;

        for (int i= 1; i <= 100; i++) {

            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + i + " de 100:"));

            if (n > maximo) {

            maximo = n;
            
            }

            if (n < minimo) {

                minimo = n;

            }

            
        }
        JOptionPane.showMessageDialog(null, "El número mas alto es: " + maximo + "y el minimo es: " + minimo);
    }
}
