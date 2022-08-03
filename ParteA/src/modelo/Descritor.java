package modelo;

public abstract class Descritor {

    protected String identificacao;
    protected int peso;

    public Descritor(String identificacao, int peso) {
        this.identificacao = identificacao;
        this.peso = peso;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public int getPeso() {
        return peso;
    }


}
