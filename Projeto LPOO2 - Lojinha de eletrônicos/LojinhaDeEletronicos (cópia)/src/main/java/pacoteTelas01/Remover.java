package pacoteTelas01;

import pacoteClasses.InterOperacoesProduto;
import pacoteClasses.OperacoesProduto;
import pacoteClasses.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Remover extends javax.swing.JFrame {

    public Remover() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbtRemover = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover");
        setResizable(false);

        jlCodigo.setText("Código:");

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jbtRemover.setText("Excluir");
        jbtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoverActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jbtRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjuda)
                .addGap(49, 49, 49)
                .addComponent(jlCodigo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jbtRemover)
                        .addGap(125, 125, 125))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jbtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoverActionPerformed

        String codigoStr = jtfCodigo.getText();
        while (codigoStr.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O código não foi informado ainda");
            codigoStr = JOptionPane.showInputDialog("Informe o código do produto que você deseja remover do sistema");
        }

        int codigo = Integer.parseInt(codigoStr);

        InterOperacoesProduto iop = new OperacoesProduto();
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbcmysql://localhost:3306/LojinhaDeEletronicos", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        Produto p = iop.retornarUmProduto(con, codigo);
        if(iop.verificarExistencia(con, codigo)){
            JOptionPane.showMessageDialog(rootPane, "O produto foi encontrado e vai ser removido");
            iop.remover(con, p);
            JOptionPane.showMessageDialog(rootPane, "O produto foi removido");
        }else{
            JOptionPane.showMessageDialog(rootPane, "O produto em questão não foi encontrado");
            JOptionPane.showMessageDialog(rootPane, "Verifique se você informou o código corretamente");
        }

    }//GEN-LAST:event_jbtRemoverActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Você está na tela de remoção de produto");
        JOptionPane.showMessageDialog(rootPane, "Informe o código do produto que deseja remover para poder concluir a operação");
        JOptionPane.showMessageDialog(rootPane, "Caso não saiba o código do produto consulte a opção exibir produtos cadastrados que está no menu de operações com produto");

    }//GEN-LAST:event_btnAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(Remover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Remover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton jbtRemover;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables
}
