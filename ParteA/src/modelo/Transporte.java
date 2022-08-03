package modelo;

import java.util.LinkedList;

public abstract class Transporte<X extends Interface1> extends Descritor {

    // protected LinkedList<Carga<X>> carga = new LinkedList<>();

    protected LinkedList<X> carga;

    protected int pesoMaximo;

    public Transporte(String identificacao, int peso, int pesoMaximo) {
        super(identificacao, peso);
        this.pesoMaximo = pesoMaximo;
    }

    public void adicionar(X x) {
        if (x == null || carga.contains(x)) {
            return;
        }
        int novoPesoCarga = peso + x.getPeso();
        if (novoPesoCarga > pesoMaximo) {
            return;
        }
        carga.add(x);
        peso = novoPesoCarga;
    }





}
