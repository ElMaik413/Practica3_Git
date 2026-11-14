import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args) {
        double sumaNotas = 0;
        int contadorAlumnos = 0;
        double nota = 0;

        while (nota != -10) {
            nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del alumno (ingrese -10 para terminar):"));
            
            if (nota != -10) {
                sumaNotas += nota;
                contadorAlumnos++;
            }
        }

        if (contadorAlumnos > 0) {
            double media = sumaNotas / contadorAlumnos;
            JOptionPane.showMessageDialog(null, "La media de las " + contadorAlumnos + " notas es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron notas válidas.");
        }
    }
}