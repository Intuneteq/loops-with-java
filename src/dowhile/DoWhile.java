/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

/**
 *
 * @author tobio
 */
public class DoWhile {

    public static void main(String[] args) {

    }

    public static void whileLoop() {
        int i = 1;

        while (i < 100) {
            System.out.println(i);
            i = i * 2;
        }
    }

    public static void doWhile() {
        int i = 1;

        do {
            System.out.println(i);
            i = i * 2;
        } while (i < 100);
    }

    public static void forLoop() {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void infiniteLoop() {
        int i = 0;
        for (;;) {
            System.out.println(i);
        }
    }

    public static void multipleVariableLoop() {
        for (int i = 0, j = 1; i < 10; i++, j = j * 2) {
            System.out.println(i);
            System.out.println(j);
        }
    }

}
