package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите дальнейшее действие: ");
        System.out.println("Если Вам необходимо воспользоваться калькулятором - введите 1;");
        System.out.println("Если Вам необходим поиск максимального элемента в массиве - введите 2;\n");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        if (choice ==1){
            System.out.print("Введите первое число:");
            double x = scanner.nextDouble();
            System.out.print("Введите второе число:");
            double y = scanner.nextDouble();
            System.out.println("Доступные операции: ");
            System.out.print("+\n-\n*\n/\n");

            System.out.print("Выберите операцию: ");
            char z = scanner.next().charAt(0);

            switch (z) {
                case '+':
                    System.out.printf(x + " + " + y + " = %.4f", (x + y));
                    break;
                case '-':
                    System.out.printf(x + " - " + y + " = %.4f", (x - y));
                    break;
                case '*':
                    System.out.printf(x + " * " + y + " = %.4f", (x * y));
                    break;
                case '/':
                    if (y == 0) {
                        System.out.println("На 0 делить нельзя");
                    } else {
                        System.out.printf(x + " / " + y + " = %.4f", (x / y));
                        break;
                    }
                default:
                    System.out.println("Неверная операция");
            }

        }
        else if (choice == 2){
            System.out.println("Введите размер массива и нажмите Enter: ");

            int x = scanner.nextInt();

            try {
                x = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            String array[] = new String[x];

            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите " + (i + 1) + "-е слово и нажмите Enter: ");
                array[i] = scanner.nextLine();
            }

            int y = 0;

            for(int i=0;i<array.length;i++){
                if(array[i].length()>y){
                    y = array[i].length();
                }
            }
            for(int i=0;i<array.length;i++){
                if(array[i].length()==y){
                    System.out.println("Слово с наибольшей длиной  " + '"' + array[i] + '"' + "  и его длина составляет " + y + " символа(ов)" );
                }
            }
        }
        else {
            System.out.println("Возможно вы ошиблись, повторите ввод.");
        }
    }
}
