package com.company;

import java.util.Scanner;

public class Cakculator {
   /** многострочный комментарий (блочный коммментарий)
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
        if (action.equals("+")){
            System.out.println(a+b);
        }
        if (action.equals("-")){
            System.out.println(a-b);
        }
        if (action.equals("*")) {
            System.out.println(a * b);
        }
        if (action.equals("/")) {
            System.out.println(a / b);
        }



        System.out.println("Calculator"); // вывод строки на консоль (строчный комментарий)
    }

    public static void PlusMethood( ){
       Plus plus = new Plus ();
       plus.plusMethod();
    }


    public static void MinusMethood(){
        Minus minus = new Minus ();
        minus.minusMethod();
    }
    public static void DivideMethood(){
        Divide divide = new Divide ();
        divide.divideMethod();

    }
    public static void MuiltiplyMethood(){
        Muilltiply muiltiply = new Muilltiply();
        muiltiply.muiltiplyMethod();
    }
}


