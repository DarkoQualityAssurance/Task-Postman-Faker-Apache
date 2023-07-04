package domaci25_05_zadatak2;
/*
 Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana
 i enum za tastaturu (da li je internacionalna ili US). Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB,
 memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
 */
public class Laptop extends Racunar{

    private String velicinaEkrana;
    Tastatura tastatura;

    public Laptop(int brojProcesora, String ramMemorija, String hddMemorija, String velicinaEkrana, Tastatura tastatura) {
        super(brojProcesora, ramMemorija, hddMemorija);
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura = tastatura;
    }

    public String getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(String velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public Tastatura getTastatura() {
        return tastatura;
    }

    public void setTastatura(Tastatura tastatura) {
        this.tastatura = tastatura;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "velicinaEkrana='" + velicinaEkrana + '\'' +
                ", tastatura=" + tastatura +
                "} " + super.toString();
    }
}
