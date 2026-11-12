import javax.swing.JOptionPane;

public class Ejercicio21 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número N"));
        int resultado = 1, contator = 0, limite = 30000;

        while ((resultado * N) <= limite) {

            resultado *= N;
            contator++;

        }

        JOptionPane.showMessageDialog(null, "El numero elevado al cuadrado antes de 30,000 es: " + contator + "\n""Las veces que se elevó: " + resultado);
        

    }
    
}
