public class Atividade5 {
    public static double precoFinalProduto(double percentualImposto, double precoProduto) {
        return precoProduto + (precoProduto * (percentualImposto / 100));
    }

    public static void main(String[] args) {
        double precoFinal = precoFinalProduto(10, 100);
        System.out.println(precoFinal); 
    }
}
