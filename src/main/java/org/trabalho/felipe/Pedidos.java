package org.trabalho.felipe;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.trabalho.felipe.patterns.CalculoNormal;
import org.trabalho.felipe.patterns.CalculoValorStrategy;

public class Pedidos {
    
   
    
   int id = 0;
   ArrayList<ItemPedido> listaItens;
   int qtdTotal;
   Double ValorTotal;
   
   CalculoValorStrategy strategy = new CalculoNormal();
   
    public Pedidos(int id, ArrayList<ItemPedido> lista)
    {
        this.id = id;
        this.listaItens = lista;
        this.qtdTotal = ItemPedido.contarQtdItens(lista);
        this.ValorTotal = strategy.calcular(lista);
    }
  

    public static int autoInt(ArrayList<Pedidos> listaPedidos) {
        if (listaPedidos.isEmpty()) {
            return 0;
        } else {
            int lastID = listaPedidos.getLast().getId();
            int ID = lastID + 1;
            return ID;
        }
    }
    
    public static Pedidos buscarId(int idBuscado, ArrayList<Pedidos> listaPedidos) {

        for (Pedidos pedidoBuscado : listaPedidos) {
            if (pedidoBuscado.getId() == idBuscado) {
                return pedidoBuscado;
            }
        }
        return null;
    }
    
    public static void ListaPedidos(ArrayList<Pedidos> lista, DefaultTableModel tabela) {
        tabela.setNumRows(0);

        for (Pedidos pedido : lista) {
           
                Object[] pediAdd = new Object[]{pedido.getId(), ItemPedido.getItemQtd(pedido.listaItens), pedido.qtdTotal, pedido.ValorTotal};
                tabela.addRow(pediAdd);
            
        }
    }
    
    public static void ListaPedidos(int id, ArrayList<Pedidos> lista, DefaultTableModel tabela) {

        Pedidos pedi = buscarId(id, lista);

        Object[] prodAdd = new Object[]{pedi.getId(), pedi.listaItens, pedi.qtdTotal, pedi.ValorTotal};

        tabela.setNumRows(0);

        tabela.addRow(prodAdd);
    }
    
    public static Pedidos inserirPedidos(ArrayList<Pedidos> listaPedidos, ArrayList<ItemPedido> itemPedido)
    {
        int id = autoInt(listaPedidos);
        return new Pedidos(id, itemPedido);
    }

    @Override
    public String toString() {
        return "id=" + id + ", itens=" + ItemPedido.getItemQtd(listaItens) + ", qtdTotal=" + qtdTotal + ", ValorTotal=" + ValorTotal + "\n";
    }
    
    public static int getLastId(ArrayList<Pedidos> listaPedidos){
        if(listaPedidos == null || listaPedidos.isEmpty()){
            return 0;            
        }
        else{
            return listaPedidos.get(listaPedidos.size() - 1).getId()+1;  
        }
        
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ItemPedido> getLista() {
        return listaItens;
    }

    public void setLista(ArrayList<ItemPedido> lista) {
        this.listaItens = lista;
    }

    public int getQtd() {
        return qtdTotal;
    }

    public void setQtd(int qtd) {
        this.qtdTotal = qtd;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }   
}
