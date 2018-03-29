package pl.edu.ur.oopl5;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Ksiegarnia ksiazka = new Ksiegarnia();
        System.out.println("Wyswietlanie metoda wszystkich pol klasy: ");
        ksiazka.pokazDane();
        ksiazka.cena=60.0;
        System.out.println("pobieranie wartosci pol za pomoca getterow: ");
        System.out.println(ksiazka.getTytul());
        System.out.println(ksiazka.getAutor());
        System.out.println(ksiazka.getLiczba_stron());
        System.out.println(ksiazka.getCena());
    }
    
}
