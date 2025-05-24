import java.util.Locale;
import java.util.Scanner;

public class Area {
    static Scanner in = new Scanner(System.in).useLocale(Locale.US);
    static double base, altura;

    private static boolean validarDados(double base, double altura){
        if(base <= 0 && altura <= 0){
            System.out.println("Bem voce precisa preencher todos os campos.");
            return false;
        }
        return true;
    }
    private static boolean lerDados(){
        System.out.println("Digite a base do terreno:");
        base = in.nextDouble();
        System.out.println("Digite a altura do terreno:");
        altura = in.nextDouble();
        boolean resultadoValidacao = validarDados(base, altura);
        if(resultadoValidacao){
            return true;
        }
        return false;
    }
    private static double calcularDados(double base, double altura){
        return base * altura;
    }
    private static void imprimir(double resultado){
        System.out.printf("Resultado da area de seu terreno %.2f:", resultado);
    }

    public static void main(String[] args) {
            boolean informacoes = lerDados();
            try {
                if (informacoes != true) {
                    throw new Exception("Erro as informações estão erradas");
                }else{
                    double resultado = calcularDados(base, altura);
                    imprimir(resultado);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
}