import java.util.Scanner;

public class VerificarVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia;
        double tempo;
        double velocidadeMedia;

        System.out.println("Digite a distância percorrida (em metros): ");
        distancia = scanner.nextDouble();

        System.out.println("Digite o tempo gasto (em segundos): ");
        tempo = scanner.nextDouble();

        if (tempo <= 0) {
            System.out.println("O tempo deve ser maior que zero.");
        } else {
            velocidadeMedia = distancia / tempo;

            if (velocidadeMedia < 5) {
                System.out.println("Movimento lento.");
            } else if (velocidadeMedia <= 15) {
                System.out.println("Movimento Moderado.");
            } else {
                System.out.println("Movimento Rápido.");
            }
        }


        scanner.close();
    }
}