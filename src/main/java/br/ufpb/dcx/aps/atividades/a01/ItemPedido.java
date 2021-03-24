package br.ufpb.dcx.aps.atividades.a01;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public ItemPedido(Produto produto){
        this.produto = produto;
        this.quantidade = 1;
    }
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getTotal(){
        double total = quantidade * produto.getValor();
        return total;
    }
}
