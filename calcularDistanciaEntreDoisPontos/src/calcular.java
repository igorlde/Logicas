import java.util.Scanner;

public class calcular {
    static Scanner in = new Scanner(System.in);
    static int x1, y1, x2, y2, soma;

    private static void lerDados(){
        System.out.print("Digite o x1: ");
        x1 = in.nextInt();
        System.out.print("Digite o y1: ");
        y1 = in.nextInt();
        System.out.print("Digite o x2: ");
        x2 = in.nextInt();
        System.out.print("Digite o y2: ");
        y2 = in.nextInt();
        in.close();
    }
    private static double calcularDistancia(int x1, int y1, int x2, int y2){
        soma = (int) (Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
        return Math.sqrt(soma);
    }
    private static void imprimir(double resultado){
        System.out.printf("A distancia entre os pontos e %.2f", resultado);
    }
    public static void main(String[] args) {
        lerDados();
        double resultado = calcularDistancia(x1, y1, x2, y2);
        imprimir(resultado);
    }
}