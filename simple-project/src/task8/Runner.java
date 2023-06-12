package task8;

//Каждая буква алфавита имеет свое весовое значение в зависимости от ее позиции: a = 1, b = 2, c = 3, ...
//
//        Напишите функцию `String getHighestScoringWord(String str)`, которая возвращает слово с наибольшим весовым коэффициентом.
//        Если присутствует несколько слов с одним весовым коэффициентом необходимо вернуть первое слово, которое присутствует во входной строке.
//        * предложения в нижнем регистре
//
//        `getHighestScoringWord("man i need a taxi up to ubud") -> "taxi"`
//
//        `getHighestScoringWord("what time are

//найти все числа в диапозоне от 0 до 1000 которые деляться без оcтатка на 3 и не деляться на 5, при этом сумма цифр числа должна быть меньше 10

//Риски:
//        Даны два массива уникальных int с одинаковым размером. Написать алгоритм, который показывает, что массивы одинаковы(обсудить разные варианты)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Runner {

    public static void main(String[] args) {
        System.out.println(getHighestScoringWord("man i need a taxi up to ubud"));
        System.out.println(getHighestScoringWord("what time are"));

    }

    static String getHighestScoringWord(String str) {
        String[] strArr = str.split(" ");
//        char max = 0;
//        String highest = "";
//        for (String s : strArr) {
//            char total = 0;
//            char[] charArray = s.toCharArray();
//            for (char ch :
//                    charArray) {
//                total += ch;
//            }
//            if (total > max) {
//                max = total;
//                highest = new String(charArray);
//            }
//        }


        return Arrays.stream(strArr)
                .reduce((s1, s2) -> s1.chars().sum() > s2.chars().sum() ? s1 : s2)
                .orElse("");
    }

//    static List<Integer> find(List<Integer> range) {
//        range.stream()
//                .filter(i -> i % 3 == 0)
//    }

    static boolean arrEq(int[]) {

    }
}
