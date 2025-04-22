package org.trabalho.felipe.patterns;

import java.util.ArrayList;
import org.trabalho.felipe.ItemPedido;

public interface CalculoValorStrategy {
    Double calcular(ArrayList<ItemPedido> itens);
}