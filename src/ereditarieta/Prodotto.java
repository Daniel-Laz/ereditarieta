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
            if (p.descrizione.equals(this.descrizione)&&p.quantita==this.quantita&&p.prezzo==this.prezzo){
                return true;
            }
        }
        return false;
    }

    public Prodotto(){}

    public Prodotto(String descrizione, int quantita, float prezzo){
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.quantita=quantita;
    }
}
