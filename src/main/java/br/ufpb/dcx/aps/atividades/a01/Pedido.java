package br.ufpb.dcx.aps.atividades.a01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pedido {

    private List<ItemPedido> itens = new LinkedList<ItemPedido>();

    public double getTotal() {
        double total = 0;
        for(ItemPedido item: itens)
            total += item.getProduto().getValor() * item.getQuantidade();
        return total;
    }

    public void addProduto(Produto produto, int quant) {
        itens.add(new ItemPedido(produto,quant));
    }

    public void addProduto(Produto p1) {
        this.addProduto(p1,1);
    }

    public int quantProdutos() {
        int total = 0;
        for(ItemPedido item: itens)
            total += item.getQuantidade();
        return total;

    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
