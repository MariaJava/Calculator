package com.company;

import java.util.Scanner;

public class Calculator {
    /**
     * многострочный комментарий (блочный коммментарий)
     * новый класс
     */

    public static void main(String[] args) { // новые методы
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scn.nextInt();
        System.out.println("Введите действие на калькукуляторе (+,-,*,/)");
        String action = scn.next();
        System.out.println("Введите второе число");
        int b = scn.nextInt();

        if (action.equals("+")) {
            Plus plus = new Plus(); // class create (name class)
            plus.plusMethod(a, b);// передаю параметры (это метод к классу plus)


        } else if (action.equals("-")) {
            Minus minus = new Minus();
            minus.minusMethod(a, b);
        } else if (action.equals("/")) {
            Divide divide = new Divide();
            divide.divideMethod(a, b);
        } else {
            Muilltiply muilltiply = new Muilltiply();
            muilltiply.muiltiplyMethod(a, b);
        }

        System.out.println("Calculator"); // вывод строки на консоль (строчный комментарий)

    }

}