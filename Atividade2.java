import java.util.Scanner;

public class Atividade2 {

    public static void piramideNumeros(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
    
                if (j <= i) {
                    System.err.print(j + 1);
                }
            }
    
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número final da piramide: ");
        int numeroUsuario = sc.nextInt();
        piramideNumeros(numeroUsuario);

        sc.close();

    }
}
