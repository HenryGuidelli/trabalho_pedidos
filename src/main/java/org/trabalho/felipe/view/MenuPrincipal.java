package org.trabalho.felipe.view;

import java.util.ArrayList;
import org.trabalho.felipe.ItemPedido;
import org.trabalho.felipe.Pedidos;
import org.trabalho.felipe.Produtos;
import org.trabalho.felipe.view.produto.*;

public class MenuPrincipal extends javax.swing.JFrame {  

    TelaProdutos TelaProdutos;
    TelaCadastrarPedidos TelaPedidos;
    
    public ArrayList<Produtos> listaProdutos;
    public ArrayList<Pedidos> listaPedidos;
    public ArrayList<ItemPedido> listaItemPedido;
    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaProdutos = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();
        this.listaItemPedido = new ArrayList<>();
        
        this.TelaPedidos = new TelaCadastrarPedidos(this);
        this.TelaProdutos = new TelaProdutos(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_CadastraProduto = new javax.swing.JButton();
        btn_CadastrarPedido = new javax.swing.JButton();
        btn_ListaProdutos = new javax.swing.JButton();
        btn_ListarPedidos = new javax.swing.JButton();
        btn_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);

        btn_CadastraProduto.setText("CADASTRAR PRODUTO");
        btn_CadastraProduto.setToolTipText("CADASTRAR PRODUTO");
        btn_CadastraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastraProdutoActionPerformed(evt);
            }
        });

        btn_CadastrarPedido.setText("CADASTRAR PEDIDO");
        btn_CadastrarPedido.setToolTipText("CADASTRAR PEDIDO");
        btn_CadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarPedidoActionPerformed(evt);
            }
        });

        btn_ListaProdutos.setText("LISTAR PRODUTO");
        btn_ListaProdutos.setToolTipText("LISTAR PRODUTO");
        btn_ListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaProdutosActionPerformed(evt);
            }
        });

        btn_ListarPedidos.setText("LISTAR PEDIDOS");
        btn_ListarPedidos.setToolTipText("LISTAR PEDIDOS");
        btn_ListarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarPedidosActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_CadastraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_CadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ListaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ListarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CadastraProduto)
                    .addComponent(btn_CadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ListaProdutos)
                    .addComponent(btn_ListarPedidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Fechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastraProdutoActionPerformed
        TelaProdutos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CadastraProdutoActionPerformed

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btn_FecharActionPerformed

    private void btn_ListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaProdutosActionPerformed
        TelaListarProdutos telaLista = new TelaListarProdutos(this);
        telaLista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ListaProdutosActionPerformed

    private void btn_CadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarPedidoActionPerformed
         
        TelaPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CadastrarPedidoActionPerformed

    private void btn_ListarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarPedidosActionPerformed
        TelaListarPedidos telaLista = new TelaListarPedidos(this);
        telaLista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ListarPedidosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                System.out.println(info.getName());
                
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadastraProduto;
    private javax.swing.JButton btn_CadastrarPedido;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JButton btn_ListaProdutos;
    private javax.swing.JButton btn_ListarPedidos;
    // End of variables declaration//GEN-END:variables

}
