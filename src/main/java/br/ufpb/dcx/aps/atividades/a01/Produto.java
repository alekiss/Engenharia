package br.ufpb.dcx.aps.atividades.a01;

public class Produto {
    private String nome;
    private String descricao;
    private Double valor;
    private String cod;

    public Produto(String nome, String descricao, Double valor, String cod){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.cod = cod;
    }
    public Produto(){
        this.nome = "";
        this.descricao = "";
        this.valor = 0.0;
        this.cod = "";
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
