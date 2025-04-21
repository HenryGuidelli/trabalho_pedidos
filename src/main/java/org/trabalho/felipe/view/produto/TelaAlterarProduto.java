package org.trabalho.felipe.view.produto;
import javax.swing.JOptionPane;
import org.trabalho.felipe.Produtos;

public class TelaAlterarProduto extends javax.swing.JFrame {

    TelaProdutos TelaProduto;
    int linhaSelec;
    
    public TelaAlterarProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public TelaAlterarProduto(TelaProdutos telaProduto, int linha) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.TelaProduto = telaProduto;
        this.linhaSelec = linha;
        
        txtFild_Tipo.setText(Produtos.buscarId(linhaSelec, TelaProduto.listaProdutos).getTipo());
        txtFild_Descricao.setText(Produtos.buscarId(linhaSelec, TelaProduto.listaProdutos).getDescricao());
        txtFild_Preco.setText(String.valueOf(Produtos.buscarId(linhaSelec, TelaProduto.listaProdutos).getPreco()));
                
        
        TelaProduto.placeholder();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFild_Tipo = new javax.swing.JTextField();
        txtFild_Descricao = new javax.swing.JTextField();
        txtFild_Preco = new javax.swing.JTextField();
        btn_Alterar = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR PRODUTO");

        txtFild_Tipo.setText("TIPO");
        txtFild_Tipo.setToolTipText("TIPO");
        txtFild_Tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFild_Tipo.setName("tipo"); // NOI18N

        txtFild_Descricao.setText("DESCRIÇÃO");
        txtFild_Descricao.setToolTipText("DESCRIÇÃO");
        txtFild_Descricao.setName("descricao"); // NOI18N

        txtFild_Preco.setText("PREÇO");
        txtFild_Preco.setToolTipText("PREÇO");
        txtFild_Preco.setName("preco"); // NOI18N

        btn_Alterar.setText("ALTERAR");
        btn_Alterar.setToolTipText("ALTERAR");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Fechar.setText("FECHAR");
        btn_Fechar.setToolTipText("FECHAR");
        btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFild_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFild_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFild_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFild_Descricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFild_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFild_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Fechar)
                    .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        Double preco = 0.0;

        try {
            preco = Double.valueOf(txtFild_Preco.getText());
            
      
            Produtos prod = Produtos.buscarId(linhaSelec, TelaProduto.listaProdutos);
         
            prod.setTipo(txtFild_Tipo.getText());
            prod.setDescricao(txtFild_Descricao.getText());
            prod.setPreco(preco);
            
            TelaProduto.tabela.setValueAt((Object)prod.getTipo(), linhaSelec, 1);
            TelaProduto.tabela.setValueAt((Object)prod.getDescricao(), linhaSelec, 2);
            TelaProduto.tabela.setValueAt((Object)prod.getPreco(), linhaSelec, 3);
            
            JOptionPane.showMessageDialog(this, "Linha Alterada", "ALTERADO", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor válido para o preço.", "Erro de Formatação", JOptionPane.ERROR_MESSAGE);

            txtFild_Preco.setText("PREÇO");
        }
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_FecharActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new TelaAlterarProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JTextField txtFild_Descricao;
    private javax.swing.JTextField txtFild_Preco;
    private javax.swing.JTextField txtFild_Tipo;
    // End of variables declaration//GEN-END:variables
}
