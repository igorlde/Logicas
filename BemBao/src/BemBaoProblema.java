import java.util.Scanner;

public class BemBaoProblema {
    static Scanner in = new Scanner(System.in);
    static final double BEMBAO = 12.00;
    static int pesoPrato;

    private static void lerDados(){
        System.out.print("Digite quantos quilos tem seu prato: ");
        pesoPrato = in.nextInt();
        in.close();
    }
    private static double calcularCusto(int peso){
        return BEMBAO * peso;
    }
    private static void imprimirResultado(double resultado){
        System.out.printf("Valor a ser pago e: %.2f", resultado);
    }
    public static void main(String[] args) {
        lerDados();
        double resultado = calcularCusto(pesoPrato);
        imprimirResultado(resultado);
    }
}