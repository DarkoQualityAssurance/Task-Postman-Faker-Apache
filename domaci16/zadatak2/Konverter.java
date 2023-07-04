package zadatak2;
//Napraviti klasu Konverter koja kao atribute ima rsd i valutu.
public class Konverter {

    private double rsd;
    private Valuta valuta;


    public Konverter(){

    }


    public Konverter(int rsd, Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public double valureConverter(){
        double aud = 71.0290;
        double cad = 79.9944;
        double eur = 116.9279;
        double gbp = 134.3690;
        double rub = 1.3591;
        double usd = 108.8916;
        double result = 0;

        switch (valuta){
            case AUD: result = rsd / aud ;
            break;
            case CAD: result = rsd / cad;
            break;
            case EUR: result = rsd / eur;
            break;
            case GBP: result = rsd / gbp;
            break;
            case RUB: result = rsd / rub;
            break;
            case USD: result = rsd / usd;
            break;
        }
        return result;
    }



    public String toString() {
        return "Konverter{" +
                "rsd=" + rsd +
                ", valuta=" + valuta +
                '}';
    }
}
