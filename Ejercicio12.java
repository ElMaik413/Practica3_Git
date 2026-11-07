import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args){

        String cadena = "";

        int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese hasta que número quiere llegar: "));

        for (int i = 1; i <= n; i++){

            cadena += (i * 2) + " , "; 

        }

        JOptionPane.showMessageDialog(null, "Aqui tienes la respuesta: " + cadena);
    }
    
}
