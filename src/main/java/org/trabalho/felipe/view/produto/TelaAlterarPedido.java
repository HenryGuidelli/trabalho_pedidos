package org.trabalho.felipe.view.produto;

import javax.swing.JOptionPane;
import org.trabalho.felipe.ItemPedido;
import org.trabalho.felipe.Pedidos;

public class TelaAlterarPedido extends javax.swing.JFrame {

    public void placeholder() {
        txtFild_Quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtFild_Quantidade.getText().equals("QUANTIDADE")) {
                    txtFild_Quantidade.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtFild_Quantidade.getText().isEmpty()) {
                    txtFild_Quantidade.setText("QUANTIDADE");
                }
            }
        });
    }
    
    TelaCadastrarPedidos TelaPedido;
    int linhaSelec;
    
    public TelaAlterarPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public TelaAlterarPedido(TelaCadastrarPedidos telaPedidos, int linha){
        initComponents();
        this.setLocationRelativeTo(null);

        this.TelaPedido = telaPedidos;
        this.linhaSelec = linha;

        placeholder();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Alterar = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();
        txtFild_Quantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALTERAR PEDIDO");

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

        txtFild_Quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild_Quantidade.setText("QUANTIDADE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFild_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFild_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        int qtd = 1;

        if(qtd > 0){
        
            try {
                qtd = Integer.parseInt(txtFild_Quantidade.getText());
                
                Pedidos pedido = Pedidos.buscarId(linhaSelec, TelaPedido.listaPedidos);
                
                pedido.getLista().get(linhaSelec).setQtd(qtd);
                pedido.setQtd(ItemPedido.contarQtdItens(TelaPedido.listaItemPedido));
                pedido.setValorTotal(ItemPedido.somarValoresItens(TelaPedido.listaItemPedido));
                
                System.out.println(pedido);
                
//                ItemPedido item = pedido.getLista().get(linhaSelec);;

                TelaPedido.tabela.setValueAt((Object)ItemPedido.getItemQtd(TelaPedido.listaItemPedido), linhaSelec, 1);
                TelaPedido.tabela.setValueAt((Object)ItemPedido.contarQtdItens(TelaPedido.listaItemPedido), linhaSelec, 2);
                TelaPedido.tabela.setValueAt((Object)ItemPedido.somarValoresItens(TelaPedido.listaItemPedido), linhaSelec, 3);

                JOptionPane.showMessageDialog(this, "Linha Alterada", "ALTERADO", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira quantidade maior que 0.", "Erro", JOptionPane.ERROR_MESSAGE);


            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Por favor, insira quantidade maior que 0", "Erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(TelaAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new TelaAlterarPedido().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JTextField txtFild_Quantidade;
    // End of variables declaration//GEN-END:variables
}
