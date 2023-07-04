package domaci25_05_zadatak1;
//životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
public abstract class Zivotinja {

    protected String ime;
    protected String nadimak;

    public Zivotinja(){

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public abstract String zvukZivotinje();

    @Override
    public String toString() {
        return "Zivotinja{" +
                "ime='" + ime + '\'' +
                ", nadimak='" + nadimak + '\'' + "  " ;
    }
}
