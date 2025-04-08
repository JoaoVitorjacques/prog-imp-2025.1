import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        int maior = vetor[0];
        int posicaoMaior = 0;
        
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);
        
        scanner.close();
    }
}
