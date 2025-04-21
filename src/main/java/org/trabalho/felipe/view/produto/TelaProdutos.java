package org.trabalho.felipe.view.produto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.trabalho.felipe.Produtos;
import org.trabalho.felipe.view.MenuPrincipal;

public class TelaProdutos extends javax.swing.JFrame {
    
    MenuPrincipal MenuPrincipal;
    
    ArrayList<Produtos> listaProdutos;
    DefaultTableModel tabela;
    
    
    public void placeholder(){
        txtFild_Tipo.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtFild_Tipo.getText().equals("TIPO")) {
                    txtFild_Tipo.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtFild_Tipo.getText().isEmpty()) {
                    txtFild_Tipo.setText("TIPO");
                }
            }
        });
        
        txtFild_Descricao.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtFild_Descricao.getText().equals("DESCRIÇÃO")) {
                    txtFild_Descricao.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtFild_Descricao.getText().isEmpty()) {
                    txtFild_Descricao.setText("DESCRIÇÃO");
                }
            }
        });
        
        txtFild_Preco.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtFild_Preco.getText().equals("PREÇO")) {
                    txtFild_Preco.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtFild_Preco.getText().isEmpty()) {
                    txtFild_Preco.setText("PREÇO");
                }
            }
        });
        
        btn_Adicionar.requestFocusInWindow();
    }
 
    public TelaProdutos() {
        initComponents();
        this.setLocationRelativeTo(null);

        placeholder();
        this.tabela = (DefaultTableModel) tb_Produtos.getModel();
    }
    
    public TelaProdutos(MenuPrincipal menu) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaProdutos = menu.listaProdutos;
        this.MenuPrincipal = menu;
        
        this.tabela = (DefaultTableModel) tb_Produtos.getModel();

        placeholder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll_Table = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        btn_Adicionar = new javax.swing.JButton();
        txtFild_Tipo = new javax.swing.JTextField();
        txtFild_Descricao = new javax.swing.JTextField();
        txtFild_Preco = new javax.swing.JTextField();
        btn_Excluit = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PRODUTOS");
        setResizable(false);

        tb_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Descrição", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Produtos.setShowGrid(true);
        tb_Produtos.getTableHeader().setReorderingAllowed(false);
        scroll_Table.setViewportView(tb_Produtos);
        tb_Produtos.getAccessibleContext().setAccessibleDescription("");

        btn_Adicionar.setText("ADICIONAR");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

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

        btn_Excluit.setText("EXCLUIR");
        btn_Excluit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluitActionPerformed(evt);
            }
        });

        btn_Fechar.setText("FECHAR");
        btn_Fechar.setToolTipText("FECHAR");
        btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FecharActionPerformed(evt);
            }
        });

        btn_Alterar.setText("ALTERAR");
        btn_Alterar.setToolTipText("ALTERAR");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_Table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFild_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFild_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFild_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Excluit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFild_Descricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFild_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFild_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Excluit)
                    .addComponent(btn_Fechar)
                    .addComponent(btn_Alterar))
                .addContainerGap())
        );

        btn_Adicionar.getAccessibleContext().setAccessibleDescription("ADICIONAR");
        btn_Excluit.getAccessibleContext().setAccessibleDescription("EXCLUIR");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        Double preco = 0.0;
        
        try {
            preco = Double.valueOf(txtFild_Preco.getText());
            
            listaProdutos.add(Produtos.inserirProduto(listaProdutos, txtFild_Tipo.getText(), txtFild_Descricao.getText(), preco, tabela));
            
            txtFild_Tipo.setText("TIPO");
            txtFild_Descricao.setText("DESCRIÇÃO");
            txtFild_Preco.setText("PREÇO");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor válido para o preço.", "Erro de Formatação", JOptionPane.ERROR_MESSAGE);

            txtFild_Preco.setText("PREÇO");
        }
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_ExcluitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluitActionPerformed
        System.out.println(listaProdutos);
        int linhaSelec = tb_Produtos.getSelectedRow();
        
        if(linhaSelec < 0){
            System.out.println("Nenhuma linha selecionada!");
        }
        else{
            Produtos.removerProduto(linhaSelec, tabela, listaProdutos);
        }
    }//GEN-LAST:event_btn_ExcluitActionPerformed

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        MenuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_FecharActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        int linhaSelec = tb_Produtos.getSelectedRow();
        
        if(linhaSelec >= 0){
            TelaAlterarProduto telaAlterar = new TelaAlterarProduto(this, linhaSelec);
            telaAlterar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecione uma Linha!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_AlterarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaProdutos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Excluit;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JScrollPane scroll_Table;
    private javax.swing.JTable tb_Produtos;
    private javax.swing.JTextField txtFild_Descricao;
    private javax.swing.JTextField txtFild_Preco;
    private javax.swing.JTextField txtFild_Tipo;
    // End of variables declaration//GEN-END:variables
}
