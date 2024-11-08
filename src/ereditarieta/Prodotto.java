package ereditarieta;

public class Prodotto {
    protected String descrizione;
    protected int quantita;
    protected float prezzo;

    public void rifornisci(int quantita){
        if (quantita>0){
            this.quantita+=quantita;
        }
    }
    public boolean vendi(){
        if (quantita>0){
            quantita--;
            return true;
        }else return false;
    }

    public String toString(){
        return descrizione+" quantità: "+quantita+" prezzo: "+prezzo;
    }

    public boolean equals(Object o){
        if (o instanceof Prodotto){
            Prodotto p = (Prodotto) o;
            if ()
        }
    }
}
