import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int contadorPares = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("Quantidade de valores pares: " + contadorPares);
        
        scanner.close();
    }
}
