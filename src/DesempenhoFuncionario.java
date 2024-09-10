import java.util.Scanner;

public class DesempenhoFuncionario {
    public static void main(String[] args) {
        
       

        Scanner ler = new Scanner(System.in);
        int funcAvaliacao;
        

        System.out.println("Avaliação do Funcionario: ");
        


        funcAvaliacao = ler.nextInt();
        if (funcAvaliacao >= 0 && funcAvaliacao <= 25 ){ 
            System.out.println("Insatisfatório");
        }else if (funcAvaliacao <= 50) {
            System.out.println("Regular");
        }else if (funcAvaliacao <= 75) {
            System.out.println("Bom");
        }else if (funcAvaliacao <= 100) {
            System.out.println("Ótimo");
        }else if (funcAvaliacao >= 101) {
            System.out.println("Numero Inserido esta Incerto");
        }




    }
}
