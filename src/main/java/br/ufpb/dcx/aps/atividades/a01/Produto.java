package br.ufpb.dcx.aps.atividades.a01;

public class Produto {

    private String nome;
    private String descricao;
    private double valor;


    public Produto(){
        this.nome = "";
        this.descricao = "";
        this.valor = 0.0;
    }
    public Produto(String nome, String desc, double val) {
        this.nome = nome;
        this.descricao = desc;
        this.valor = val;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
