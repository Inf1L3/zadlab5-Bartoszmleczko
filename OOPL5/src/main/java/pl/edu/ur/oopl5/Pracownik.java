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
public class Pracownik {

    private String firstName;
    private String secondName;
    private int age;
    private String position;

    Pracownik(String fn, String sn, String pos, int age) {
        this.firstName = fn;
        this.secondName = sn;
        this.position = pos;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pracownik{" + "Imie i nazwisko: " + firstName + " " + secondName + ", Wiek: " + age + ", Stanowisko: " + position + '}';
    }

}
