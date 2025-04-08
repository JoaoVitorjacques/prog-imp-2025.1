import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] valores = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }
        
        System.out.println("Valores digitados:");
        for (int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
        
        scanner.close();
    }
}
