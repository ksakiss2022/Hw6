import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//
        int[] day = new int[30];
        day[0] = 100_000;
        day[1] = 150_000;
        day[2] = 100_300;
        day[3] = 120_000;
        day[4] = 140_000;
        day[5] = 168_000;
        day[6] = 180_100;
        day[7] = 200_000;
        day[8] = 200_100;
        day[9] = 135_000;
        day[10] = 129_000;
        day[11] = 222_000;
        day[12] = 112_000;
        day[13] = 109_000;
        day[14] = 200_300;
        day[15] = 100_110;
        day[16] = 100_020;
        day[17] = 200_000;
        day[18] = 199_000;
        day[19] = 198_000;
        day[20] = 197_000;
        day[21] = 176_000;
        day[22] = 100_045;
        day[23] = 100_039;
        day[24] = 100_200;
        day[25] = 100_211;
        day[26] = 120_000;
        day[27] = 152_000;
        day[28] = 145_000;
        day[29] = 176_000;


        // task 1

        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».


        double sum2 = Arrays.stream(day).sum();
        System.out.println("Сумма трат за месяц составила = " + sum2 + " рублей");

        // task 2

        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат
        // за день составила … рублей».
// var nums = new int[]{1, 4, -2, 3};
//    var min = nums[0];
//    for (int num : nums) {
//        if (num < min) {
//            min = num;
//        }
//    }
//    System.out.println(min);

        int min = day[0];
        for (int dayMin : day) {
            if (dayMin < min) {
                min = dayMin;
            }
        }
        int max = day[0];
        for (int dayMax : day) {
            if (dayMax > max) {
                max = dayMax;

            }
        }
        System.out.println("Минимальная сумма трат за день составила= " + min + " рублей. " + "Максимальная сумма трат= "
                + max + " рублей.");

        // task 3
        // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат
        // за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат
        // за месяц составила … рублей».
        //**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).

        // int sum2 = Arrays.stream(day).sum();
        //System.out.println("Сумма трат за месяц составила = " + sum2 + " рублей");
        double avaregeCoastAmount = sum2 / day.length;
        System.out.println("Средняя сумма трат за месяц составила= " + avaregeCoastAmount + " рублей");

        // task 4

        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i2 = reverseFullName.length-1; i2 >= 0; i2--) {

            System.out.print(reverseFullName[i2]);

        }
    }
}


