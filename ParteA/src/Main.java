import modelo.Camiao;
import modelo.Comboio;
import modelo.Contentor;
import modelo.Navio;

public class Main {
    public static void main(String[] args) {
        Contentor contentor1 = new Contentor("Cont-100000", 10);
        Contentor contentor2 = new Contentor("Cont-200000", 15);
        Contentor contentor3 = new Contentor("Cont-3000000", 20);
        Contentor contentor4 = new Contentor("Cont-4000000", 22);

        Camiao camiao1 = new Camiao("AA-00-AA", 10, 60);
        Camiao camiao2 = new Camiao("AA-10-BB", 13, 80);

        Comboio comboio = new Comboio("IP-20000", 200, 1000,"sss",4,5);

        Navio navio = new Navio("Nav-10000", 1500, 2000,
                "Reb-1000", 200, 400);

        camiao1.adicionar(contentor1);
        camiao2.adicionar(contentor2);

        comboio.adicionar(contentor3);

        navio.adicionar(contentor4);
        navio.adicionar(camiao1);

        System.out.println(camiao1 + "\n");
        System.out.println(camiao2 + "\n");
        System.out.println(comboio + "\n");
        System.out.println(navio + "\n");

        comboio.adicionar(camiao2);

    }
}
