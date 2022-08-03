package modelo;

import java.util.LinkedList;

public class Camiao extends Transporte<Contentor> implements Interface1 { //ou Carga

    public Camiao(String identificacao, int peso, int pesoMaximo) {
        super(identificacao, peso, pesoMaximo);
    }

    /*
    // toString
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Camião: " + identificacao + " com "
                + peso + "Ton num máximo de " + pesoMaximo + "Ton");
        for (Contentor contentor : carga) {
            stringBuilder.append("\n").append(contentor);
        }
        return stringBuilder.toString();
    }*/




}
