/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Bartosz
 */
public class Firma {

    private Pracownik[] worker = new Pracownik[100];
    Scanner sc = new Scanner(System.in);

    public Firma() {
        for (int i = 0; i < 100; i++) {
            this.worker[i] = new Pracownik(" ", " ", " ", 0);
        }
    }

    public void setData(int index) {
        System.out.println("Podaj imie: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String secondName = sc.nextLine();
        System.out.println("Podaj stanowisko: ");
        String position = sc.nextLine();
        System.out.println("Podaj wiek: ");
        int age = sc.nextInt();
        this.worker[index] = new Pracownik(firstName, secondName, position, age);
    }

    public void uploadAll() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". " + worker[i].toString());
        }
    }

}
