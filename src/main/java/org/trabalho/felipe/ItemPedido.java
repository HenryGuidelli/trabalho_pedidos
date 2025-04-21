package org.trabalho.felipe;

import java.util.ArrayList;

public class ItemPedido {
    
    Produtos item;
    int qtd;
    
    public ItemPedido(Produtos item, int qtd)
    {
        this.item = item;
        this.qtd = qtd;
    }
    
    public static ItemPedido inserirItem(ArrayList<ItemPedido> listaItemPedido, Produtos item, int qtd)
    {     
        for (ItemPedido itemPedido : listaItemPedido) {
            if (itemPedido.getItem().getId() == item.getId()) {
                return null; 
            }
        }
        ItemPedido novoItem = new ItemPedido(item, qtd);
        listaItemPedido.add(novoItem);
        return novoItem;
    }

    public Produtos getItem() {
        return item;
    }

    public void setItem(Produtos item) {
        this.item = item;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public static String getItemQtd(ArrayList<ItemPedido> listaItemPedido){
        return listaItemPedido.getLast().getItem().getDescricao()+"x"+listaItemPedido.getLast().getQtd();
    }
    
    public static ItemPedido buscarId(int id, ArrayList<ItemPedido> listaItemPedido){
        for (ItemPedido itemPedido : listaItemPedido) {
            if (itemPedido.getItem().getId() == id ){
                return itemPedido; 
            }
        }
        return null;
    }
    
    public static int contarQtdItens(ArrayList<ItemPedido> lista) {
        int qtdTotal = 0;

        for (ItemPedido ip : lista) {
            qtdTotal += ip.getQtd();
        }

        return qtdTotal;
    }
    
    public static Double somarValoresItens(ArrayList<ItemPedido> lista) {
        Double valorTotal = 0.0;

        for (ItemPedido ip : lista) {
            valorTotal += ip.item.getPreco() * ip.qtd;
        }

        return valorTotal;
    }
    
    @Override
    public String toString() {
        return this.getItem()+"x"+this.getQtd();
    }
    
    
    
}
