import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBase;
        int avaliacaoDesempenho;
        double salarioFinal;

        System.out.print("Digite o salário base do funcionário: R$ ");
        salarioBase = scanner.nextDouble();

        System.out.print("Digite a pontuação de desempenho (0 a 100): ");
        avaliacaoDesempenho = scanner.nextInt();

        if (avaliacaoDesempenho >= 0 && avaliacaoDesempenho <= 25) {
            salarioFinal = salarioBase;
            System.out.println("Desempenho Insatisfatório. Sem bônus.");
        } else if (avaliacaoDesempenho <= 50) {
            System.out.println("Desempenho Regular. Bônus de 5%.");
        } else if (avaliacaoDesempenho <= 75) {
            salarioFinal = salarioBase * 1.10;
            System.out.println("Desempenho Bom. Bônus de 10%.");
        } else if (avaliacaoDesempenho <= 100) {
            salarioFinal = salarioBase * 1.20;
            System.out.println("Desempenho Ótimo. Bônus de 20%.");
        } else {
            salarioFinal = salarioBase;
            System.out.println("Número Digitado Incorreto. A pontuação deve estar entre 0 e 100. Sem bônus.");
        }

        scanner.close();
    }
}