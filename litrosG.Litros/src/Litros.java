import java.util.Locale;
import java.util.Scanner;
public class Litros {
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);
    static final double PRECOGASOLINA = 6.48;

    private static double lerDados(){
        double valorReais;
        System.out.println("Digite o valor em reais que quer abastecer.");
        valorReais = in.nextDouble();
        return valorReais;
    }
    private static double calcularLitros(double valorReais){
        return valorReais / PRECOGASOLINA;
    }
    private static void imprimir(double resultado){
        System.out.printf("Resultado de litros: %.2f\n", resultado);
    }
    public static void main(String[] args) {
       double valor = lerDados();
        double calculo = calcularLitros(valor);
        imprimir(calculo);
    }
}