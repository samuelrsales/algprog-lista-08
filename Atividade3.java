public class Atividade3 {

    public static String soma(int num1, int num2, int num3){
        return "A soma dos números fornecidos é: " + (num1 + num2 + num3);
    }
    public static void main(String[] args) {
        String somaTotal = soma(5,3,2);

        System.err.println(somaTotal);
    }
}
