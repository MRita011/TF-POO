package aplicacao;

import dados.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.*;

public class ACMERobots {
    // Leitura de dados
    private Scanner entrada = new Scanner(System.in);
    private PrintStream saidaPadrao = System.out;
    private final String nomeArquivoEntrada = "entrada.txt";
    private final String nomeArquivoSaida = "saida.txt";

    // Atributos para as listas
    private List<Robo> robos;
    private List<Cliente> clientes;
    private List<Locacao> locacoes;

    public ACMERobots() {
        redirecionaES();    // Redireciona E/S para arquivos
        robos = new ArrayList<>();
        clientes = new ArrayList<>();
        locacoes = new ArrayList<>();
        entrada = new Scanner(System.in);
    }

    public void executa() {
        cadastraCliente();
        cadastraCliente();
        cadastraLocacao();
//        alteraSituacaoLocacao();
//        cargaDadosIniciais();
//        salvarDados();
//        carregarDados();
//        finalizarSistema();
    }

    public void cadastraRobo() {
        try {
            System.out.print("Digite o tipo de robô (1-Industrial, 2-Doméstico, 3-Agrícola): ");
            int tipo = entrada.nextInt();
            System.out.print("Digite o ID do robô: ");
            int id = entrada.nextInt();
            entrada.nextLine();

            for (Robo robo : robos) {
                if (robo.getId() == id) {
                    System.out.println("Erro: Já existe um robô com este ID.");
                    return;
                }
            }

            System.out.print("Digite o modelo do robô: ");
            String modelo = entrada.nextLine();
            System.out.print("Digite o valor diário do robô: ");
            double valorDiario = entrada.nextDouble();
            entrada.nextLine();

            Robo novoRobo = null;

            switch (tipo) {
                case 1:
                    System.out.print("Digite o setor (industrial) do robô: ");
                    String setor = entrada.nextLine();
                    novoRobo = new Industrial(id, modelo, valorDiario, setor);
                    break;

                case 2:
                    System.out.print("Digite o nível do robô (1, 2 ou 3): ");
                    int nivel = entrada.nextInt();

                    entrada.nextLine();
                    novoRobo = new Domestico(id, modelo, valorDiario, nivel);
                    break;

                case 3:
                    System.out.print("Digite o uso do robô: ");
                    String uso = entrada.nextLine();

                    System.out.print("Digite a área do robô: ");
                    double area = entrada.nextDouble();

                    entrada.nextLine();
                    novoRobo = new Agricola(id, modelo, valorDiario, uso, area);
                    break;

                default:
                    System.out.println("Tipo de robô inválido!");
                    return;
            }
            robos.add(novoRobo);
            System.out.println("Robô cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor digitado é inválido.");
            entrada.nextLine(); // limpar o buffer do Scanner
        } catch (NoSuchElementException e) {
            System.out.println("Erro: Elemento não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    public void listarRobos() {
        try {
            if (robos.isEmpty())
                System.out.println("Nenhum robô cadastrado.");
            else {
                Collections.sort(robos, Comparator.comparingInt(Robo::getId));
                System.out.println("Lista de robôs:");
                for (Robo robo : robos)
                    System.out.println(robo);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar robôs: " + e.getMessage());
        }
    }

    public void cadastraCliente() {
        try {
            System.out.println("Cadastro de novo cliente:");
            System.out.print("Código: ");
            int codigo = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            // Verifica se o código já existe
            for (Cliente cliente : clientes) {
                if (cliente.getCodigo() == codigo) {
                    System.out.println("Erro: Cliente com código " + codigo + " já existe.");
                    return;
                }
            }

            System.out.println("Tipo de cliente (E - Empresarial / I - Individual): ");
            String tipoCliente = entrada.nextLine().toUpperCase();

            Cliente novoCliente = null;
            switch (tipoCliente) {
                case "E":
                    System.out.print("Ano de fundação: ");
                    int ano = entrada.nextInt();
                    novoCliente = new Empresarial(codigo, nome, ano);
                    break;

                case "I":
                    System.out.print("CPF: ");
                    String cpf = entrada.next();
                    novoCliente = new Individual(codigo, nome, cpf);
                    break;

                default:
                    System.out.println("Tipo de cliente inválido.");
                    return;
            }

            clientes.add(novoCliente);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor digitado é inválido.");
            entrada.nextLine(); // limpar o buffer do Scanner
        } catch (NoSuchElementException e) {
            System.out.println("Erro: Elemento não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    public void cadastraLocacao() {
        try {
            // Verifica se não há clientes cadastrados
            if (clientes.isEmpty()) {
                System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro.");
                return;
            }

            // Verifica se não há robôs cadastrados
            if (robos.isEmpty()) {
                System.out.println("Nenhum robô cadastrado. Cadastre um robô primeiro.");
                return;
            }

            // Mostrar os clientes cadastrados
            System.out.println("Clientes cadastrados:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getCodigo() + " - " + cliente.getNome());
            }

            // Selecionar um cliente
            System.out.print("Digite o código do cliente para o qual deseja cadastrar a locação: ");
            int codigoCliente = entrada.nextInt();
            entrada.nextLine();

            Cliente clienteSelecionado = null;
            for (Cliente cliente : clientes) {
                if (cliente.getCodigo() == codigoCliente) {
                    clienteSelecionado = cliente;
                    break;
                }
            }

            if (clienteSelecionado == null) {
                System.out.println("Cliente não encontrado.");
                return;
            }

            // Solicitar e cadastrar os dados da nova locação
            System.out.print("Digite o número da locação: ");
            int numeroLocacao = entrada.nextInt();
            entrada.nextLine();

            for (Locacao locacao : locacoes) {
                if (locacao.getNumero() == numeroLocacao) {
                    System.out.println("Erro: Já existe uma locação com este número.");
                    return;
                }
            }

            System.out.print("Digite a data de início da locação (dd/mm/aaaa): ");
            String dataInicioStr = entrada.nextLine();

            System.out.print("Digite a data de fim da locação (dd/mm/aaaa): ");
            String dataFimStr = entrada.nextLine();

            // Lista de robôs disponíveis
            listarRobos();

            System.out.print("Digite os IDs dos robôs que serão locados (separados por vírgula): ");
            String[] idsRobosStr = entrada.nextLine().split(",");
            List<Robo> robosSelecionados = new ArrayList<>();

            for (String idRoboStr : idsRobosStr) {
                int idRobo = Integer.parseInt(idRoboStr.trim());
                boolean encontrado = false;

                for (Robo robo : robos) {
                    if (robo.getId() == idRobo) {
                        robosSelecionados.add(robo);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado)
                    System.out.println("Robô com ID " + idRobo + " não encontrado.");
            }

            // Criar a nova locação e adicioná-la à lista de locações
            Locacao novaLocacao = new Locacao(numeroLocacao, Status.CADASTRADA, null, null, clienteSelecionado, robosSelecionados);
            locacoes.add(novaLocacao);

            System.out.println("Locação cadastrada com sucesso e colocada na fila de locações pendentes.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor digitado é inválido.");
            entrada.nextLine(); // limpar o buffer do Scanner
        } catch (NoSuchElementException e) {
            System.out.println("Erro: Elemento não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    private void redirecionaES() {
        try {
            BufferedReader streamEntrada = new BufferedReader(new FileReader(nomeArquivoEntrada));
            entrada = new Scanner(streamEntrada);
            PrintStream streamSaida = new PrintStream(new File(nomeArquivoSaida), Charset.forName("UTF-8"));
            System.setOut(streamSaida);
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);
        entrada.useLocale(Locale.ENGLISH);
    }

    private void restauraES() {
        System.setOut(saidaPadrao);
        entrada = new Scanner(System.in);
    }
}
