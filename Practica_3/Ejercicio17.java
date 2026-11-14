import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args){

        String consumos = "";
        double pagosT = 0;

        for (int i = 1; i <= 2; i++) {

            double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese consumo"));

            if (n > 130) {

            n *= 0.85;

            }
            pagosT += n;
            consumos += "$" + n + " , ";

        }

        JOptionPane.showMessageDialog(null, "Consumos procesados:\n" + consumos + "\n\nTotal general de pagos: $" + pagosT);

    }
    
}
