package pl.edu.ur.oopl5;


import java.util.Scanner;

public class Main {

    @SuppressWarnings("empty-statement")
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

        /*
         System.out.println("Podaj rozmiar stosu: ");
         int size = sc.nextInt();
         int looper = 1;
         Stack stack1 = new Stack(size);
         do {
         System.out.println("1.Dodaj do stosu 2.Usun ze stosu 0. Wyjdz ze stosu.");
         int check = sc.nextInt();
         switch (check) {
         case 0:
         looper = 0;
         break;
         case 1:
         stack1.push(sc.nextInt());
         break;
         case 2:
         stack1.pop();
         break;

         default:
         System.out.println("Zly numer");
         }
         } while (looper == 1);
         */
        /*  Firma concern = new Firma();
        concern.setData(0);
        concern.uploadAll();*/
        String num=sc.nextLine();
        Liczba number = new Liczba(num);
        number.convert();
        System.out.println(number.multiplying(5));
        System.out.println(number.factorial());
    }
}
