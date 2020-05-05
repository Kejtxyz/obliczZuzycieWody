import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class programrozliczeniawody {

    public static void main(String[] args) throws FileNotFoundException {
        String imie;
        String nazwisko;
        int ID;
        float zimna;
        float ciepla;
        String miesiac;
//////////////////////////////////////
        // skaner wczytuje ciagi znakow, z
        // systemowego wejscia (in),klawiatura lub
        // skaner kodow kreskowych
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wprowadz imie: ");
        String podaneImie = skaner.nextLine();
        System.out.println(podaneImie+" dzieki za podanie imienia: ");
        String imie1 = podaneImie;
        System.out.println(" Wprowadz nazwisko");
        String podajNazwisko = skaner.nextLine();
        System.out.println(podajNazwisko+" dzieki za podanie naziwska ");
        System.out.println( " Wprowadz miesiac : ");
        String podajMiesiac = skaner.nextLine();
        System.out.println(" twoje id to: "); // numer id pobrany z bazy danych ,lub pozycja w tabeli
        System.out.println(" Podaj ilosc zuzytej zimnej wody: ");
        float pobranazimnawoda = skaner.nextFloat();
         if(pobranazimnawoda <1){
            System.out.println(" zuzyles mniej niz 1 metr szescienny wody ");
        }
        System.out.println(" Podaj ilosc zuzytej cieplej wody ");
         float pobranacieplawoda = skaner.nextFloat();
         if(pobranacieplawoda<1){
             System.out.println(" zuzyles mniej niz 1 meter szescienny cieplej wody ");
         }
         float razemIloscZuzytejWody = pobranacieplawoda+pobranazimnawoda;
        String podsumowanieZuzyciaWody1 = podaneImie +" "+ podajNazwisko+ " zuzyles razem cieplej i zimnej wody zuzyles  : "+razemIloscZuzytejWody +" w miesiacu " +podajMiesiac;
         System.out.println(podaneImie +" "+ podajNazwisko+ " zuzyles razem cieplej i zimnej wody, razem  zuzyles  : "+razemIloscZuzytejWody +" w miesiacu " +podajMiesiac);
        // zapisz do pliku wartosci
        PrintWriter zapis = new PrintWriter("zapis.txt");
        zapis.println(" Zuzycie w 1 miesiacu przez 1 osobe: "+ podsumowanieZuzyciaWody1);
          zapis.close();

    }
}
