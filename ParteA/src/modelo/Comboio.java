package modelo;

import java.util.LinkedList;

public class Comboio extends Reboques<Interface1> {

    public Comboio(String identificacao, int peso, int pesoMaximo, String identificacaoReboque, int pesoMaximoReboque, int pesoReboque) {
        super(identificacao, peso, pesoMaximo, identificacaoReboque, pesoMaximoReboque, pesoReboque);
    }

    public void adicionar(Contentor contentor) {
        if (contentor == null || carga.contains(contentor)) {
            return;
        }
        int novoPeso = peso + contentor.getPeso();
        if (novoPeso > pesoMaximo) {
            return;
        }
        carga.add(contentor);
        peso = novoPeso;
    }

    /*
    // toString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Comboio: " + identificacao + " com "
                + peso + "Ton num máximo de " + pesoMaximo + "Ton");
        for (Contentor contentor : carga) {
            stringBuilder.append("\n").append(contentor);
        }
        return stringBuilder.toString();
    }*/
}
