import java.util.Scanner;

public class DiasAtual {
    static Scanner in = new Scanner(System.in);
    static int dia, mes;
    static final int DIAS = 30;

    private static void lerDados(){
        System.out.print("Digite a dia que voce esta hoje em numero. ");
        dia = in.nextInt();
        System.out.print("Digite mes que voce esta hoje em numero. ");
        mes = in.nextInt();
        in.close();
    }
    private static int calcularDiasPassados(int diaR, int mesR){
        return (DIAS * mes) - (DIAS - dia);
    }
    private static void imprimir(int resultado){
        System.out.print("Dias dede o inicio do ano e: "+ resultado);
    }
    public static void main(String[] args) {
        lerDados();
        int resultado = calcularDiasPassados(dia, mes);
        imprimir(resultado);
    }
}