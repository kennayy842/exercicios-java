import java.util.Scanner;

public class AvaliacaoFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int avaliacaoFunc;

        System.out.println("Avaliação do Funcionário");
        System.out.print("Digite a pontuação de 0 a 100: ");
        avaliacaoFunc = ler.nextInt();

        if (avaliacaoFunc >= 0 && avaliacaoFunc <= 25) {
            System.out.println("Desempenho Insatisfatório");
        } else if (avaliacaoFunc <= 50) {
            System.out.println("Desempenho Regular");
        } else if (avaliacaoFunc <= 75) {
            System.out.println("Desempenho Bom");
        } else if (avaliacaoFunc <= 100) {
            System.out.println("Desempenho Ótimo");
        } else {
            System.out.println("Número Digitado Incorreto. A pontuação deve estar entre 0 e 100.");
        }

        ler.close();
    }
}