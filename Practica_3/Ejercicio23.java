import javax.swing.JOptionPane;
public class Ejercicio23 {
    public static void main(String[] args){
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N"));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Ingrese M"));
        String resultado = "";
        for (int i = N; i <= M; i++) {
            if (i % 2 == 0){
                
                resultado = resultado + i + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Aqui tienes los pares entre " + N + " Y " + M + "\n" + resultado);
    }
}
