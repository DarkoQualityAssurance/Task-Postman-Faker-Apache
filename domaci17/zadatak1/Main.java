package domaci25_05_zadatak1;

import java.util.ArrayList;

/*
1.	Napraviti apstraktnu klasu koja će da predstavlja životinju.
životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
Napraviti klase pas i mačka koje nasleđuju životinju.
 Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy” u
 zavisnosti od toga da li je promenljiva goodBoy true ili false.
 Mačka ima atribut za težinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk” u
 zavisnosti da li je težina preko 5kg.
 U obe klase implementirati toString, gde u oba slučaja se ispisuje ime i nadimak.
  U klasi mačka dodati na toString da ispisuje još da li je chonk ili nije,
   a u klasi pas da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode).
   U konkretnim klasama implementirati metodu za zvuk koji životinja pravi, za mačku da vraća string “meow” a za psa “woof”.
   I poziv te metode dodati u toString.
   U main metodi napraviti nekoliko mačaka i pasa.
   Staviti ih u listu i kroz petlju proći sve elemente, za pse ispisati “dog: “
   i dodati od psa toString a ako je mačka napisati “cat: “ i isto toString.
   Za ovo koristite instanceof.
 */
public class Main {

    public static void main(String[] args) {

        Pas pas = new Pas();
        pas.setIme("Tobby");
        pas.setNadimak("Tobisko");
        pas.setGoodBoy(true);

        Pas pas2 = new Pas();
        pas2.setIme("Aki");
        pas2.setNadimak("Akica");
        pas2.setGoodBoy(true);

        Macka macka = new Macka();
        macka.setIme("Milica");
        macka.setNadimak("Mici");
        macka.setTezina(6);

        Macka macka2 = new Macka();
        macka2.setIme("Nena");
        macka2.setNadimak("Nensi");
        macka2.setTezina(4.5);

        ArrayList<Zivotinja> listOfZivotinje = new ArrayList<>();
        listOfZivotinje.add(pas);
        listOfZivotinje.add(pas2);
        listOfZivotinje.add(macka);
        listOfZivotinje.add(macka2);

//        System.out.println(listOfZivotinje);

        for (Zivotinja zivotinja : listOfZivotinje){
           if (zivotinja instanceof Pas){
               System.out.println("DOG : " + zivotinja);
           } else if (zivotinja instanceof Macka) {
               System.out.println("CAT : " + zivotinja);
           }


        }
    }
}
