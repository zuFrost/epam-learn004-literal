package com.zufrost.learn;

public class LearnMainLiteral {
    public static void main(String[] args) {
        int x = 1; // десятичный

        int y = 017; // восьмеричный

        int z1 = 0x656af; // шестнадцатиричный
        int z2 = 0X656af; // шестнадцатиричный

        int b1 = 0b1010111; // двоичный
        int b2 = 0B1010111; // двоичный

        byte b =127;

        long k = 671010001001L; //лонг

        double d = 1.555; // дабл
        double d1 = 1.; // дабл
        double d2 = .7; // дабл
        double d3 = 1.555D; // дабл
        double d4 = 1.555d; // дабл
        double d5 = 1.7e+2; // дабл
        double d6 = 1.7E+2; // дабл

        float f = 5.1f; // флоат
        float f1 = 5.1F; // флоат

        boolean flag = false;

        char ch = 48;
        char ch1 = 'A';
        char ch2 = '\t'; //всего 5 управляющих символов     Символ табуляции
        char ch3 = '\b'; //всего 5 управляющих символов     Символ возврата в тексте на один шаг назад или удаление одного символа в строке (backspace).
        char ch4 = '\n'; //всего 5 управляющих символов     Символ перехода на новую строку.
        char ch5 = '\r'; //всего 5 управляющих символов     Символ возврата каретки.
        char ch6 = '\f'; //всего 5 управляющих символов     Прогон страницы.
        char ch7 = '\255'; // аски коды
        char ch8 = '\u0000'; // юни коды
        char ch9 = '\uffff'; // юни коды

        //общий литерал для всех ссылочных типов null
        String str = null;
        String str1 = "java";
        Object ob = null;


    }
}
