import java.util.Scanner;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private String nip;
    private String dataUrodzenia;
    private String dataZatrudnienia;
    private double pensja;
    private String dzial;

    public Pracownik() {
        System.out.println("Wprowadz imie: ");
        Scanner simie = new Scanner(System.in);
        this.imie = simie.next().toString();
        System.out.println("Wprowadz nazwisko: ");
        Scanner snazwisko= new Scanner(System.in);
        this.nazwisko = snazwisko.next().toString();
        System.out.println("Wprowadz nip: ");
        Scanner snip = new Scanner(System.in);
        this.nip = snip.next().toString();
        System.out.println("Wprowadz date urodzenia: [format dd-mm-rr]");
        Scanner sdataUrodzenia= new Scanner(System.in);
        this.dataUrodzenia = sdataUrodzenia.next().toString();
        System.out.println("Wprowadz date zatrudnienia: ");
        Scanner sdataZatrudnienia = new Scanner(System.in);
        this.dataZatrudnienia = sdataZatrudnienia.next().toString();
        System.out.println("Wprowadz pensje pracownika: ");
        Scanner spensja = new Scanner(System.in);
        this.pensja = spensja.nextDouble();
        System.out.println("Do ktorego dzilau nalezy pracownik? (Wprowadz dzial: ) ");
        Scanner sdzial= new Scanner(System.in);
        this.dzial = sdzial.next().toString();
    }
    public void oPracowniku()
    {
        System.out.println("INFORMACJE O PRACOWNIKU: ");
        System.out.println("Imie: "+ imie);
        System.out.println("Nazwisko: "+ nazwisko);
        System.out.println("NIP: "+ nip);
        System.out.println("Data urodzenia: "+dataUrodzenia);
        System.out.println("Data zatrudnienia: "+dataZatrudnienia);
        System.out.println("Pensja: "+ pensja);
        System.out.println("Dzial: "+ dzial);
    }

}
