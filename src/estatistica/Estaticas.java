package estatistica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Estaticas {
static Scanner in = new Scanner(System.in);
    public static void sort(int[]list){
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
    public static double mediana(int[] list) {
        int n = list.length;
        if (n % 2 == 1) {
            return list[n / 2];
        } else {
            return (list[n / 2 - 1] + list[n / 2]) / 2.0;
        }
    }

    public static double media(int[]list){
        double numbers = 0.0, i = 0;
        while(i < list.length){
            numbers += list[(int) i];
            i++;
        }
        return numbers / list.length;
    }

    public static int moda(int[]list){
        if(list.length == 0 || list == null){
            throw new RuntimeException("Erro sua lista esta vazia");
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int modeValue = list[0];
        int maxCount = frequencyMap.get(modeValue);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNum = entry.getKey();
            int currentCount = entry.getValue();
            if (currentCount > maxCount || (currentCount == maxCount && currentNum < modeValue)) {
                modeValue = currentNum;
                maxCount = currentCount;
            }
        }
        return modeValue;
    }

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de numeros que vão ser digitados");
        int n = in.nextInt();
        int[] list = new int[n];
        for(int i = 0;i < list.length;i++){
            System.out.println("Digite o valor do numero: "+(i+1));
            list[i] = in.nextInt();
        }
        sort(list);
        int modaResult = moda(list);
        double mediaResult = media(list);
        double medianaResult = mediana(list);
        System.out.println("Moda = " + modaResult + "\nMédia = " + mediaResult + "\nMediana = " + medianaResult);
        in.close();
    }
}
