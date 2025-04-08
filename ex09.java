import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[6];
        
        for (int i = 0; i < 6; i++) {
            int valor;
            do {
                System.out.print("Digite um valor par para a posição " + (i + 1) + ": ");
                valor = scanner.nextInt();
            } while (valor % 2 != 0);
            
            vetor[i] = valor;
        }
        
        System.out.println("Valores pares na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        
        scanner.close();
    }
}
