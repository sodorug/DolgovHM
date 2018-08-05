import oopCalc.*;
import podarki.Present;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип желаемой операции 1(Калькулятор), 2(Массив слов),3(Массив из 20 цифр) или 4(формирование подарка на НГ) или 5(ООП Калькулятор)");
        String type = scan.next();
        if(type.startsWith("1"))
        {
            System.out.println("Вы выбрали Калькулятор");
            System.out.println("Введите первое число");
            double first = scan.nextDouble();
            System.out.println("Вы ввели число " + first);
            System.out.println("Введите второе число число");
            double second = scan.nextDouble();
            System.out.println("Вы ввели число " + second);
            System.out.println("Выберите тип выполняемой операции + - * /");
            double sum;
            String operation = scan.next();
            if (operation.startsWith("+")) {
                sum = first + second;
                System.out.println("Сумма значений ");
                System.out.printf("%.4f", +sum);
            } else if (operation.startsWith("-")) {
                sum = first - second;
                System.out.println("Произведение чисел равна ");
                System.out.printf("%.4f", +sum);
            } else if (operation.startsWith("*")) {
                sum = first * second;
                System.out.println("Произведение чисел равна ");
                System.out.printf("%.4f", +sum);
            } else if (operation.startsWith("/")) {
                sum = first / second;
                System.out.println("Отношение чисел равна ");
                System.out.printf("%.4f", +sum);
            }
        }
        else  if(type.startsWith("2"))
        {
            System.out.println("Вы выбрали массив слов, введите разменость массива");
            int size = scan.nextInt();
            String MaxWord = null;
            int WordLen = 0;
            String[] Slova = new String[size];
            System.out.println("Заполните массив значениями");
            for (int i = 0; i<size;i++)  {
                Slova[i]= scan.next();
                if(Slova[i].length()>WordLen){
                    MaxWord = Slova[i];
                    WordLen = Slova[i].length(); }
                }
            System.out.println(MaxWord); }
        else if(type.startsWith("3")){
            System.out.println("Вы выбрали массив из 20 символов");
            int Big20[];
            Big20 = new int[20];
            int IndexOfMax = 0;
            int IndexOfMin = 0;
            for (int i =0;i<Big20.length;i++){
                Big20[i]=((int)(Math.random()*20)-10);
                if(Big20[i]>IndexOfMax) IndexOfMax = Big20[i];
                    else if (Big20[i]<IndexOfMin){
                        IndexOfMin=Big20[i]; } }
            IndexOfMax=IndexOfMin+IndexOfMax;
            IndexOfMin=IndexOfMax-IndexOfMin;
            IndexOfMax=IndexOfMax-IndexOfMin;
            System.out.println("Макс значение "+IndexOfMax);
            System.out.println("Мин значение "+IndexOfMin);
        }
        else if(type.startsWith("4")){
            /*
            Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
             У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
             Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
             */
            System.out.println("Вы выбрали формирование подарка на новый год");/*
            int swSize = 4;
            int swWeight = 0;
            int swPrice = 0;

            podarki.Sweety[] sweeties = new podarki.Sweety[swSize];
            sweeties[0] = new podarki.Sweety("Конфета1", 11, 101, "Хамстер1");
            sweeties[1] = new podarki.Sweety("Конфета2", 12, 102, "Хамстер2");
            sweeties[2] = new podarki.Sweety("Конфета3", 13, 103, "Хамстер3");
            sweeties[3] = new podarki.Sweety("Конфета4", 14, 104, "Хамстер4");

            for (int i = 0; i<swSize;i++) {
                swWeight = swWeight + sweeties[i].weight;
                swPrice = swPrice + sweeties[i].price;
            }

            System.out.println("Общий вес: " + swWeight);
            System.out.println("Общая цена: " + swPrice);
            System.out.println("Состав подарка: ");
            for (int i = 0; i<swSize;i++) {
                sweeties[i].printInfo();
            }*/

            Present podarok = new Present();
            System.out.println("Общий вес: " + podarok.getWeight());
            System.out.println("Общая цена: " + podarok.getPrice());
            podarok.printAll();
        }
        else  if(type.startsWith("5")){
            System.out.println("Вы выбрали ООП калькулятор");
            System.out.println("Введите первое число");
            int a = scan.nextInt();
            System.out.println("Введите второе число");
            int b = scan.nextInt();
            System.out.println("Введите тип операции + - / *");
            String operation = scan.next();

            CalcIt oper = null;
            if ("+".equals(operation)) {
                oper = new Summ();
            } else if ("-".equals(operation)) {
                oper = new Minus();
            } else if ("/".equals(operation)) {
                oper = new Delen();
            } else if ("*".equals(operation)) {
                oper = new Umnoj();
            } else {
                System.out.println("Введена неподдерживаемая операция " + operation);
            }

            if (oper != null) {
                System.out.println("результата операции " + oper.calc(a, b));
            }
        }
        }
}
