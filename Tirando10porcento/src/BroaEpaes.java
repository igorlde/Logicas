import java.util.Locale;
import java.util.Scanner;

public class BroaEpaes {
    static final double BROA = 1.50, PAES = 0.12, PORCENTAGEM = 10;
    static double quantidadeBroas, quantidadePaes, resultado;
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);

    private static void lerDados(){
        System.out.println("Digite os valores de broas vendidas.");
        quantidadeBroas = in.nextDouble();
        System.out.println("Digite os valores de broas vendidas.");
        quantidadePaes = in.nextDouble();
        in.close();
    }
    private static double somaTotalArecadado(double quantidadeBroas, double quantidadePaes){
        return (quantidadeBroas * BROA) + (quantidadePaes * PAES);
    }
    private static double somar10Porcento(double valorTotal){
        return (PORCENTAGEM / 100) * valorTotal;
    }
    private static void imprimir(double resultadoPorcentagem){
        System.out.printf("Resultado de litros: %.2f\n", resultadoPorcentagem);
    }
    public static void main(String[] args) {
        lerDados();
        double valorTotal = somaTotalArecadado(quantidadeBroas, quantidadePaes);
        resultado = somar10Porcento(valorTotal);
        imprimir(resultado);
    }
}