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
public class Stack {

    private int size;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        top = -1;
    }

    public void push(int s) {
        if (top < (size - 1)) {
            stack[++top] = s;
        } else {
            System.out.println("Stos pelny");
        }

    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stos pusty");
        } else {
            System.out.println(stack[top--]);
        }
    }

    public int peek() {
        return stack[top];
    }

}
