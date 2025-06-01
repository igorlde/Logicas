import java.util.Locale;
import java.util.Scanner;

public class Calculos {
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);
    static float numero;

    private static void lerDados(){
        System.out.println("Digite numero de ate 3 digitos.");
        numero = in.nextFloat();
    }
    private static float calcularCentena(float numero){
        return numero / 100;
    }
    private static float calularDezena(float numero){
        return (numero % 10) / 10;
    }
    private static float calcularUnidade(float numero){
        return numero % 10;
    }
    private static void unirTudo(){
        float resultado;
        lerDados();
        resultado = calcularCentena(numero);
        System.out.printf("Valor em centena %.2f", resultado);
        resultado = calularDezena(numero);
        System.out.printf("\nValor em dezena %.2f", resultado);
        resultado = calcularUnidade(numero);
        System.out.printf("\nValor em unidade %.2f", resultado);
    }

    public static void main(String[] args) {
        unirTudo();
        in.close();
    }
}