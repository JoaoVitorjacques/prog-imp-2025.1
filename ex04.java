import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("Digite a posição X: ");
        int X = scanner.nextInt();
        System.out.print("Digite a posição Y: ");
        int Y = scanner.nextInt();
        
        int soma = vetor[X] + vetor[Y];
        System.out.println("Soma dos valores nas posições X e Y: " + soma);
        
        scanner.close();
    }
}
