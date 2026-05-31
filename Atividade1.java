public class Atividade1 {

    public static void piramideNumeros(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (j <= i) {
                    System.err.print(i + 1);
                }
            }
            
            System.err.println();
        }
    }
    public static void main(String[] args) {
        piramideNumeros(5);
        
    }
}