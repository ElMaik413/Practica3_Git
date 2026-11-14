import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args){
    
    String entrada = JOptionPane.showInputDialog("Ingresa el número factorial");    
    int n = Integer.parseInt(entrada);
    
    long factorial = 1;

    for (int i = 1; i <= n; i++) {
        factorial = factorial * i;
    }

    JOptionPane.showMessageDialog(null, "El resultado es: " + factorial);

    }
    
}
