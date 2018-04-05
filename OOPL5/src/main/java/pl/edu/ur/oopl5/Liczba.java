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
public class Liczba {

    private String number;
    private final int[] ciphers;

    public Liczba(String number) {

        this.number = number;
        this.ciphers = new int[number.length()];
    }

    public int[] convert() {

        char[] tab = this.number.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            this.ciphers[i] = (int) tab[i] - 48;
        }
        return ciphers;
    }

    public int multiplying(int multip) {
        int x = 1;
        int result = 0;

        for (int i = ciphers.length - 1; i >= 0; i--) {
            result = result + (ciphers[i] * x * multip);
            x *= 10;
        }

        return result;
    }

    public void showNumberArray() {
        for (int i = 0; i < this.ciphers.length; i++) {
            System.out.println(ciphers[i]);
        }

    }

    public int factorial() {
        int fact = 1;
        int e = 0;
        int x = 1;
        for (int i = 0; i < ciphers.length; i++) {
            e += ciphers[i] * x;
            x *= 10;
        }

        for (int i = 1; i <= e; i++) {
            fact *= i;
        }

        return fact;
    }
}