/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;
import DomainModel.FContexto;
/**
 *
 * @author lucimario
 */
public class JFProprietario extends javax.swing.JFrame {

    /**
     * Creates new form AFProprietario
     */
    public JFProprietario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCaixa = new javax.swing.JButton();
        jBUsuario = new javax.swing.JButton();
        jBMercadoria = new javax.swing.JButton();
        jBCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBCaixa.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jBCaixa.setText("CAIXA");
        jBCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCaixaActionPerformed(evt);
            }
        });

        jBUsuario.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jBUsuario.setText("CADASTROS E RELATORIOS DE  USUÁRIO");
        jBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUsuarioActionPerformed(evt);
            }
        });

        jBMercadoria.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jBMercadoria.setText("CADASTROS E RELATORIOS DE MERCADORIA");
        jBMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMercadoriaActionPerformed(evt);
            }
        });

        jBCliente.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jBCliente.setText("CADASTROS E RELATORIOS DE CLIENTE");
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(242, 241, 250));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 96, 96));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROPRIETARIO");
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setAlignmentY(20.5F);
        jLabel1.setDisplayedMnemonicIndex(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBCliente)
                    .addComponent(jBCaixa)
                    .addComponent(jBMercadoria)
                    .addComponent(jBUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jBUsuario)
                .addGap(37, 37, 37)
                .addComponent(jBMercadoria)
                .addGap(40, 40, 40)
                .addComponent(jBCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jBCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuarioActionPerformed
        FContexto.getJfUsuario().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jBUsuarioActionPerformed

    private void jBMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMercadoriaActionPerformed
        FContexto.getJfMercadoria().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jBMercadoriaActionPerformed

    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
        FContexto.getCliente().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jBClienteActionPerformed

    private void jBCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCaixaActionPerformed
        FContexto.getCaixainicial().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jBCaixaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFProprietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCaixa;
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBMercadoria;
    private javax.swing.JButton jBUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}