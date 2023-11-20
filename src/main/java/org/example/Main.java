package org.example;
//Веремеенко Даниил ИС-3

public class Main {
    public static void main(String[] args){
        Complex x = new Complex(2.5, 3.7);
        Complex y = new Complex(1.8, 2.2);
        Complex summa = x.add(y);
        Complex summa2 = x.sub(y);
        Complex resultOne = x.mul(y);
        Complex resultTwo = x.div(y);
        System.out.println("Сумма двух комплексных чисел: " + summa);
        System.out.println("Разность двух комплексных чисел: " + summa2);
        System.out.println("Результат умножения комплексных чисел: " + resultOne);
        System.out.println("Результат деления комплексных чисел: " + resultTwo);
        System.out.println("Модуль комплексного числа x: " + x.getModulus());
        System.out.println("Модуль комплексного числа y: " + y.getModulus());
        if (x.isEqual(y)) {
            System.out.println("Комплексные числа = ");
        } else {
            System.out.println("Комплексные числа != ");

        }

    }
}