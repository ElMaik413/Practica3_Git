import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args){

        double suma = 0;


        for (int i = 1; i <= 10; i++){
            String entrada = JOptionPane.showInputDialog("Ingrese un numero");
            int n = Integer.parseInt(entrada);
            suma = suma + n;


            
        }

        double media = suma / 100;
        JOptionPane.showMessageDialog(null,"La media es: " + suma );
    }
    
}
