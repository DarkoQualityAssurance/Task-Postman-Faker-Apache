package domaci25_05_zadatak2;

/*
 i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
 Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
 */
public class MobilniTelefon extends Racunar {

    private String kamera;

    private Mreza mreza;

    public MobilniTelefon(int brojProcesora, String ramMemorija, String hddMemorija, String kamera, Mreza mreza) {
        super(brojProcesora, ramMemorija, hddMemorija);
        this.kamera = kamera;
        this.mreza = mreza;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return "MobilniTelefon{" +
                "kamera='" + kamera + '\'' +
                ", mreza=" + mreza.toString().replace("_","") +
                "} " + super.toString();
    }
}

