import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args){

        int numero;

        do {

            String entrada = JOptionPane.showInputDialog("Ingresa número ");
            numero = Integer.parseInt(entrada);

            if (numero == 0){
                JOptionPane.showMessageDialog(null,"No puede ser 0");
                break;
            }

            int potencia = entrada.length();
            double suma = 0;

            for (int i = 0; i < potencia; i++){
                char digit = entrada.charAt(i);
                int digito = Character.getNumericValue(digit);

                suma = suma +Math.pow(digito, potencia);
            }

            if (suma == numero){
                JOptionPane.showMessageDialog(null, numero + "Si es número Armstrong");
            } else {
                JOptionPane.showMessageDialog(null, numero + "No es número Armstrong");
            }

        } while (numero != 0);

    }
    
}
