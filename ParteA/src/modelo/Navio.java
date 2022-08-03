package modelo;

import java.util.LinkedList;

public class Navio extends Reboques<Contentor> {

    protected Transporte<Camiao> reboque;


    public Navio(String identificacao, int peso, int pesoMaximo, String identificacaoReboque, int pesoMaximoReboque, int pesoReboque) {
        super(identificacao, peso, pesoMaximo, identificacaoReboque, pesoMaximoReboque, pesoReboque);
    }

    /*
    // toString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Navio: " + identificacao + " com "
                + peso + "Ton num máximo de " + pesoMaximo + "Ton");
        for (Contentor contentor : carga) {
            stringBuilder.append("\n").append(contentor);
        }
        stringBuilder.append("\nReboque: " + identificacaoReboque + " com "
                + pesoReboque + "Ton num máximo de " + pesoMaximoReboque + "Ton");
        for (Camiao camiao : cargaReboque) {
            stringBuilder.append("\n").append(camiao);
        }
        return stringBuilder.toString();
    }*/


}
