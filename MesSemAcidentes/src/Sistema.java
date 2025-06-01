import java.util.Scanner;

public class Sistema {
    static int dias, mes;
    static final int DIAS_MES = 30;
    static Scanner in = new Scanner(System.in);

    private static void lerDados(){
        System.out.println("Digite a quantidade de meses sem acidentes:");
        mes = in.nextInt();
        System.out.println("Digite a quantidade de dias adicionais:");
        dias = in.nextInt();
    }

    private static int calcularDiasSemAcidentes(int dias, int mes){
        return (mes * DIAS_MES) + dias;
    }

    private static void imprimir(int resultado){
        System.out.printf("Total de dias sem acidentes: %d dias\n", resultado);
    }

    public static void main(String[] args) {
        lerDados();
        int resultado = calcularDiasSemAcidentes(dias, mes);
        imprimir(resultado);
        in.close();
    }
}
