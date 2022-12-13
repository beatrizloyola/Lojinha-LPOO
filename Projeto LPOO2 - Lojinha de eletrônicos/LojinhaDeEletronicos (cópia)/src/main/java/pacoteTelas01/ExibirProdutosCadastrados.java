package pacoteTelas01;

import pacoteClasses.InterOperacoesProduto;
import pacoteClasses.OperacoesProduto;
import pacoteClasses.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ExibirProdutosCadastrados extends javax.swing.JFrame {

    public ExibirProdutosCadastrados() {
        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbProdutos = new javax.swing.JComboBox<>();
        btnExibir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exibir produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProdutosActionPerformed(evt);
            }
        });

        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jlNome.setText("Nome do produto");

        jLabel3.setText("Marca:");

        jlMarca.setText("Marca do produto");

        jLabel5.setText("Modelo:");

        jlModelo.setText("Modelo do produto");

        jLabel7.setText("Categoria:");

        jlCategoria.setText("Categoria do produto");

        jLabel9.setText("Preço:");

        jlPreco.setText("Preço do produto");

        jLabel11.setText("Quantidade em estoque:");

        jlQuantidade.setText("Quantidade do produto");

        jLabel13.setText("Código:");

        jlCodigo.setText("Código do produto");

        jLabel15.setText("Descrição do produto:");

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jlNome)
                                    .addComponent(jLabel3)
                                    .addComponent(jlMarca)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jlModelo))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jlCodigo)
                                    .addComponent(jLabel13)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
                            .addComponent(jlCategoria)
                            .addComponent(jLabel9)
                            .addComponent(jlQuantidade)
                            .addComponent(jlPreco)
                            .addComponent(jLabel11))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQuantidade)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProdutosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Connection con = null;
        InterOperacoesProduto iop = new OperacoesProduto();

        try {
            con = DriverManager.getConnection("jdbcmysql://localhost:3306/LojinhaDeEletronicos", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        isso que está comentado é o teste que eu fiz para saber se ia dar certo
//        Produto p1 = new Produto("josias", "opa", "ibanez", "descrição", 12, 12.30, 100, "alta categoria");
//        Produto p2 = new Produto("kkkk", "modelo", "maravilha", "descrição", 4000, 1200.30, 100, "alta categoria");
//        Produto p3 = new Produto("alberto", "modelo", "mara", "descrição", 12, 12.30, 100, "alta categoria");        
        List<Produto> listaDeProdutos = iop.exibir(con);
//        List<Produto> listaDeProdutos = new ArrayList<>();

//        l.add(p1);
//        l.add(p2);
//        l.add(p3);
//        listaDeProdutos.add(p2);
//        listaDeProdutos.add(p1);
        for (Produto produto : listaDeProdutos) {
            jcbProdutos.addItem(produto);
        }


    }//GEN-LAST:event_formWindowOpened

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed

        Produto produto = (Produto) jcbProdutos.getSelectedItem();
        String nome = produto.getNome();
        String marca = produto.getMarca();
        String modelo = produto.getModelo();
        String descricao = produto.getDescricao();
        int quantidade = produto.getQuantidade();
        double preco = produto.getPreco();
        String categoria = produto.getCategoria();
        int codigo = produto.getCodigo();

        String quantidadeStr = String.valueOf(quantidade);
        String codigoStr = String.valueOf(codigo);
        String precoStr = String.valueOf(preco);
        precoStr = precoStr.replaceAll(",", ".");

        jlNome.setText(nome);
        jlMarca.setText(marca);
        jlModelo.setText(modelo);
        jtaDescricao.setText(descricao);
        jlQuantidade.setText(quantidadeStr + " unidades");
        jlPreco.setText(precoStr + "R$");
        jlCategoria.setText(categoria);
        jlCodigo.setText(codigoStr);


    }//GEN-LAST:event_btnExibirActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirProdutosCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ExibirProdutosCadastrados().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExibir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Produto> jcbProdutos;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JTextArea jtaDescricao;
    // End of variables declaration//GEN-END:variables
}
