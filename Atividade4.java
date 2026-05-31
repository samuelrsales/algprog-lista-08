public class Atividade4 {

    public static Character positivoNegativo(int num) {
        if(num > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
    public static void main(String[] args) {
        char resultado = positivoNegativo(-5);
        System.out.println(resultado);
    }
}
