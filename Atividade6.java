import java.util.Scanner;

public class Atividade6 {
    
    public static String converterHora(int hora, int minuto) {
        
        if (hora < 12) {
            return hora + ":" + minuto + " A.M.";
        } else {
            hora = hora - 12;
            return hora + ":" + minuto + " P.M.";
        } 

        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operador;
        do {
            System.out.println("\nCONVERSOR DE HORAS DO SAMUEL");

            System.out.println("\n1 - Converter Hora");
            System.out.println("0 - Sair");

            System.out.println("\nDigite o valor da operação desejada:");
            operador = sc.nextInt();

            switch (operador) {
                case 1:
                    System.out.println("\nDigite a hora que deseja:");
                    int horaDigitada = sc.nextInt();

                    System.out.println("Digite os minutos que deseja:");
                    int minutosDigitadas = sc.nextInt();

                    String horaConvertida = converterHora(horaDigitada, minutosDigitadas);
                    System.out.println("\nHora convertida: " + horaConvertida);
                    break;

            }
        } while (operador != 0);

        sc.close();
    }
}
