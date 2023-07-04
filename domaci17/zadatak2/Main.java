package domaci25_05_zadatak2;

import java.util.ArrayList;
import java.util.List;

/*
2.	Napraviti klasu koja predstavlja računar.
Računar ima broj procesora, količinu ram memorije i količinu memorije.
 Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
 Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana
 i enum za tastaturu (da li je internacionalna ili US).
 Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB,
 memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
 Napraviti klasu mobilni telefon koji nasleđuje računar
 i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
 Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
  U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je laptop ili mobilni)
 */
public class Main {

    public static void main(String[] args) {

        MobilniTelefon mobilniTelefon = new MobilniTelefon(2,"2GB","64GB","13mpx",Mreza._3G);
        MobilniTelefon mobilniTelefon1 = new MobilniTelefon(4,"4GB","120Gb","60mpx",Mreza._4G);
        MobilniTelefon mobilniTelefon2 = new MobilniTelefon(8,"16GB","1T","100mpx",Mreza._5G);
        Laptop laptop = new Laptop(4,"8GB","500GB","14inc",Tastatura.INTERNACIONALNA);
        Laptop laptop1 = new Laptop(6,"32GB","2T","15.6inc",Tastatura.US);
        Racunar racunar = new Racunar(8,"32GB","1T");

        ArrayList<Racunar> list = new ArrayList<>();
        list.add(laptop);
        list.add(laptop1);
        list.add(mobilniTelefon);
        list.add(mobilniTelefon1);
        list.add(mobilniTelefon2);

        for (Racunar racunarProvera : list){
            if (racunarProvera instanceof Laptop){
                System.out.println(racunarProvera + "   je u klasi Laptop");
            } else if (racunarProvera instanceof MobilniTelefon) {
                System.out.println(racunarProvera + "   je u klasi MobilniTelefoni");
            }else {
                System.out.println("Nije sadrzan !");
            }
        }





    }
}
