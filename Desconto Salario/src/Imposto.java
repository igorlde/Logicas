import java.util.Locale;
import java.util.Scanner;

public class Imposto {
    static float salario, porcentagem = 1.15F, desconto = 0.08F;
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);
    private static void lerDados(){
        System.out.println("Digite o salario do funcionario.");
        salario = in.nextFloat();
    }
    private static void imprimirValorOrginal(){
        System.out.println("Valor original."+salario);
    }
    private static double calcular(float salario){
        return (salario * porcentagem) - (salario * desconto);
    }
    private static void imprimirValorFinal(double resultado){
        System.out.printf("R$ %.2f", resultado);
    }
    public static void main(String[] args) {
        lerDados();
        imprimirValorOrginal();
        double resultado = calcular(salario);
        imprimirValorFinal(resultado);
        in.close();
    }
}