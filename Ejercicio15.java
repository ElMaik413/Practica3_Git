import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static void main(String[] args) {
        double caja = 5000.00;
        double totalEgresos = 0.00;
        double egreso = 0;

        while (egreso != -1) {
            egreso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el egreso (ingrese -1 para terminar):"));
            
            if (egreso != -1) {
                totalEgresos += egreso;
                caja -= egreso;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de egresos: $" + totalEgresos + "\nDinero restante en caja: $" + caja);
    }
}