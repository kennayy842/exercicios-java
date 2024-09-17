import java.util.Scanner;

public class AprovacaoEmprestimo {

    public static boolean aprovarEmprestimo(double valorEmprestimo, int numeroParcelas, double salario) {
       
        final double PERCENTUAL_MAXIMO = 0.30;

        double valorParcela = valorEmprestimo / numeroParcelas;

        double valorMaximoParcela = salario * PERCENTUAL_MAXIMO;

        return valorParcela <= valorMaximoParcela;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();
            
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            
            System.out.print("Digite o salário do solicitante: R$ ");
            double salario = scanner.nextDouble();
            
            boolean aprovado = aprovarEmprestimo(valorEmprestimo, numeroParcelas, salario);

            if (aprovado) {
                System.out.println("Empréstimo aprovado!");
            } else {
                System.out.println("Empréstimo não aprovado. O valor das parcelas ultrapassa 30% do salário.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de inserir valores numéricos corretos.");
        } finally {
            scanner.close();
        }
    }
 {
    
}
}
