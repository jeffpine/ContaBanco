import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //CONHECER e importar a clasee Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        System.out.println("Digite o numero da agencia");
        scanner.nextLine();
        System.out.println("Digite o numero da conta");
        scanner.nextLine();
        System.out.println("Digite o nome do titular da conta");
        scanner.nextLine();
        System.out.println("Digite o saldo da conta");
        scanner.nextLine();

        //Obter pela scanner os valores digitados no terminal
        scanner.close();

        //Exibir a mensagen conta criada
        System.out.println("Conta criada com sucesso");




    }
}