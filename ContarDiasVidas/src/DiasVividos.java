import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DiasVividos {
    static final int DIAS = 365;
    static int resultadoIdade;
    static Scanner in = new Scanner(System.in);
    private static int lerDados() {
        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();
        return idade;
    }
    private static int calcularDiasVividos(int idade){
        return idade * DIAS;
    }
    private static void imprimir(int resultado){
        System.out.println("Dias que ja viveu. "+resultado);
    }
    public static void main(String[] args) {
        resultadoIdade = lerDados();
        int resultadoDias = calcularDiasVividos(resultadoIdade);
        imprimir(resultadoDias);
        }
    }
