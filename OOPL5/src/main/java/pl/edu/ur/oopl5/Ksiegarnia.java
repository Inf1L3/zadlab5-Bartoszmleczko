/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Bartosz
 */
public class Ksiegarnia {

    private String tytul = "Wladca Pierscieni";
    private String autor = "Tolkien";
    private int liczba_stron = 1000;
    public double cena = 50.0;

    Ksiegarnia(double cena) {
        this.cena = cena;
    }

    Ksiegarnia() {

    }

    public void pokazDane() {
        System.out.println("tytul: " + tytul);
        System.out.println("autor: " + autor);
        System.out.println("Liczba stron: " + liczba_stron);
        System.out.println("cena: " + cena);
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczba_stron() {
        return liczba_stron;
    }

    public double getCena() {
        return cena;
    }

}
