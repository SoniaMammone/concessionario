package GestionaleNegozio;

public class Veicolo {
    String marca;
    String modello;
    int numTelaio;
    int cilindrata;
    int numRuote;
    String colore;

    public Veicolo(String marca, String modello, int numTelaio, int cilindrata, int numRuote, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.numTelaio = numTelaio;
        this.cilindrata = cilindrata;
        this.numRuote = numRuote;
        this.colore = colore;
    }

    @Override
    public String toString() {
        return marca + "\t" + modello + "\t" + numTelaio + "\t" + cilindrata + "\t" + numRuote + "\t" + colore;
    }
}
