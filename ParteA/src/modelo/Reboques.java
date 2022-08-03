package modelo;

import java.util.LinkedList;

public class Reboques<Interface1> extends Transporte {

    protected String identificacaoReboque;
    protected int pesoMaximoReboque;
    protected int pesoReboque;
    protected LinkedList<Camiao> cargaReboque;

    public Reboques(String identificacao, int peso, int pesoMaximo, String identificacaoReboque, int pesoMaximoReboque, int pesoReboque) {
        super(identificacao, peso, pesoMaximo);
        this.identificacaoReboque = identificacaoReboque;
        this.pesoMaximoReboque = pesoMaximoReboque;
        this.pesoReboque = pesoReboque;
    }

    public String getIdentificacaoReboque() {
        return identificacaoReboque;
    }

    public int getPesoReboque() {
        return pesoReboque;
    }


    ///////////////////////////////////////////
/*
    public void adicionar(X contentor) {
        if (contentor == null || carga.contains(contentor)) {
            return;
        }
        int novoPesoCarga = peso + contentor.getPeso();
        if (novoPesoCarga > pesoMaximo) {
            return;
        }
        carga.add(contentor);
        peso = novoPesoCarga;
    }*/


    /*
    public void adicionar(Camiao x) {
        if (x == null || cargaReboque.contains(x)) {
            return;
        }
        int novoPeso = pesoReboque + x.getPeso();
        if (novoPeso > pesoMaximoReboque) {
            return;
        }
        cargaReboque.add(x);
        pesoReboque = novoPeso;
    }*/
}
