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
public class Stack {

    public int size = 0;

    Stack(int size) {
        this.size = size;
    }
    int[] stack = new int[size];
    int i = 0;
    Scanner sc = new Scanner(System.in);

    public void push() {
        int elem = sc.nextInt();
        if (i < size ) {
            stack[i] = elem;
            i++;
            System.out.println("Element dodany");
        } else {
            System.out.println("Stos pelny.");
        }
    }

    public void pop() {
        if (i == 0) {
            System.out.println("Stos pusty.");
        } else {
            System.out.println(stack[i]);
            i--;
        }
    }

    public void showStack() {
        int j = 0;
        if (i == 0) {
            System.out.println("Stos pusty.");
        } else {
            System.out.println("Stos posiada " + (j + 1) + "elementow.");
            for (j = i; j >= 0; j--) {

                System.out.println(stack[j]);
            }
        }
    }
    public void showSize(){
        System.out.println(size);
    }

}
