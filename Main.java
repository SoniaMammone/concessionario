package GestionaleNegozio;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Creare un sistema di gestione di un negozio che vende veicoli di diversa tipologia.
Sono disponibili autoveicoli, moto e trattore (utilizzare i principi
dell'ereditarietà per ottimizzare il codice) */

        List<Veicolo> veicoloLista = new LinkedList<>();

        Autoveicolo av1 = new Autoveicolo("Renault", "Clio", 123456, 1000, 5,
                "Blu", 4);
        Autoveicolo av2 = new Autoveicolo("Ford", "Fiesta", 123456, 900, 4,
                "Bianca", 4);
        Motociclo mc1 = new Motociclo("Yamaha", "Moto", 64728969, 2000, 2,
                "Rossa", true);
        Trattore t1 = new Trattore("Fiat", "Trattore1", 4789877, 2000, 4,
                "Verde", false);

        veicoloLista.add(av1);
        veicoloLista.add(av2);
        veicoloLista.add(mc1);
        veicoloLista.add(t1);

        for (Veicolo v : veicoloLista){
            System.out.println(v);
        }
    }
}
