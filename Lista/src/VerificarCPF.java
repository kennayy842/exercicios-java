import java.util.Scanner;

public class VerificarCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o CPF ao usuário
        System.out.print("Digite o número do CPF (somente os dígitos, sem pontos e traços): ");
        String cpf = scanner.nextLine();

        // Verifica o comprimento do CPF
        if (cpf.length() == 11 && cpf.matches("\\d+")) {
            // O CPF é válido se tem exatamente 11 dígitos
            System.out.println("CPF VÁLIDO");
        } else {
            // Caso contrário, é inválido
            System.out.println("CPF INVÁLIDO");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}