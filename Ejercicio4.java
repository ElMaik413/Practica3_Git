import java.text.ListFormat.Style;
import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args){

    
    int pares = 0, impares = 0, positivos = 0, negativos = 0;

    for (int i = 1; i <=50; i++){

        String entrada = JOptionPane.showInputDialog("Ingresa un número natural:");
        int n = Integer.parseInt(entrada);
        
        

            if (n < 0){

                negativos++;

            }else if (n >= 0){

                positivos++;

            }
            
            if (n % 2==0) {

                pares++;

            } else {

                impares++;

            }
        }

        JOptionPane.showMessageDialog(null, "Resultados finales: " + pares + "Impares: " + impares + "Positivos: " + positivos + "Negativos: " + negativos );

    }

}
