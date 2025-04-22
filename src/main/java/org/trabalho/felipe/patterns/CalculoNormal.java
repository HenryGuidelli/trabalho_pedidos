package org.trabalho.felipe.patterns;

import java.util.ArrayList;
import org.trabalho.felipe.ItemPedido;

public class CalculoNormal implements CalculoValorStrategy {
    @Override
    public Double calcular(ArrayList<ItemPedido> itens) {
        return ItemPedido.somarValoresItens(itens);
    }
}
