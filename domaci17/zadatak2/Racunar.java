package domaci25_05_zadatak2;
/*
Računar ima broj procesora, količinu ram memorije i količinu memorije.
 Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
 */
public class Racunar {

    protected int brojProcesora;
    protected String ramMemorija;
    protected String hddMemorija;

    public Racunar(int brojProcesora, String ramMemorija, String hddMemorija) {
        this.brojProcesora = brojProcesora;
        this.ramMemorija = ramMemorija;
        this.hddMemorija = hddMemorija;
    }

    public int getBrojProcesora() {
        return brojProcesora;
    }

    public void setBrojProcesora(int brojProcesora) {
        this.brojProcesora = brojProcesora;
    }

    public String getRamMemorija() {
        return ramMemorija;
    }

    public void setRamMemorija(String ramMemorija) {
        this.ramMemorija = ramMemorija;
    }

    public String getHddMemorija() {
        return hddMemorija;
    }

    public void setHddMemorija(String hddMemorija) {
        this.hddMemorija = hddMemorija;
    }

    @Override
    public String toString() {
        return "{" +
                "brojProcesora=" + brojProcesora +
                ", ramMemorija=" + ramMemorija +
                ", hddMemorija=" + hddMemorija +
                '}';
    }
}
