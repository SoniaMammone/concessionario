package GestionaleNegozio;

public class Autoveicolo extends  Veicolo{
    int numPorte;


    public Autoveicolo(String marca, String modello, int numTelaio, int cilindrata, int numRuote, String colore,
                       int numPorte) {
        super(marca, modello, numTelaio, cilindrata, numRuote, colore);
        this.numPorte = numPorte;
    }

    @Override
    public String toString() {
        return marca + "\t" + modello + "\t" + numTelaio + "\t" + cilindrata + "\t" + numRuote + "\t" + colore + "\t" +
                numPorte;
    }
}
