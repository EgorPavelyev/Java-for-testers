package casino;

import java.util.Random;

public final class Slot {

    public static void main(String[] args) {


        int money = Integer.parseInt(args[0]); // TODO: 2018-11-14 считать кол-во денег в виде числа


        // (true) { // TODO: 2018-11-14 проверить на совпадение

        do {


            // TODO: 2018-11-14 выдать выигрыш в случае победы
            // TODO: 2018-11-14 цикл пока не закончатся деньги
            for (int i = 0; i < 12; i++) {


                double random = Math.random();
                int usilie = (int) Math.round(random * 100);

                int[] baraban1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
                int[] baraban2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
                int[] baraban3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

                Random rand1 = new Random((long) usilie);
                baraban1[i] = rand1.nextInt();
                baraban1[i] = Math.abs(baraban1[i]) % 12;
                //вывод значения 1 барабана
                int res1 = baraban1[i];

                System.out.println(res1);

                Random rand2 = new Random((long) usilie);
                baraban2[i] = rand2.nextInt();
                baraban2[i] = Math.abs(baraban3[i]) % 12;
                //вывод значения 2 барабана
                int res2 = baraban2[i];

                System.out.println(res2);

                Random rand3 = new Random((long) usilie);
                baraban3[i] = rand3.nextInt();
                baraban3[i] = Math.abs(baraban3[i]) % 12;
                //вывод значения 1 барабана
                int res3 = baraban3[i];

                System.out.println(res3);


                if (res1 == res2) {
                    System.out.println("Win 2 barabans");
                    money = money-100;
                } else {
                    System.out.println("lose");
                }
                if (res2 == res3) {
                    System.out.println("Win 2 barabans");
                    money = money-100;
                } else {
                    System.out.println("lose");
                }
                if (res1 == res2) {
                    System.out.println("Win 2 barabans");
                    money = money-100;
                } else {
                    System.out.println("lose");
                }
                if (res1 / res2 / res3 == 1) {
                    System.out.println("Congratulations! Win 3 barabans");
                    money = money-100;
                } else {
                    System.out.println("lose");



                }
                // TODO: 2018-11-14 провернуть барабаны (все 3) и определить каждую ячейку

                               // TODO: 2018-11-14 уменьшить или увеличить money и выйти


            }
        }while (money >0);

        // TODO: 2018-11-14 проверить на наличие денег
        // TODO: 2018-11-14 выдать выигрыш в случае победы

    }
}

