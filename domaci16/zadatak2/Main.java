package zadatak2;
/*
2.	Napraviti klasu Konverter koja kao atribute ima rsd i valutu. Valuta je enum, dok je rsd celi broj.
 Valuta treba da bude jedna od:
EUR, USD, AUD, CAD, RUB i GBP.
Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
 Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
  Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje.
  Pogledati kako se porede enum-i u javi najpravilnije.
  U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.

 */
public class Main {

    public static void main(String[] args) {
        Konverter konverter = new Konverter();

        konverter.setRsd(5000);
        konverter.setValuta(Valuta.AUD);

        System.out.printf("Sum after conversion to \"AUD\" :  %.2f",konverter.valureConverter());
        System.out.println();

        konverter.setRsd(5000);
        konverter.setValuta(Valuta.CAD);

        System.out.printf("Sum after conversion to \"CAD\" :  %.2f",konverter.valureConverter());
        System.out.println();

        konverter.setRsd(5000);
        konverter.setValuta(Valuta.GBP);

        System.out.printf("Sum after conversion to \"GBP\":  %.2f",konverter.valureConverter());
        System.out.println();

        konverter.setRsd(5000);
        konverter.setValuta(Valuta.EUR);

        System.out.printf("Sum after conversion to \"EUR\"  %.2f",konverter.valureConverter());
        System.out.println();

        konverter.setRsd(5000);
        konverter.setValuta(Valuta.RUB);

        System.out.printf("Sum after conversion to \"RUB\"  %.2f",konverter.valureConverter());
        System.out.println();

        konverter.setRsd(5000);
        konverter.setValuta(Valuta.USD);

        System.out.printf("Sum after conversion to \"USD\"  %.2f ",konverter.valureConverter());konverter.setRsd(5000);



    }
}
