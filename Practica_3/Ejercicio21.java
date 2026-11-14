import javax.swing.JOptionPane;

public class Ejercicio21 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número N"));
        int contador = 0, limite = 30000;

        while (N < limite) {

            N *= N;
            contador++;

        }

JOptionPane.showMessageDialog(null, "El valor final de N es: " + N +
                                                    "\nSe elevó al cuadrado " + contador + " veces.");        

    }
    
}
