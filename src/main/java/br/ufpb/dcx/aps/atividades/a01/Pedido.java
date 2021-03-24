package br.ufpb.dcx.aps.atividades.a01;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido(){
        this.itens = new ArrayList<ItemPedido>();
    }

    public void addProduto (Produto produto, int quant){
        if (quant>=1){
            ItemPedido item = new ItemPedido(produto, quant);
            itens.add(item);
        }
        else{
            throw new RuntimeException("a quantidade deve ser maior que zero");
        }
    }
    public void addProduto(Produto produto){
        if (produto != null){
            ItemPedido item = new ItemPedido(produto);
            itens.add(item);
        }
        else{
            throw new RuntimeException("a quantidade deve ser maior que zero");
        }
    }
    public int quantProdutos(){
        int cont = 0;
        for (ItemPedido a:itens){
            cont += a.getQuantidade();

        }
        return cont;
    }
    public List<ItemPedido> getItens() {
        return itens;
    }
    public double getTotal(){
        int cont = 0;
        for (ItemPedido a:itens){
            cont += a.getTotal();

        }
        return cont;
    }
}
