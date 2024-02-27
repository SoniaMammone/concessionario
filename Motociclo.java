package GestionaleNegozio;

public class Motociclo extends Veicolo{
    boolean cross;

    public Motociclo(String marca, String modello, int numTelaio, int cilindrata, int numRuote, String colore,
                     boolean cross) {
        super(marca, modello, numTelaio, cilindrata, numRuote, colore);
        this.cross = cross;
    }

    @Override
    public String toString() {
        return marca + "\t" + modello + "\t" + numTelaio + "\t" + cilindrata + "\t" + numRuote + "\t" + colore + "\t" +
                cross;
    }
}
