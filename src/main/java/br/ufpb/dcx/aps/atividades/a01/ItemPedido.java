package br.ufpb.dcx.aps.atividades.a01;

public class ItemPedido {

    private Produto produto;
    private int quantidade;


    public ItemPedido(Produto produto, int quantidade){
        if(quantidade <= 0) throw new RuntimeException("a quantidade deve ser maior que zero");
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemPedido(Produto produto){
        this(produto,1);
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
