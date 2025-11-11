import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        
        // Solicita o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        
        // Solicita o ano atual
        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();
        
        // Calcula a idade
        int idade = anoAtual - anoNascimento;
        
        // Exibe o resultado
        System.out.println("Você tem " + idade + " anos.");
        
        // Fecha o Scanner
        entrada.close();
    }
}
