package ui;//package ui;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

//public class CadastrarCliente extends JPanel {
//    private JTextField txtCodigo;
//    private JTextField txtNome;
//    private JTextField txtCPF;
//    private JButton btnCadastrar;
//    private JButton btnLimpar;
//    private JButton btnVoltar;
//
//    public CadastrarCliente(JPanel mainPanel, CardLayout cardLayout) {
//        // Configuração do layout do painel
//        setLayout(new BorderLayout());
//
//        // Painel para os campos de entrada
//        JPanel painelCampos = new JPanel();
//        painelCampos.setLayout(new GridLayout(3, 2, 10, 10));
//
//        JLabel lblCodigo = new JLabel("Código:");
//        txtCodigo = new JTextField(20);
//
//        JLabel lblNome = new JLabel("Nome:");
//        txtNome = new JTextField(20);
//
//        JLabel lblCPF = new JLabel("CPF:");
//        txtCPF = new JTextField(20);
//
//        painelCampos.add(lblCodigo);
//        painelCampos.add(txtCodigo);
//        painelCampos.add(lblNome);
//        painelCampos.add(txtNome);
//        painelCampos.add(lblCPF);
//        painelCampos.add(txtCPF);
//
//        // Painel para os botões
//        JPanel painelBotoes = new JPanel();
//        btnCadastrar = new JButton("Cadastrar");
//        btnLimpar = new JButton("Limpar");
//        btnVoltar = new JButton("Voltar");
//
//        painelBotoes.add(btnCadastrar);
//        painelBotoes.add(btnLimpar);
//        painelBotoes.add(btnVoltar);
//
//        // Adicionando os painéis ao painel principal
//        add(painelCampos, BorderLayout.CENTER);
//        add(painelBotoes, BorderLayout.SOUTH);
//
//        // Action Listener para cadastrar cliente
//        btnCadastrar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                cadastrarCliente();
//            }
//        });
//
//        // Action Listener para limpar os campos
//        btnLimpar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                limparCampos();
//            }
//        });
//
//        // Action Listener para voltar à tela inicial
//        btnVoltar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                cardLayout.show(mainPanel, "painelInicial");
//            }
//        });
//    }

//    // Método para cadastrar cliente
//    private void cadastrarCliente() {
//        String codigo = txtCodigo.getText();
//        String nome = txtNome.getText();
//        String cpf = txtCPF.getText();
//
//        // Aqui você pode incluir a lógica para salvar os dados do cliente
//
//        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
//
//        // Limpar os campos após o cadastro
//        limparCampos();
//    }
//
//    // Método para limpar os campos
//    private void limparCampos() {
//        txtCodigo.setText("");
//        txtNome.setText("");
//        txtCPF.setText("");
//    }
//}