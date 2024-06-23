import aplicacao.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ACMERobots acme = new ACMERobots();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    acme.cadastraCliente();
                    break;
                case 2:
                    acme.cadastraRobo();
                    break;
                case 3:
                    acme.cadastraLocacao();
                    break;
                case 4:
                    // Implementar processar locações
                    System.out.println("Opção em desenvolvimento.");
                    break;
                case 5:
                    // Implementar mostrar relatório geral
                    System.out.println("Opção em desenvolvimento.");
                    break;
                case 6:
                    // Implementar consultar todas as locações
                    System.out.println("Opção em desenvolvimento.");
                    break;
                case 7:
                    // Implementar alterar situação de locação
                    System.out.println("Opção em desenvolvimento.");
                    break;
                case 8:
                    // Implementar realizar carga de dados iniciais
                    System.out.println("Opção em desenvolvimento.");
                    break;
                case 9:
                    // Implementar salvar dados
                    System.out.println("Opção em desenvolvimento.");
                    break;
                case 10:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 10);

        System.out.println("Sistema ACMERobots encerrado.");
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n### ACMERobots - Sistema de Gerenciamento ###");
        System.out.println("1. Cadastrar novo cliente");
        System.out.println("2. Cadastrar novo robô");
        System.out.println("3. Cadastrar nova locação");
        System.out.println("4. Processar locações");
        System.out.println("5. Mostrar relatório geral");
        System.out.println("6. Consultar todas as locações");
        System.out.println("7. Alterar situação de locação");
        System.out.println("8. Realizar carga de dados iniciais");
        System.out.println("9. Salvar dados");
        System.out.println("10. Finalizar sistema");
    }
}
