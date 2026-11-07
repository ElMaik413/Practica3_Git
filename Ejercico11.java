import javax.swing.JOptionPane;

public class Ejercico11 {
    public static void main(String[] args){

        double aprobadas = 0, reprobadas = 0, promedioA = 0, promedioR = 0, promedioFA = 0, promedioFR = 0;

        String entrada = JOptionPane.showInputDialog("Ingrese el número de calificaiones");
        int calificaiones = Integer.parseInt(entrada);

        for (int i = 1; i <= calificaiones; i++){

            String calificacion = JOptionPane.showInputDialog("Ingrese la calificación: ");
            double calificacionF = Double.parseDouble(calificacion);

            if  ( calificacionF >= 6){

                aprobadas += calificacionF;
                promedioA++;

            } else {

                reprobadas += calificacionF;
                promedioR++;

            }
        
        }

            if (promedioA > 0){

            promedioFA = aprobadas / promedioA;

            }
            
            if (promedioR > 0){

            promedioFR = reprobadas / promedioR;

            }

        JOptionPane.showMessageDialog(null, "Promedio de las aprobadas:\n" + promedioFA + "Promedio de las reprobadas: \n" + promedioFR);

    }
}
