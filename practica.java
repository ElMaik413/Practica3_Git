public class practica {
    public static void main(String[] args) {
        // Solo un cultivo a la vez. Puedes cambiar este número para probar.
        int nivel = 8; 
        
        if (nivel == 10){

            System.out.println("Cultivo listo para cosechar");

        }else if (nivel < 5){
            System.out.println("Necesita agua");
        }else 
            System.out.println("Creciendo bien");

        
    }
}