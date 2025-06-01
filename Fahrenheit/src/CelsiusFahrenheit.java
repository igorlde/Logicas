import java.util.Locale;
import java.util.Scanner;

public class CelsiusFahrenheit {
    static float celsius, resultadoFahrenheit;
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);
    private static void lerDados(){
        System.out.println("Digite os graus Celsius");
        celsius = in.nextFloat();
    }
    private static float calcularFah(float celsius){
        resultadoFahrenheit = ((celsius * 9) / 5) + 32;
        return resultadoFahrenheit;
    }
    private static void imprimir(float resultado){
        System.out.printf("Valor convertido em Fahrenheit. %.2f",resultado);
    }
    public static void main(String[] args) {
        lerDados();
        float resultado = calcularFah(celsius);
        imprimir(resultado);
        in.close();
    }
}