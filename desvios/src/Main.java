//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static double media(double[]lista){
        double num = 0;
       for(double valor : lista){
                num += valor;
        }
        return num / lista.length;

    }

    private static double[] desvio(double[]lista){
        double valor = media(lista);
        int i = 0;
        double[]novaLista = new double[lista.length];
        while(i < lista.length){
                novaLista[i] = lista[i] - valor;
            i++;
        }
        return  novaLista;
    }
    private static double mediaDesvio(double[]lista){
        double soma = 0.0;
        for (double num : lista) {
            soma += num;
        }
        return soma / lista.length;
    }
    private static double desvioMediaPadrao(double[]lista){
        double somaQuadrados = 0.0;
        for(double num : lista){
            somaQuadrados = Math.pow(num, 2);
        }
        double variancia = somaQuadrados / lista.length;
        return Math.sqrt(variancia);
    }

    public static void main(String[] args) {
        double[] lista = {10, 20, 23, 40};
        double[] desvios = desvio(lista);

        System.out.println("Desvios:");
        for (double d : desvios) {
            System.out.print(d + " ");
        }

        double mediaDesvios = mediaDesvio(desvios);
        System.out.println("\nMédia dos desvios: " + mediaDesvios);

        double dp = desvioMediaPadrao(desvios);
        System.out.println("\nDesvio Padrão: " + dp);
    }
}