import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] reais = new double[10];
        double[] quadrados = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            reais[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < 10; i++) {
            quadrados[i] = reais[i] * reais[i];
        }
        
        System.out.println("Valores e seus quadrados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor: " + reais[i] + " -> Quadrado: " + quadrados[i]);
        }
        
        scanner.close();
    }
}
