import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroGerado = random.nextInt(100) + 1;
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número gerado entre 1 e 100.");

        while (palpite != numeroGerado) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            
            if (palpite < numeroGerado) {
                System.out.println("O número gerado é maior. Tente novamente.");
            } else if (palpite > numeroGerado) {
                System.out.println("O número gerado é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        }
    
        scanner.close();
    }
}