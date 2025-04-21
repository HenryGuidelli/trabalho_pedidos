package org.trabalho.felipe.view.produto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.trabalho.felipe.Produtos;
import org.trabalho.felipe.view.MenuPrincipal;

public class TelaListarProdutos extends javax.swing.JFrame {

    MenuPrincipal MenuPrincipal;
    ArrayList<Produtos> listaProdutos;
    DefaultTableModel tabela;
    
    public void placeholder() {
        txtFild_Id.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtFild_Id.getText().equals("BUSCAR ID:")) {
                    txtFild_Id.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtFild_Id.getText().isEmpty()) {
                    txtFild_Id.setText("BUSCAR ID:");
                }
            }
        });
    }
    
    public TelaListarProdutos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public TelaListarProdutos(MenuPrincipal menuPrincipal) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.MenuPrincipal = menuPrincipal;
        this.listaProdutos = MenuPrincipal.listaProdutos;
        this.tabela = (DefaultTableModel) tb_Produtos.getModel();
        placeholder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll_Table = new javax.swing.JScrollPane();
        tb_Produtos = new javax.swing.JTable();
        btn_Listar = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();
        txtFild_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTAR PRODUTOS");
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
                false, false, false, false
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

        btn_Listar.setText("LISTAR");
        btn_Listar.setToolTipText("LISTAR");
        btn_Listar.setName(""); // NOI18N
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });

        btn_Fechar.setText("FECHAR");
        btn_Fechar.setToolTipText("FECHAR");
        btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FecharActionPerformed(evt);
            }
        });

        txtFild_Id.setText("BUSCAR ID:");
        txtFild_Id.setToolTipText("BUSCAR ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFild_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFild_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Listar)
                    .addComponent(btn_Fechar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txtFild_Id.getAccessibleContext().setAccessibleName("BUSCAR ID:");

        getAccessibleContext().setAccessibleDescription("LISTAR PRODUTOS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        int txtId = -1;
        if(txtFild_Id.getText().equals("BUSCAR ID:") || txtFild_Id.getText().isBlank())
        {
            if(listaProdutos.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Sem Produtos Cadastrados", "Lista Vazia", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                Produtos.ListaProdutos(listaProdutos, tabela);
            }
        }    
        else
        {
            try
            {
                if(listaProdutos.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Sem Produtos Cadastrados", "Lista Vazia", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    txtId = Integer.parseInt(txtFild_Id.getText());
                    
                    if((listaProdutos.size()-1) < txtId || txtId < 0)
                    {
                        throw new NumberFormatException();
                    }
                    
                    Produtos.ListaProdutos(txtId, listaProdutos, tabela);
                }
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "ID inválido!", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_btn_ListarActionPerformed

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        MenuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_FecharActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaListarProdutos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JScrollPane scroll_Table;
    private javax.swing.JTable tb_Produtos;
    private javax.swing.JTextField txtFild_Id;
    // End of variables declaration//GEN-END:variables
}
