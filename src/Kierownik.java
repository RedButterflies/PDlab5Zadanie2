import java.util.Scanner;

public class Kierownik extends Pracownik{
    private int iloscPodwladnych;
    private String typKierownictwa;
    private double dodatekFunkcyjny;


    public Kierownik() {
        System.out.println("Wprowadz ilosc podwladnych: ");
        Scanner siloscPodwladnych= new Scanner(System.in);
        this.iloscPodwladnych = siloscPodwladnych.nextInt();
        System.out.println("Wprowadz typ kierownictwa: ");
        Scanner stypKierownictwa = new Scanner(System.in);
        this.typKierownictwa = stypKierownictwa.next().toString();
        System.out.println("Wprowadz dodatek funkcyjny w procentach: ");
        Scanner sdodatekFunkcyjny = new Scanner(System.in);
        this.dodatekFunkcyjny = sdodatekFunkcyjny.nextDouble();
    }

    @Override
    public void oPracowniku() {
        super.oPracowniku();
        System.out.println("INFORMACJE O PRRACOWNIKU NA STANOWISKU KIEROWNICZYM");
        System.out.println("Ilosc podwladnych: "+iloscPodwladnych);
        System.out.println("Typ kieorwnictwa: "+ typKierownictwa);
        System.out.println("Dodatek funkcyjny: "+ dodatekFunkcyjny + "%");

    }
    public void przyjeciePracownika()
    {
        System.out.println("Rozpoczeto proces przyjmowania nowego pracownika");
        Pracownik nowyPracownik= new Pracownik();
        System.out.println("Przyjeto nowego pracownika");
    }
}
