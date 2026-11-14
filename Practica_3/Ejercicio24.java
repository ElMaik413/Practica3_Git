import javax.swing.JOptionPane;
public class Ejercicio24 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Imgrese cuantos números va a sumar"));
        int suma = 0;
        
        for (int i = 1; i <= N; i++){
            int N1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero para sumar"));
            suma += N1;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
    }
    
}
