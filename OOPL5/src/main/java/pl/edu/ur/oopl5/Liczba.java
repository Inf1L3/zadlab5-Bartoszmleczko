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

    int i;
    int number;
    int[] ciphers;
    int siz;

    Liczba(int number) {
        this.number = number;
    }

    Liczba() {
        while (number > 0) {
            number = number / 10;
            i++;
        }
        this.siz = i;
    }
    

}
