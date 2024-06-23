package ui;// Imports
//package ui;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//public class ACMERobotsGUI extends JFrame {
//    private CardLayout cardLayout;
//    private JPanel mainPanel;

//    public ACMERobotsGUI() {
//        // Configuração do JFrame
//        setTitle("Bem-vindo(a) à ACMERobots!!");
//        setSize(600, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Inicialização do CardLayout e do painel principal
//        cardLayout = new CardLayout();
//        mainPanel = new JPanel(cardLayout);
//
//        // Configuração dos botões e painéis
//        configurarPainelInicial();
//        configurarPainelCadastrarCliente();
//
//        // Adicionando o painel principal ao JFrame
//        add(mainPanel);
//
//        setVisible(true);
//    }
//
//    // Método para configurar o painel inicial
//    private void configurarPainelInicial() {
//        JPanel painelInicial = new JPanel();
//        painelInicial.setLayout(new BorderLayout());
//
//        JLabel titleLabel = new JLabel("Selecione uma Opção", JLabel.CENTER);
//        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//        painelInicial.add(titleLabel, BorderLayout.NORTH);
//
//        JPanel botoesPainel = new JPanel();
//        botoesPainel.setLayout(new GridLayout(5, 2, 10, 10));

//        // Criando botões
//        JButton btnCadastraRobo = new JButton("Cadastrar Robô");
//        JButton btnCadastraCliente = new JButton("Cadastrar Cliente");
//        JButton btnCadastraLocacao = new JButton("Registrar Locação");
//        JButton btnProcessarLocacao = new JButton("Processar Locações");
//        JButton btnRelatorioGeral = new JButton("Relatório Geral");
//        JButton btnConsultaLocacao = new JButton("Consultar Locações");
//        JButton btnAlteraSituacao = new JButton("Alterar Situação da Locação");
//        JButton btnCargaDados = new JButton("Carga de Dados");
//        JButton btnSalvarDados = new JButton("Salvar Dados");
//        JButton btnCarregarDados = new JButton("Carregar Dados");
//
//        // Adicionando action listeners para os botões
//        btnCadastraRobo.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("CadastrarRobos");
//            }
//        });
//
//        btnCadastraCliente.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("CadastrarClientes");
//            }
//        });
//
//        btnCadastraLocacao.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("CadastrarLocacao");
//            }
//        });
//
//        btnProcessarLocacao.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("ProcessarLocacao");
//            }
//        });
//
//        btnRelatorioGeral.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("RelatorioGeral");
//            }
//        });

//        btnConsultaLocacao.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("ConsultarLocacao");
//            }
//        });
//
//        btnAlteraSituacao.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("AlterarSituacao");
//            }
//        });
//
//        btnCargaDados.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("CargaDados");
//            }
//        });
//
//        btnSalvarDados.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("SalvarDados");
//            }
//        });
//
//        btnCarregarDados.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("CarregarDados");
//            }
//        });

//        // Adicionando botões ao painel de botões
//        botoesPainel.add(btnCadastraRobo);
//        botoesPainel.add(btnCadastraCliente);
//        botoesPainel.add(btnCadastraLocacao);
//        botoesPainel.add(btnProcessarLocacao);
//        botoesPainel.add(btnRelatorioGeral);
//        botoesPainel.add(btnConsultaLocacao);
//        botoesPainel.add(btnAlteraSituacao);
//        botoesPainel.add(btnCargaDados);
//        botoesPainel.add(btnSalvarDados);
//        botoesPainel.add(btnCarregarDados);
//
//        painelInicial.add(botoesPainel, BorderLayout.CENTER);
//
//        // Adicionando o painel inicial ao mainPanel com nome identificador
//        mainPanel.add(painelInicial, "painelInicial");
//    }

//    // Método para configurar o painel de cadastro de cliente
//    private void configurarPainelCadastrarCliente() {
//        JPanel painelCadastrarCliente = new JPanel(new GridLayout(4, 2, 10, 10));
//
//        JLabel lblCodigo = new JLabel("Código:");
//        JTextField txtCodigo = new JTextField();
//
//        JLabel lblNome = new JLabel("Nome:");
//        JTextField txtNome = new JTextField();
//
//        JLabel lblCPF = new JLabel("CPF:");
//        JTextField txtCPF = new JTextField();
//
//        JButton btnCadastrar = new JButton("Cadastrar");
//        JButton btnLimpar = new JButton("Limpar");
//        JButton btnVoltar = new JButton("Voltar");
//
//        btnVoltar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                mudaPainel("painelInicial");
//            }
//        });

//        painelCadastrarCliente.add(lblCodigo);
//        painelCadastrarCliente.add(txtCodigo);
//        painelCadastrarCliente.add(lblNome);
//        painelCadastrarCliente.add(txtNome);
//        painelCadastrarCliente.add(lblCPF);
//        painelCadastrarCliente.add(txtCPF);
//        painelCadastrarCliente.add(btnCadastrar);
//        painelCadastrarCliente.add(btnLimpar);
//        painelCadastrarCliente.add(btnVoltar);
//
//        // Adicionando o painel de cadastro de cliente ao mainPanel com nome identificador
//        mainPanel.add(painelCadastrarCliente, "CadastrarClientes");
//    }
//
//    // Método para trocar o painel pelo nome
//    public void mudaPainel(String nomePainel) {
//        cardLayout.show(mainPanel, nomePainel);
//    }
//}