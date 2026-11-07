import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int aprobadas = 0;
        int reprobadas = 0;
        
        double sumaTotal = 0;
        double sumaAprobadas = 0;
        double sumaReprobadas = 0;
        
        System.out.println("Ingresa el número total de materias (N): ");
        int n = leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresa la calificación de la materia " + i + ": ");
            double calificacion = leer.nextDouble();
            
            sumaTotal += calificacion; 
            
            if (calificacion >= 60) { 
                aprobadas++; 
                sumaAprobadas += calificacion;
            } else {
                reprobadas++;
                sumaReprobadas += calificacion;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("a) Materias reprobadas: " + reprobadas);
        System.out.println("b) Materias aprobadas: " + aprobadas);
        System.out.println("c) Promedio general: " + (sumaTotal / n));
        
        if (aprobadas > 0) {
            System.out.println("d) Promedio de aprobadas: " + (sumaAprobadas / aprobadas));
        } else {
            System.out.println("d) Promedio de aprobadas: 0.0 (Ninguna aprobada)");
        }
        
        if (reprobadas > 0) {
            System.out.println("e) Promedio de reprobadas: " + (sumaReprobadas / reprobadas));
        } else {
            System.out.println("e) Promedio de reprobadas: 0.0 (Ninguna reprobada)");
        }
        
        leer.close();
    }
}