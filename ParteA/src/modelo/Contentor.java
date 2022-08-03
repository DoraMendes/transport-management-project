package modelo;

public class Contentor extends Descritor implements Interface1 { //ou Carga


    public Contentor(String identificacao, int peso) {
        super(identificacao, peso);
    }

    // toString
    public String toString() {
        return "Contentor: " + identificacao + " com " + peso + "Ton";
    }
}
