import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип желаемой операции 1(Калькулятор), 2(Массив слов),3(Массив из 20 цифр) или 4(формирование подарка на НГ");
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
            System.out.println("Макс значение "+IndexOfMax);
            System.out.println("Мин значение "+IndexOfMin);
        }
        }
}
