import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        String entradaN = JOptionPane.showInputDialog("¿Cuántos trabajadores vas a evaluar?");
        int n = Integer.parseInt(entradaN);
        
        int contador500 = 0;
        double sumaSalarios = 0;
        
        for (int i = 1; i <= n; i++) {
            String entradaTarifa = JOptionPane.showInputDialog("Trabajador " + i + " - Tarifa por hora:");
            double tarifa = Double.parseDouble(entradaTarifa);
            
            String entradaHoras = JOptionPane.showInputDialog("Trabajador " + i + " - Horas trabajadas:");
            double horas = Double.parseDouble(entradaHoras);
            
            double salario = tarifa * horas;
            sumaSalarios = sumaSalarios + salario;
            
            if (salario >= 500) {
                contador500++;
            }
        }
        
        double promedio = sumaSalarios / n;
        
        JOptionPane.showMessageDialog(null, "Trabajadores que ganan $500 o más: " + contador500 + "\nPromedio de todos los salarios: $" + promedio);
    }
}