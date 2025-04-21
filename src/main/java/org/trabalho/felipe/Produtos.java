package org.trabalho.felipe;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Produtos {
    
   private int id = 0;
   private String tipo;
   private String descricao;
   private Double preco;

    public Produtos(int id, String tipo, String descricao, Double preco) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public static int autoInt(ArrayList<Produtos> listaProd) {
        if (listaProd.isEmpty()) {
            return 0;
        } else {
            int lastID = listaProd.getLast().getId();
            int ID = lastID + 1;
            return ID;
        }
    }
    
    public static Produtos inserirProduto(ArrayList<Produtos> listaProd, String tipo, String descricao, Double preco, DefaultTableModel tabela){ 
        int id = autoInt(listaProd);

        Object[] prodAdd = new Object[]{id, tipo, descricao, preco};
        tabela.addRow(prodAdd);
        return new Produtos(id, tipo, descricao, preco);
    }

    public static void removerProduto(int linha, DefaultTableModel tabela, ArrayList<Produtos> lista){
        
        if(linha < 0){
                        
        }
        else{
            lista.remove(linha);
            tabela.removeRow(linha);
        }
        
    }
    
    public static Produtos buscarId(int idBuscado,  ArrayList<Produtos> lista){     

        for (Produtos produtoBuscado : lista) {
            if (produtoBuscado.getId() == idBuscado) {
                return produtoBuscado;
            }
        }
        return null;
    }
    
    public static void ListaProdutos(ArrayList<Produtos> lista, DefaultTableModel tabela){
        tabela.setNumRows(0);
        
        for(Produtos prod : lista){
            
            Object[] prodAdd = new Object[]{prod.getId(), prod.getTipo(), prod.getDescricao(), prod.getPreco()};
            tabela.addRow(prodAdd);
        }
    }
    
    public static void ListaProdutos(int id, ArrayList<Produtos> lista, DefaultTableModel tabela) {
        
        Produtos prod = buscarId(id, lista);
        
        Object[] prodAdd = new Object[]{prod.getId(), prod.getTipo(), prod.getDescricao(), prod.getPreco()};
        
        tabela.setNumRows(0);
        
        tabela.addRow(prodAdd);   
    }
    
    public static void Alterar(int linha, String tipo, String descricao, Double preco, ArrayList<Produtos> lista,DefaultTableModel tabela){
        buscarId(linha, lista);
    }
    
    @Override
    public String toString() {
        return this.getId()+": "+this.getDescricao();
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
