package org.trabalho.felipe.view.produto;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.trabalho.felipe.ItemPedido;
import org.trabalho.felipe.Pedidos;
import org.trabalho.felipe.Produtos;
import org.trabalho.felipe.patterns.PedidoBuilder;
import org.trabalho.felipe.view.MenuPrincipal;

public class TelaCadastrarPedidos extends javax.swing.JFrame {

    MenuPrincipal MenuPrincipal;
    ArrayList<Produtos> listaProdutos;
    ArrayList<Pedidos> listaPedidos;
    ArrayList<ItemPedido> listaItemPedido;
    
    DefaultTableModel tabela;
    
    DefaultComboBoxModel<Produtos> prodCombo;
    
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
    
    public TelaCadastrarPedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public TelaCadastrarPedidos(MenuPrincipal menuPrincipal) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.MenuPrincipal = menuPrincipal;
        this.listaProdutos = MenuPrincipal.listaProdutos;
        this.listaPedidos = MenuPrincipal.listaPedidos;
        this.listaItemPedido = MenuPrincipal.listaItemPedido;
        
        this.tabela = (DefaultTableModel) tb_Pedidos.getModel();
        
        this.prodCombo = new DefaultComboBoxModel<>();
        
        placeholder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Pedidos = new javax.swing.JTable();
        cmb_Produtos = new javax.swing.JComboBox();
        txtFild_Quantidade = new javax.swing.JTextField();
        btn_Adicionar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PEDIDOS");

        tb_Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qtd Total", "Valor Pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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
        tb_Pedidos.setShowVerticalLines(true);
        tb_Pedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_Pedidos);
        if (tb_Pedidos.getColumnModel().getColumnCount() > 0) {
            tb_Pedidos.getColumnModel().getColumn(0).setResizable(false);
            tb_Pedidos.getColumnModel().getColumn(1).setResizable(false);
            tb_Pedidos.getColumnModel().getColumn(2).setResizable(false);
            tb_Pedidos.getColumnModel().getColumn(3).setResizable(false);
        }
        tb_Pedidos.getAccessibleContext().setAccessibleName("tabela");
        tb_Pedidos.getAccessibleContext().setAccessibleDescription("tabela");

        cmb_Produtos.setMaximumRowCount(100);
        cmb_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ProdutosActionPerformed(evt);
            }
        });

        txtFild_Quantidade.setText("QUANTIDADE");

        btn_Adicionar.setText("ADICIONAR");
        btn_Adicionar.setToolTipText("ADICIONAR");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("EXCLUIR");
        btn_Excluir.setToolTipText("EXCLUIR");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        btn_Fechar.setText("FECHAR");
        btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FecharActionPerformed(evt);
            }
        });

        btn_Alterar.setText("ALTERAR");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Excluir)
                        .addGap(43, 43, 43)
                        .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmb_Produtos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFild_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFild_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Adicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Excluir)
                        .addComponent(btn_Alterar))
                    .addComponent(btn_Fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Fechar.getAccessibleContext().setAccessibleDescription("FECHAR");
        btn_Alterar.getAccessibleContext().setAccessibleDescription("ALTERAR");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        try {
            int quantidade = Integer.parseInt(txtFild_Quantidade.getText());
            if (quantidade <= 0) {
                throw new NumberFormatException("Quantidade deve ser maior que zero.");
            }

            Produtos produtoSelecionado = (Produtos) cmb_Produtos.getSelectedItem();

            // Verifica se o item já existe
            boolean jaExiste = false;
            for (ItemPedido ip : listaItemPedido) {
                if (ip.getItem().getId() == produtoSelecionado.getId()) {
                    jaExiste = true;
                    break;
                }
            }

            if (jaExiste) {
                JOptionPane.showMessageDialog(this, "Este item já foi adicionado ao pedido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return; // não segue pra criação de pedido
            }

            // Se não existe, adiciona e cria pedido normalmente
            ItemPedido novoItem = new ItemPedido(produtoSelecionado, quantidade);
            listaItemPedido.add(novoItem);

            Pedidos novoPedido = new PedidoBuilder()
                    .comId(Pedidos.autoInt(listaPedidos))
                    .adicionarItem(produtoSelecionado, quantidade)
                    .construir();

            listaPedidos.add(novoPedido);

            Object[] linha = new Object[]{
                novoPedido.getId(),
                novoItem.getItem().getDescricao() + "x" + novoItem.getQtd(),
                novoPedido.getQtd(),
                novoPedido.getValorTotal()
            };

            tabela.addRow(linha);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida! Digite um número válido maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        MenuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_FecharActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        int linhaSelec = tb_Pedidos.getSelectedRow();

        if (linhaSelec >= 0) {
            TelaAlterarPedido telaAlterar = new TelaAlterarPedido(this, linhaSelec);
            telaAlterar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma Linha!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void cmb_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ProdutosActionPerformed
    }//GEN-LAST:event_cmb_ProdutosActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        System.out.println(listaItemPedido);
        System.out.println(listaPedidos);
        int linhaSelec = tb_Pedidos.getSelectedRow();

        if (linhaSelec < 0) {
            System.out.println("Nenhuma linha selecionada!");
        } else {
            listaItemPedido.remove(linhaSelec);
            listaPedidos.remove(linhaSelec);
            tabela.removeRow(linhaSelec);
        }
        System.out.println(listaItemPedido);
        System.out.println(listaPedidos);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastrarPedidos().setVisible(true);
        });
    }
    
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);

        if (visible) {
            cmb_Produtos.removeAllItems();
            for (Produtos p : listaProdutos) {
                System.out.println(p);
                
                cmb_Produtos.addItem(p);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Fechar;
    public javax.swing.JComboBox cmb_Produtos;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tb_Pedidos;
    private javax.swing.JTextField txtFild_Quantidade;
    // End of variables declaration//GEN-END:variables
}
