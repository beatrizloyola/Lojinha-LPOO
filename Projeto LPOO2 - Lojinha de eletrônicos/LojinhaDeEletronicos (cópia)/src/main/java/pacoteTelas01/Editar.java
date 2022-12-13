package pacoteTelas01;

import pacoteClasses.Produto;
import pacoteClasses.OperacoesProduto;
import pacoteClasses.InterOperacoesProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Editar extends javax.swing.JFrame {

//    Variáveis
    String nome, marca, modelo, precoStr, quantidadeStr, codigoStr, descricao, categoria = null;
    int codigo, quantidade;
    double preco;

    String nomeRe = "nome", marcaRe = "marca", modeloRe = "modelo", precoStrRe = "preco", quantidadeStrRe = "quantidade", codigoStrRe = "codigo", descricaoRe = "descricao", categoriaRe = "categoria";

    public Editar() {
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
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

        jbtCadastrar.setText("Aplicar");
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });

        jButton1.setText("Ajuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addComponent(labDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labNome)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtCadastrar)))
                .addContainerGap(23, Short.MAX_VALUE))
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

        if (categoria.equals("") || nome.equals("") || marca.equals("") || modelo.equals("") || precoStr.equals("") || quantidadeStr.equals("")
                || codigoStr.equals("") || descricao.equals("")) {
            if (categoria.equals("") || nome.equals("") || marca.equals("") || modelo.equals("") || precoStr.equals("") || quantidadeStr.equals("")
                    || codigoStr.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Atenção!");
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos para poder continuar.");
            } else if (descricao.equals("")) {
                int op = JOptionPane.showConfirmDialog(rootPane, "Quer mesmo cadastrar o seu produto sem uma descrição?");
                if (op == 0) {
                    descricao = "Produto sem descrição";
                    jtfDescricao.setText(descricao);
                } else if (op == 1) {
                    descricao = JOptionPane.showInputDialog(null, "Informe a descrição do seu produto!");
                    jtfDescricao.setText(descricao);
                    JOptionPane.showMessageDialog(rootPane, "Descrição adicionada!");
                } else {

                }
            }

        } else {
            preco = Integer.parseInt(precoStr);
            quantidade = Integer.parseInt(quantidadeStr);
            codigo = Integer.parseInt(codigoStr);

            InterOperacoesProduto iop = new OperacoesProduto();
            Connection con = null;
            try {
                con = DriverManager.getConnection("jdbcmysql://localhost:3306/LojinhaDeEletronicos", "root", "root");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            Produto p = new Produto(nome, modelo, marca, descricao, codigo, preco, quantidade, categoria);
            iop.editar(con, p);

        }


    }//GEN-LAST:event_jbtCadastrarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained


    }//GEN-LAST:event_formFocusGained

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeiconified

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
    }//GEN-LAST:event_formWindowIconified

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String codigoRecebidoStr;
        codigoRecebidoStr = JOptionPane.showInputDialog("Informe o código do produto que você deseja modificar os dados.");
        int codigoRecebido;

        while (codigoRecebidoStr.equals("") || codigoRecebidoStr == null) {
            JOptionPane.showMessageDialog(rootPane, "O código não foi informado ainda");
            codigoRecebidoStr = JOptionPane.showInputDialog("Informe o código do produto que você deseja modificar os dados.");
        }

        codigoRecebido = Integer.parseInt(codigoRecebidoStr);

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbcmysql://localhost:3306/LojinhaDeEletronicos", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        InterOperacoesProduto iop = new OperacoesProduto();
        List lRecebida = iop.retornarProduto(con, codigoRecebido);

        Iterator iter = lRecebida.iterator();

        int cont = 0;
        while (iter.hasNext()) {
            String atual = (String) iter.next();

            switch (cont) {
                case 0:
                    nomeRe = atual;
                    break;
                case 1:
                    marcaRe = atual;
                    break;
                case 2:
                    modeloRe = atual;
                    break;
                case 3:
                    descricaoRe = atual;
                    break;
                case 4:
                    precoStrRe = atual;
                    break;
                case 5:
                    quantidadeStrRe = atual;
                    break;
                case 6:
                    codigoStrRe = atual;
                    break;
                case 7:
                    categoriaRe = atual;
                    break;
                default:
                    break;
            }

            cont++;
        }

        jtfCategoria.setText(categoriaRe);
        jtfCodigo.setText(codigoRecebidoStr);
        jtfDescricao.setText(descricaoRe);
        jtfQuantidade.setText(quantidadeStrRe);
        jtfNome.setText(nomeRe);
        jtfMarca.setText(marcaRe);
        jtfModelo.setText(modeloRe);
        jtfPreco.setText(precoStrRe);

        jtfCodigo.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Os campos foram carregados com as informações do produto encontrado a partir do código que você informou");
        JOptionPane.showMessageDialog(rootPane, "Basta fazer as alteraçõs que desejar e em seguida clicar no botão aplicar para finalizar a edição");
        JOptionPane.showMessageDialog(rootPane, "Nenhuma modificação será feita caso você clique no botão de aplicar sem fazer nenhuma alteração nas informações disponiveis nos campos");

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
