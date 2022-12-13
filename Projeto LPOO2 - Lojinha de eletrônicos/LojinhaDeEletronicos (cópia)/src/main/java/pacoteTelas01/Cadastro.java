package pacoteTelas01;

import pacoteClasses.Produto;
import pacoteClasses.OperacoesProduto;
import pacoteClasses.InterOperacoesProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

//    Variáveis
    String nome, marca, modelo, precoStr, quantidadeStr, codigoStr, descricao, categoria;
    int codigo, quantidade;
    double preco;

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNome = new javax.swing.JLabel();
        labModelo = new javax.swing.JLabel();
        labMarca = new javax.swing.JLabel();
        labDescricao = new javax.swing.JLabel();
        labQuantidade = new javax.swing.JLabel();
        labCategoria = new javax.swing.JLabel();
        labPreco = new javax.swing.JLabel();
        labCodigo = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jtfCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfDescricao = new javax.swing.JTextArea();
        jtfCodigo = new javax.swing.JTextField();
        jtfPreco = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jbtCadastrar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labNome.setText("Nome:");

        labModelo.setText("Modelo:");

        labMarca.setText("Marca:");

        labDescricao.setText("Descrição:");

        labQuantidade.setText("Quantidade:");

        labCategoria.setText("Categoria:");

        labPreco.setText("Preço:");

        labCodigo.setText("Código:");

        jtfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMarcaActionPerformed(evt);
            }
        });

        jtfDescricao.setColumns(20);
        jtfDescricao.setRows(5);
        jScrollPane1.setViewportView(jtfDescricao);

        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });

        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labNome)
                                .addGap(226, 226, 226)
                                .addComponent(labCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labModelo)
                                .addGap(217, 217, 217)
                                .addComponent(labPreco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labMarca)
                                .addGap(224, 224, 224)
                                .addComponent(labQuantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labDescricao))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNome)
                    .addComponent(labCodigo))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labModelo)
                    .addComponent(labPreco))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labMarca)
                    .addComponent(labQuantidade))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(labCategoria)
                .addGap(1, 1, 1)
                .addComponent(jtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(labDescricao)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAjuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtCadastrar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMarcaActionPerformed

    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed

        nome = jtfNome.getText();
        marca = jtfMarca.getText();
        modelo = jtfModelo.getText();
        precoStr = jtfPreco.getText();
        quantidadeStr = jtfQuantidade.getText();
        codigoStr = jtfCodigo.getText();
        descricao = jtfDescricao.getText();
        categoria = jtfCategoria.getText();

        if (nome.equals("") || marca.equals("") || modelo.equals("") || categoria.equals("") || precoStr.equals("") || quantidadeStr.equals("") || codigoStr.equals("") || descricao.equals("")) {

            if (descricao.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Seu campo de descrição está em branco");
                JOptionPane.showMessageDialog(rootPane, "O campo de descrição não é um campo obrigatório");
                int respostaAddDescricao = JOptionPane.showConfirmDialog(null, "Quer adicionar uma descrição para o seu produto?");

                switch (respostaAddDescricao) {
                    case 0:
                        descricao = JOptionPane.showInputDialog(null, "Digite uma descrição para o seu produto");
                        break;
                    case 1:
                        descricao = "Produto sem descrição.";
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos obrigatorios para continuar");
            }

        }

        preco = Integer.parseInt(precoStr);
        quantidade = Integer.parseInt(quantidadeStr);
        codigo = Integer.parseInt(codigoStr);

        InterOperacoesProduto iop = new OperacoesProduto();
        Connection con = null;

//        verificar se o código em questão já não pertence a algum produto que tenha sido cadastrado
        if (iop.verificarExistencia(con, codigo)) {
            JOptionPane.showMessageDialog(rootPane, "Já existe um produto com esse código cadastrado no nosso sitema!");
            JOptionPane.showMessageDialog(rootPane, "Por favor tente novamente com outro código.");
        } else {

            try {
                con = DriverManager.getConnection("jdbcmysql://localhost:3306/LojinhaDeEletronicos", "root", "root");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            Produto p = new Produto(nome, modelo, marca, descricao, codigo, preco, quantidade, categoria);
            iop.cadastrar(con, p);
            JOptionPane.showConfirmDialog(rootPane, "Produto cadastrado!");
        }


    }//GEN-LAST:event_jbtCadastrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Você está na tela de cadastro de produtos, basta completar os campos e clicar no botão de de cadastrar para completar a operação.");
        JOptionPane.showMessageDialog(rootPane, "O campo descrição não é obrigatorio, caso ele seja deixado em branco uma menssagem será exibida para confirmar a operação.");
        JOptionPane.showMessageDialog(rootPane, "O botão voltar leva você para a tela anterior a essa, o menu de operações com produto");

    }//GEN-LAST:event_btnAjudaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCadastrar;
    private javax.swing.JTextField jtfCategoria;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextArea jtfDescricao;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JLabel labCategoria;
    private javax.swing.JLabel labCodigo;
    private javax.swing.JLabel labDescricao;
    private javax.swing.JLabel labMarca;
    private javax.swing.JLabel labModelo;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labPreco;
    private javax.swing.JLabel labQuantidade;
    // End of variables declaration//GEN-END:variables
}
