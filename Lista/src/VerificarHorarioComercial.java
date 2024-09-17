import java.util.Scanner;

public class VerificarHorarioComercial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora;
        int minuto;
        
        System.out.print("Digite a hora (formato 24h): ");
        hora = scanner.nextInt();
        
        System.out.print("Digite os minutos: ");
        minuto = scanner.nextInt();

        if ((hora < 0 || hora > 23) || (minuto < 0 || minuto > 59)) {
            System.out.println("Hora ou minutos inválidos. A hora deve estar entre 0 e 23 e minutos entre 0 e 59.");
        } else {
            if (hora >= 9 && hora < 18) {
                System.out.println("Está dentro do horário comercial.");
            } else if (hora == 18 && minuto == 0) {
                System.out.println("Está dentro do horário comercial.");
            } else {
                System.out.println("Está fora do horário comercial.");
            }
        }

        scanner.close();
    }
}