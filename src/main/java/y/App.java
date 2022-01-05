package y;

// Часть первая - задание 7 - Создайте массив из 8 случайных целых чисел...

import java.util.Arrays;

public class App {
    public static void main(String[]args){
       /* int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11)-1;


            if (array[i]%2 != 0){
                array[i] = 0;
            }
            System.out.print(array[i] + "  ");*/


        int [] array1 = new int[4];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 90) + 10;
        }


        for (int i = 1; i < array1.length; i++){
        if(array1[i]<=array1[i-1]){
            System.out.println("Массив не является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив является строго возрастающей последовательностью");
        }
    }

        System.out.println(Arrays.toString(array1));

        }
    }

    

