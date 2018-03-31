package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Scanner sc = new Scanner(System.in);
        /* Ksiegarnia ksiazka = new Ksiegarnia();
         System.out.println("Wyswietlanie metoda wszystkich pol klasy: ");
         ksiazka.pokazDane();
         ksiazka.cena=60.0;
         System.out.println("pobieranie wartosci pol za pomoca getterow: ");
         System.out.println(ksiazka.getTytul());
         System.out.println(ksiazka.getAutor());
         System.out.println(ksiazka.getLiczba_stron());
         System.out.println(ksiazka.getCena());*/
        System.out.println("Podaj rozmiar stosu: ");
        int size = sc.nextInt();
        int elem;
        Stack stack1 = new Stack(size);
        System.out.println("1.Dodaj do stosu 2.Usun ze stosu 3. Pokaz stos.");
        int check = sc.nextInt();
        switch (check) {
            case 1:
                stack1.push();
                break;
            case 2:
                stack1.pop();
                break;
            case 3:
                stack1.showStack();
                break;
            case 4: stack1.showSize();break;
            default:
                System.out.println("Zly numer");
        }
    }

}
