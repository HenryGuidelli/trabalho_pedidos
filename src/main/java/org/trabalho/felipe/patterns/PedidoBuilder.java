package org.trabalho.felipe.patterns;

import java.util.ArrayList;
import org.trabalho.felipe.ItemPedido;
import org.trabalho.felipe.Pedidos;
import org.trabalho.felipe.Produtos;

public class PedidoBuilder {

    private int id;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public PedidoBuilder comId(int id) {
        this.id = id;
        return this;
    }

    public PedidoBuilder adicionarItem(Produtos produto, int qtd) {
        this.itens.add(new ItemPedido(produto, qtd));
        return this;
    }
    
    public PedidoBuilder adicionarItem(ArrayList<ItemPedido> itens) {
        
        for(ItemPedido item : itens){
            this.itens.add(item);
        }
        
        
        return this;
    }

    public Pedidos construir() {
        return new Pedidos(id, itens);
    }
}
