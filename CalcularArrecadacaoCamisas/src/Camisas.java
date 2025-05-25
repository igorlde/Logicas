import java.util.Scanner;

public class Camisas {
    static Scanner in = new Scanner(System.in);
    static final int CAMISAPEQUENA = 10, CAMISAMEDIA = 12, CAMISAGRANDE = 15;
    static int quantidadePequena, quantidadeMedia, quantidadeGrande;

    private static void lerDados(){
        System.out.print("Digite a quantidade de camisas pequenas");
        quantidadePequena = in.nextInt();
        System.out.print("Digite a quantidade de camisas medias");
        quantidadeMedia = in.nextInt();
        System.out.print("Digite a quantidade de camisas medias");
        quantidadeGrande = in.nextInt();
        in.close();
    }
    private static double calcularTotalArrecadado(int quantidadePequena, int quantidadeMedia, int quantidadeGrande){
        return (quantidadePequena * CAMISAPEQUENA) + (quantidadeMedia * CAMISAMEDIA) + (quantidadeGrande * CAMISAGRANDE);
    }
    private static void imprimir(double resultado){
        System.out.printf("Valor arrecadado e: %.2fR$",resultado);
    }
    public static void main(String[] args) {
        lerDados();
        double resultado = calcularTotalArrecadado(quantidadePequena, quantidadeMedia, quantidadeGrande);
        imprimir(resultado);
    }
}