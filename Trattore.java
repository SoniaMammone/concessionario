package GestionaleNegozio;

public class Trattore extends Veicolo{
    boolean cingolato;

    public Trattore(String marca, String modello, int numTelaio, int cilindrata, int numRuote, String colore,
                    boolean cingolato) {
        super(marca, modello, numTelaio, cilindrata, numRuote, colore);
        this.cingolato = cingolato;
    }

    @Override
    public String toString() {
        return marca + "\t" + modello + "\t" + numTelaio + "\t" + cilindrata + "\t" + numRuote + "\t" + colore + "\t" +
                cingolato;
    }
}
